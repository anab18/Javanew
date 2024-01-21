package Class25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1FileHandling {
    public static void main(String[] args) throws IOException {
        //A vriable to hold a the location for the file
        String path="C:\\Users\\anabo\\IdeaProjects\\Javanew\\Files\\Config.properties";
        // Navigate to this location
        FileInputStream fis=new FileInputStream(path);
//This is the special class that knows how to read/write date from properties file
        Properties properties=new Properties();
        properties.load(fis);

        System.out.println(properties.getProperty("userName"));
    }
}
