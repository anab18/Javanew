package Class24.Review;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1Files {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\anabo\\IdeaProjects\\Javanew\\Files\\Config.properties";

       //bringing the file to the memory(ram)
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));

    }
}
