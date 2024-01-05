package Class15;
/*
Write Book class that will have 5 instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
Create print info method and call it.
 */
public class Book {
     private String bookName;
    private String authorName;

    private int nrPage;
    private int nrChapter;
    private double price;

    public Book(String bookName, String authorName, int nrPage, int nrChapter,double price) {
       this(bookName,authorName,nrPage,nrChapter);
        this.price=price;

    }
    public Book(String bookName, String authorName, int nrPage, int nrChapter) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.nrPage = nrPage;
        this.nrChapter = nrChapter;
    }
     public void printInfo(){
        System.out.println(bookName+" "+authorName+" "+nrPage+" "+nrChapter);

    }
    public void printAllInfo(){
        System.out.println(bookName+" "+authorName+" "+nrPage+" "+nrChapter+" $"+price);

    }



    public static void main(String[] args) {
        new Book("Primavara","Ion Druta", 200,50,55.99).printAllInfo();
        new Book("O seara romantica ","Tudor Argheze",500,40).printInfo();


    }
}