package replit;

public class Main1 {

    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;


    Main1(String lable, double price, String category, boolean hasExpiration, int stock) {
        this.lable = lable;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    Main1(String lable, double price, int stock) {
        this.lable = lable;
        this.price = price;
        this.stock = stock;
        this.category = "misc";
        this.hasExpiration = false;
    }



    Main1(String lable, double price) {
        this.lable = lable;
        this.price = price;
        this.stock = 0;
    }

    public void display() {
        System.out.print(lable + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }




    public static void main(String[] args) {
        Main1 m1=new Main1( "Eggs", 3.0, "Produce",  true , 10);
        Main1 m2=new Main1("Paper Towels" ,2.0, "misc" ,false, 24);
        m1.display();
        m2.display();
    }
}

