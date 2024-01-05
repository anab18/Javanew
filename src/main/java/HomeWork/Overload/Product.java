package HomeWork.Overload;
/*
Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated

 */
public class Product {
    protected String product_name;
    protected double price;
    protected int quantity;

    public Product(String product_name, double price, int quantity) {
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;}
    public void info(){
        System.out.println(product_name+" "+price+" "+quantity);}
    public void calculate (double price,int quantity){
        double RegularPrice = price * quantity;
        System.out.println("Regular price " + RegularPrice);}}
    class DiscountedProduct extends Product {
        public DiscountedProduct(String product_name, double price, int quantity) {
            super(product_name, price, quantity);}
        double discount;
        public void calculate(double price, int quantity,double discount) {
            double Total = (price * quantity) + discount;
            System.out.println("Discount  price " + Total);
        }
    }



