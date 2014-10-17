package cascading.legstar.cobolcopybook.translate;

import javax.xml.namespace.QName;

import cascading.tuple.Fields;
import com.legstar.coxb.util.NameUtil;
import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaAll;
import org.apache.ws.commons.schema.XmlSchemaChoice;
import org.apache.ws.commons.schema.XmlSchemaComplexType;
import org.apache.ws.commons.schema.XmlSchemaElement;
import org.apache.ws.commons.schema.XmlSchemaGroup;
import org.apache.ws.commons.schema.XmlSchemaGroupRef;
import org.apache.ws.commons.schema.XmlSchemaObject;
import org.apache.ws.commons.schema.XmlSchemaObjectCollection;
import org.apache.ws.commons.schema.XmlSchemaParticle;
import org.apache.ws.commons.schema.XmlSchemaSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A special version of an XSD navigator that will process array occurrences.
 * This is needed when each occurrence of an array must produce a different
 * output.
 *
 */
public class Cob2FieldsVisitor {

    /** Logging. */
	private static Logger log = LoggerFactory.getLogger(Cob2FieldsVisitor.class);

    /** Used to tag columns which belong to choices (REDEFINES). */
    public static final String CHOICE_PREFIX_FORMAT = "[choice:%s_%s]";

    /** How much to increment the level number when going down a hierarchy. */
    public static final int LEVEL_INCREMENT = 2;

    /** The XML schema with COBOL annotations. */
    private final XmlSchema schema;

    /** Individual elements processor */
    private final Cob2FieldsProcessor processor;

    private final Cob2FieldsNames names = new Cob2FieldsNames();

    public Cob2FieldsVisitor(XmlSchema schema, Cob2FieldsProcessor processor) {
        this.schema = schema;
        this.processor = processor;
    }

    /**
     * Process each element in the input Schema.
     * <p/>
     * Use root elements (as opposed to named complex types) to drive the
     * process because we need to reconstruct a hierarchy of complex types.
     * Elements give us the roots to start from.
     *
     */
    public void visit() throws Cob2FieldsException {

    	log.debug("visit XML Schema started");

        processCollectionElements(schema.getItems(), 1, "", "");

        log.debug("visit XML Schema ended");
    }

    /**
     * Take all elements from a collection and process them.
     * <p/>
     * Choice elements are a special where we insert a marker on all elements
     * derived from an alternative. This will help us create multiple schemas
     * later.
     *
     * @param items the parent collection
     * @param level the current level in the elements hierarchy.
     * @param prefix a prefix to prepend to element names
     * @param suffix a suffix to append to element names
     * @throws Cob2FieldsException if processing fails
     */
    protected void processCollectionElements(
            final XmlSchemaObjectCollection items, final int level,
            final String prefix, final String suffix)
            throws Cob2FieldsException {

        /* Process each element in the collection */
        for (int i = 0; i < items.getCount(); i++) {
            XmlSchemaObject element = items.getItem(i);
            if (element instanceof XmlSchemaElement) {
                processElement((XmlSchemaElement) element, level, prefix,
                        suffix);
            } else if (element instanceof XmlSchemaGroupRef) {
                /* This is a reference to a group so we fetch the group */
                XmlSchemaGroupRef groupRef = (XmlSchemaGroupRef) element;
                XmlSchemaGroup group = (XmlSchemaGroup) schema.getGroups()
                        .getItem(groupRef.getRefName());
                processParticle(group.getName(), group.getParticle(), level,
                        prefix, suffix);
            } else if (element instanceof XmlSchemaChoice) {
                XmlSchemaChoice choice = (XmlSchemaChoice) element;
                XmlSchemaObjectCollection alternatives = choice.getItems();
                String firstAlternativeName = null;

                for (int j = 0; j < alternatives.getCount(); j++) {
                    XmlSchemaObject alternative = alternatives.getItem(j);
                    if (alternative instanceof XmlSchemaElement) {
                        String alternativeName = getJaxbName(((XmlSchemaElement) alternative)
                                .getName());
                        if (firstAlternativeName == null) {
                            firstAlternativeName = alternativeName;
                        }
                        String newPrefix = prefix
                                + String.format(CHOICE_PREFIX_FORMAT,
                                        firstAlternativeName, alternativeName);
                        processElement((XmlSchemaElement) alternative, level,
                                newPrefix, suffix);
                    }
                }
            }

        }
    }

