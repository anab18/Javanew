package Class21;

public class FileTester {
    public static void main(String[] args) {
        File[] F = {
                new JavaFile("Java file", 8),
                new WordFile("Microsoft word",5),
                new PdfFile("Pdf", 3)};
        for (File n : F) {
            n.open();
            n.edit();
            n.close();
        }
    }
}

