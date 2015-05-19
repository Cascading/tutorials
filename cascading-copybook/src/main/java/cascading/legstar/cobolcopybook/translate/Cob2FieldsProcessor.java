package cascading.legstar.cobolcopybook.translate;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import javax.xml.namespace.QName;

import cascading.tuple.Fields;
import com.legstar.coxb.CobolMarkup;
import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaAnnotation;
import org.apache.ws.commons.schema.XmlSchemaAppInfo;
import org.apache.ws.commons.schema.XmlSchemaComplexType;
import org.apache.ws.commons.schema.XmlSchemaElement;
import org.apache.ws.commons.schema.XmlSchemaSimpleType;
import org.apache.ws.commons.schema.XmlSchemaSimpleTypeRestriction;
import org.apache.ws.commons.schema.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Produces cascading {@link cascading.tuple.Fields} using a COBOL-annotated XML schema.
 * <p/>
 * Meant to work with an {@link Cob2FieldsVisitor} which guarantees that items
 * are visited in the correct order.
 * <p/>
 * Extracts the COBOL annotations and create Fields elements.
 */
public class Cob2FieldsProcessor
  {

  /**
   * An ordered list of field names produced.
   */
  private final List<String> fieldNames = new LinkedList<String>();

  /**
   * An ordered list of field types produced.
   */
  private final List<Type> fieldTypes = new LinkedList<Type>();

  /**
   * Logger.
   */
  private static Logger log = LoggerFactory.getLogger( Cob2FieldsProcessor.class );

  /**
   * For elements with COBOL annotations produce a cascading Fields field.
   *
   * @param schema     the COBOL-annotated XML schema
   * @param xsdElement the XML schema element
   * @param level      the current depth
   * @param label      to use as the field name for this element
   * @throws Cob2FieldsException if cascading Fields field cannot be produced
   */
  public void processElement( final XmlSchema schema, final XmlSchemaElement xsdElement, final int level, final String label ) throws Cob2FieldsException
    {

    XmlSchemaAnnotation annotation = xsdElement.getAnnotation();
    if( annotation != null && annotation.getItems().getCount() > 0 )
      {
      XmlSchemaAppInfo appinfo = (XmlSchemaAppInfo) annotation.getItems().getItem( 0 );
      if( appinfo.getMarkup() != null )
        {
        for( int i = 0; i < appinfo.getMarkup().getLength(); i++ )
          {
          Node node = appinfo.getMarkup().item( i );
          if( node instanceof Element && node.getLocalName().equals( CobolMarkup.ELEMENT ) && node.getNamespaceURI().equals( CobolMarkup.NS ) )
            {
            writeElement( xsdElement, (Element) node, level, label );
            }
          }
        }
      }

    }

  /**
   * Create a cascading Fields field using the XML schema and COBOL
   * annotations.
   * <p/>
   * Only elementary items translate to field, effectively resulting in
   * flattening the COBOL structure.
   * <p/>
   * Arrays are expanded into the maximum number of items. We are assuming
   * cascading fields are not dynamic and don't support arrays hence there is
   * no way we can support DEPENDING ON.
   *
   * @param xsdElement the XML schema element
   * @param elc        the COBOL annotations as a set of DOM attributes
   * @param level      the depth in the hierarchy
   * @param label      to use as the field name for this element
   */
  protected void writeElement( final XmlSchemaElement xsdElement, final Element elc, final int level, final String label )
    {

    if( xsdElement.getSchemaType() instanceof XmlSchemaSimpleType )
      {

      fieldNames.add( label );

      XmlSchemaSimpleType xsdType = (XmlSchemaSimpleType) xsdElement.getSchemaType();
      Type javaType = getJavaType( xsdType );
      fieldTypes.add( javaType );

      log.debug( "Produced: {} of type {} ", label, javaType );
      }
    }

  /**
   * Derive a Java Type from the XSD Type.
   * <p/>
   * The list is not exhaustive and is limited to the types cob2xsd is capable
   * of producing.
   *
   * @param xsdType an XML schema Type or null if none can be derived
   * @return a java Type name or null if none can be derived
   */
  public Type getJavaType( final XmlSchemaSimpleType xsdType )
    {
    XmlSchemaSimpleTypeRestriction restriction = (XmlSchemaSimpleTypeRestriction) xsdType.getContent();
    if( restriction != null && restriction.getBaseTypeName() != null )
      {
      QName xsdTypeName = restriction.getBaseTypeName();
      if( xsdTypeName.equals( Constants.XSD_STRING ) )
        {
        return String.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_INT ) )
        {
        return int.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_LONG ) )
        {
        return long.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_SHORT ) )
        {
        return short.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_DECIMAL ) )
        {
        return java.math.BigDecimal.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_FLOAT ) )
        {
        return float.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_DOUBLE ) )
        {
        return double.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_HEXBIN ) )
        {
        return byte[].class;
        }
      else if( xsdTypeName.equals( Constants.XSD_UNSIGNEDINT ) )
        {
        return long.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_UNSIGNEDSHORT ) )
        {
        return int.class;
        }
      else if( xsdTypeName.equals( Constants.XSD_UNSIGNEDLONG ) )
        {
        return long.class;
        }
      else
        {
        log.warn( "Unable to derive java type from " + xsdTypeName.getLocalPart() );
        }

      }
    else
      {
      log.warn( "Simple type without restriction " + xsdType.getName() );
      }
    return null;

    }

  /**
   * Process a complex type.
   *
   * @param schema         the COBOL-annotated XML schema
   * @param xsdComplexType the XML schema complex type
   * @param level          the current depth
   * @param prefix         a prefix to prepend to element names
   * @param suffix         a suffix to append to element names
   * @throws XsdMappingException
   * @throws Cob2FieldsException if cascading Fields field cannot be produced
   */
  public void processComplexType( XmlSchema schema, XmlSchemaComplexType xsdComplexType, int level, final String prefix, final String suffix ) throws Cob2FieldsException
    {

    }

  /**
   * @return the cascading Fields produced
   */
  public Fields getFields()
    {
    return new Fields( fieldNames.toArray( new String[ fieldNames.size() ] ), fieldTypes.toArray( new Type[ fieldTypes.size() ] ) );
    }

  }
