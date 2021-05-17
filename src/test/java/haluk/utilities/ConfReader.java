package haluk.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfReader {
    public static Properties properties=new Properties();
    static {
        String confPath = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(confPath);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("properties file is not found");
    }
    public static String getProperties(String key){
        return properties.getProperty(key);
    }
}
