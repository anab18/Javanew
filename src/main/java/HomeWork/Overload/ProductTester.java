package HomeWork.Overload;

public class ProductTester {

    public static void main(String[] args) {
        Product p=new Product("cake",39.99,2);
        p.info();
        p.calculate(39.99,2);
        System.out.println();
        DiscountedProduct dp=new DiscountedProduct("juice",5.99,4);
        dp.info();
        dp.calculate(5.99,4,4.99);



    }
}

