package cascading.legstar.cobolcopybook.translate;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cascading.tuple.Fields;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generates the Cascading Fields classes.
 * <p/>
 * Uses a simple <a
 * href="https://github.com/jknack/handlebars.java">handlebars</a> template at
 * this stage.
 */
public class Cob2FieldsGenerator
  {

  public static final String FIELDS_JAVA_TEMPLATE_NAME = "fields.java.template";

  private static Logger log = LoggerFactory.getLogger( Cob2FieldsGenerator.class );

  private final Template hbtFieldsJava;

  public Cob2FieldsGenerator()
    {
    try
      {
      URL url = Resources.getResource( getClass(), FIELDS_JAVA_TEMPLATE_NAME );
      String text = Resources.toString( url, Charsets.UTF_8 );
      Handlebars handlebars = new Handlebars();
      hbtFieldsJava = handlebars.compileInline( text );
      }
    catch( IOException e )
      {
      throw new RuntimeException( e );
      }
    }

  public void generate( File xsdInput, File outputDir, String packageName )
    {

    try
      {
      FileUtils.forceMkdir( outputDir );

      Cob2Fields cob2Fields = new Cob2Fields();
      Map<String, Fields> mapFields = cob2Fields.translate( xsdInput );
      for( Entry<String, Fields> entry : mapFields.entrySet() )
        {

        // Build a model
        String className = CaseFormat.LOWER_UNDERSCORE.to( CaseFormat.UPPER_CAMEL, entry.getKey() );
        List<String> fieldNames = Lists.newLinkedList();
        List<String> fieldTypes = Lists.newLinkedList();
        Fields fields = entry.getValue();
        for( int i = 0; i < fields.size(); i++ )
          {
          fieldNames.add( (String) fields.get( i ) );
          fieldTypes.add( toString( fields.getType( i ) ) );
          }

        // Apply template
        Map<String, Object> model = Maps.newHashMap();
        model.put( "package_name", packageName );
        model.put( "class_name", className );
        model.put( "field_names", fieldNames );
        model.put( "field_types", fieldTypes );
        String content = hbtFieldsJava.apply( model );

        // Write source file
        FileUtils.writeStringToFile( new File( outputDir, packageName.replace( ".", File.separator ) + File.separator + className + ".java" ), content );
        }

      }
    catch( IOException e )
      {
      log.error( "Generation failed for input " + xsdInput.getName(), e );
      }

    }

  /**
   * String the class prefix for objects.
   *
   * @param type a java type
   * @return a string usable to declare variables of this type
   */
  private String toString( Type type )
    {
    String s = type.toString();
    if( s.startsWith( "class " ) )
      {
      return s.substring( "class ".length() );
      }
    else
      {
      return s;
      }
    }

  }
