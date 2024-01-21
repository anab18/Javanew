package Class27;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class E4Exception {
    public static void main(String[] args) throws FileNotFoundException {
try {
    FileInputStream fis = new FileInputStream("C:\\Users\\anabo\\IdeaProjects\\Javanew");
}catch (FileNotFoundException fis){
    System.out.println("Please check the file");
}
    }
}
