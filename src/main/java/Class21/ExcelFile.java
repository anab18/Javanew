package Class21;

interface FileReader{
    void read();
}



//created by Microsoft
public class ExcelFile implements FileReader {

  public  void read(){
        System.out.println("Reading in ExcelFile");
    }
}

//created by notePad++
class TextFile implements FileReader{

   public void read(){
       System.out.println("read text file");
    }

}