    /**
     * Process an XML schema element.
     *
     * @param xsdElement the XML Schema element to process
     * @param level the current level in the elements hierarchy.
     * @param prefix a prefix to prepend to element names
     * @param suffix a suffix to append to element names
     * @throws Cob2FieldsException if processing fails
     */
    public void processElement(final XmlSchemaElement xsdElement,
            final int level, final String prefix, final String suffix)
            throws Cob2FieldsException {
        /*
         * If this element is referencing another, it might not be useful to
         * process it.
         */
        if (xsdElement.getRefName() != null) {
            return;
        }
        log.debug("process started for element = " + xsdElement.getName());

        /*
         * If this element is of a complex type, we process its children.
         */
        if (xsdElement.getSchemaType() instanceof XmlSchemaComplexType) {
            XmlSchemaComplexType xsdComplexType = (XmlSchemaComplexType) xsdElement
                    .getSchemaType();

            String prevPrefix = names.upHierarchy(getJaxbName(xsdElement.getName()));

            /* Process occurrences */
            if (xsdElement.getMaxOccurs() > 1) {
                for (int i = 0; i < xsdElement.getMaxOccurs(); i++) {
                    String newSuffix = suffix + "_" + Integer.toString(i);
                    getProcessor().processElement(schema, xsdElement, level,
                            prefix + getLabel(xsdElement, newSuffix));
                    processComplexType(xsdComplexType, level, prefix, newSuffix);
                }
            } else {
                getProcessor().processElement(schema, xsdElement, level,
                        prefix + getLabel(xsdElement, suffix));
                processComplexType(xsdComplexType, level, prefix, suffix);
            }

            names.setHierarchy(prevPrefix);

        } else {
            /* Process occurrences */
            if (xsdElement.getMaxOccurs() > 1) {
                for (int i = 0; i < xsdElement.getMaxOccurs(); i++) {
                    String newSuffix = suffix + "_" + Integer.toString(i);
                    getProcessor().processElement(schema, xsdElement, level,
                            prefix + getLabel(xsdElement, newSuffix));
                }
            } else {
                getProcessor().processElement(schema, xsdElement, level,
                        prefix + getLabel(xsdElement, suffix));
            }
        }

        log.debug("process ended for element = " + xsdElement.getName());
    }

    /**
     * Process an XML schema complex type.
     *
     * @param xsdComplexType the XML Schema type to process
     * @param level the current level in the elements hierarchy.
     * @param prefix a prefix to prepend to element names
     * @param suffix a suffix to append to element names
     * @throws Cob2FieldsException if processing fails
     */
    public void processComplexType(final XmlSchemaComplexType xsdComplexType,
            final int level, final String prefix, final String suffix)
            throws Cob2FieldsException {

    	log.debug("process started for complex type = "
                + xsdComplexType.getName());

        /* Delegate processing of XML schema complex type */
        getProcessor().processComplexType(schema, xsdComplexType, level,
                prefix, suffix);

        /* Complex types might have particles such as sequence and all */
        XmlSchemaParticle particle = xsdComplexType.getParticle();
        processParticle(xsdComplexType.getQName(), particle, level
                + LEVEL_INCREMENT, prefix, suffix);

        log.debug("process ended for complex type = "
                + xsdComplexType.getName());
    }

    /**
     * A particle is usually all or sequence. It contains a collection of other
     * schema objects that need to be processed.
     *
     * @param parentName the name of the parent schema object for logging
     * @param particle the particle schema object
     * @param level the current level in the elements hierarchy.
     * @param prefix a prefix to prepend to element names
     * @param suffix a suffix to append to element names
     * @throws Cob2FieldsException if processing fails
     */
    public void processParticle(final QName parentName,
            final XmlSchemaParticle particle, final int level,
            final String prefix, final String suffix)
            throws Cob2FieldsException {

        if (particle == null) {
            log.warn("Schema object " + parentName
                    + " does not contain a particle");
            return;
        }

        if (particle.getMaxOccurs() > 1) {
            /* TODO find a way to handle occuring sequences and alls */
        	log.warn("Schema object " + parentName
                    + " contains a multi-occurence particle that is ignored");
        }

        if (particle instanceof XmlSchemaSequence) {
            XmlSchemaSequence sequence = (XmlSchemaSequence) particle;
            processCollectionElements(sequence.getItems(), level, prefix,
                    suffix);

        } else if (particle instanceof XmlSchemaAll) {
            XmlSchemaAll all = (XmlSchemaAll) particle;
            processCollectionElements(all.getItems(), level, prefix, suffix);
        } else {
            /* TODO process other particle types of interest */
            /* TODO find a way to handle xsd:attribute */
        	log.warn("Schema object " + parentName
                    + " does not contain a sequence or all element");
        }

    }

    /**
     * Get a unique name for a TOS column including item rank for arrays.
     *
     * @param xsdElement the COBOL-annotated XML schema element name.
     * @param suffix the suffix including array ranks (possibly multiple
     *        indices)
     * @return a unique column name
     */
    public String getLabel(final XmlSchemaElement xsdElement,
            final String suffix) {
        return uniqueName(getJaxbName(xsdElement.getName()) + suffix);
    }

    /**
     * Creates a unique name based on a proposed name.
     * <p/>
     * The proposed name is as simple as possible but we need to avoid any name
     * conflicts (a column must have a unique name) so we check for any conflict
     * and use a prefix system to disambiguate names.
     *
     * @param proposedName the proposed name
     * @return a unique name for a column
     */
    public String uniqueName(final String proposedName) {
        return names.getUniqueName(proposedName);
    }

    /**
     * In order to ease code generation within TOS, it is convenient to have a
     * label that directly gives the corresponding JAXB getter name like so:
     * get("<%=column.getLabel()%>")
     *
     * @return a label that can be used as a JAXB getter
     */
    public String getJaxbName(final String elementName) {
        return NameUtil.toClassName(elementName);
    }

    /**
     * @return XML schema with COBOL annotations
     */
    public XmlSchema getSchema() {
        return schema;
    }

    /**
     * @return individual elements processor
     */
    public Cob2FieldsProcessor getProcessor() {
        return processor;
    }

    /**
     * @return the cascading Fields produced
     */
    public Fields getFields() {
        return getProcessor().getFields();
    }

}
