package HomeWork.T1polymorphism;
/*
3)E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.
 */
public class Product {
    private String name;
    private double price;
    private String SKU;
    public Product(String name,double price,String SKU){
        this.name=name;
        this.price=price;
        this.SKU=SKU;}
    public void info(){
        System.out.println(name+" "+price+" "+SKU);}
  public double getPrice(){
      return price;
  }
    public void calculateTax(){
        double totalPrice=price+(price*0.53);
        System.out.println("Total is calculate included with taxe $"+totalPrice);}}
    class Electronics extends Product {
    double warranty;
        Electronics(String name, double price, String SKU) {
            super(name, price, SKU);}
        public void calculateTaxWarr(double waranty){
            double price=getPrice();
            double totalPrice=price+warranty+(price*0.15);
            System.out.println("Total is calculate included with warranty $"+totalPrice);}}
    class Clothing extends Product{Clothing(String name,double price,String SKU){
        super(name,price,SKU);}
        public void calculateTax() {
        double price=getPrice();
        double totalPrice = price+(price*0.18);
        System.out.println("Total is calculate included with taxe $" + totalPrice);}}
            class Furniture extends Product{Furniture(String name,double price,String SKU){super(name,price,SKU);}
                public void calculateTax(){
                    double price=getPrice();
                    double totalPrice=price+(price*0.08);
                    System.out.println("Total is calculate included with taxe $"+totalPrice);}}
    class Books extends Product{Books(String name,double price,String SKU){super(name,price,SKU);}
        public void calculateTax() {
            double price=getPrice();
            double totalPrice = price + (price*0.07);
            System.out.println("Total is calculate included with taxe $" + totalPrice);}}