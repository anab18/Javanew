package HomeWork.Overload;
/*
Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook,
 add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
 */
public class Book {
    String title;
    String author;
    int ISBN;
    void info(){
        System.out.println(title+" "+author+" "+ISBN);
    }
    public Book(String title,String author,int ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;}}
class Ebook extends Book{
    private String download_link;
    Ebook(String title,String author,int ISBN,String download_link){super(title,author,ISBN);
    this.download_link=download_link;}
    public void linkInfo(){
        System.out.println("Download link "+download_link);}}
class PrintBook extends Book{
       private int number_of_copies;
       PrintBook(String title,String author,int ISBN,int number_of_copies){super(title,author,ISBN);}
    public void number_of_copies(){
        System.out.println("Print number of copy "+number_of_copies);

}
    public static void main(String[] args) {
        Book n=new Book("Things left behind","Lucy Score",52556464);
        n.info();
        System.out.println();
        Ebook eb=new Ebook("Western Winter Wishes "," Emma Ashwood",4541245,"https://www.amazon.com/Western-Winter-Wishes");
        eb.info();
        eb.linkInfo();
        System.out.println();
        PrintBook pb=new PrintBook("The Beach House","Rachel Hanna ", 1696781868,250);
        pb.info();
        pb.number_of_copies();
    }

    }
