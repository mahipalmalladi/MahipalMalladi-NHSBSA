package envReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/** This class is to read data form the env.properties file
  * To get a value of the property, call the method getProperty
  * with the name of the property as parameter
  **/

public class EnvReader
{

    public static Properties pro;

    public static Properties getProperties() throws IOException
    {
        File propsFile = new File("src/main/resources/env.properties");

        FileInputStream inputStream = new FileInputStream(propsFile);

        pro = new Properties();

        pro.load(inputStream);

        inputStream.close();

        return pro;
    }

    public static String getProperty(String key) throws IOException
    {
        return getProperties().getProperty(key);
    }
}
