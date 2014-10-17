package cascading.legstar.cobolcopybook.translate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cascading.tuple.Fields;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Translates COBOL structures to flat cascading fields collections.
 *
 */
public class Cob2Fields {

    private static final String LEGSTAR_XSD_FILE_ENCODING = "UTF-8";

    private static Logger log = LoggerFactory.getLogger(Cob2Fields.class);

    /**
     * Translate a legstar generated xsd file (with COBOL annotations) to a set
     * of fields collections.
     * <p/>
     * If a folder is passed rather than a single file then all xsd files from
     * that folder are translated.
     *
     * @param xsdInput a single xsd file or a folder containing xsd files
     * @return for each xsd file translated, the cascading collection of fields
     * @throws java.io.IOException if translation fails
     */
    public Map < String, Fields > translate(File xsdInput) throws IOException {

        log.info("COBOL to Fields translator started");
        Map < String, Fields > mapFields = new HashMap < String, Fields >();

        if (!xsdInput.exists()) {
            throw new IOException("Specified input '" + xsdInput.getName()
                    + "' does not exist");
        }

        log.info("Reading legstar xsd files from " + xsdInput.getName());

        if (xsdInput.isDirectory()) {
            Collection < File > xsdFiles = FileUtils.listFiles(xsdInput,
                    new String[] { "xsd" }, true);
            for (File xsdFile : xsdFiles) {
                translate(xsdFile, mapFields);
            }
        } else {
            translate(xsdInput, mapFields);
        }

        log.info("COBOL to Fields translator ended");
        return mapFields;
    }

    private void translate(File xsdFile, Map < String, Fields > mapFields)
            throws IOException {
        String xsdFileName = FilenameUtils.getBaseName(xsdFile.getName());
        Fields fields = translate(new InputStreamReader(new FileInputStream(
                xsdFile), LEGSTAR_XSD_FILE_ENCODING));
        mapFields.put(xsdFileName, fields);
        log.info("LegStar xsd {} translated to Fields {}", xsdFileName,
                fields.toString());
    }

    public Fields translate(Reader reader) throws Cob2FieldsException {
        XmlSchemaCollection schemaCol = new XmlSchemaCollection();
        XmlSchema xsd = schemaCol.read(reader, null);
        Cob2FieldsVisitor visitor = new Cob2FieldsVisitor(xsd,
                new Cob2FieldsProcessor());
        visitor.visit();
        return visitor.getFields();
    }

}
