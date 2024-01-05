package HomeWork.T1polymorphism;

public class ProductTester {
    public static void main(String[] args) {

        Product[] arr = {
                new Electronics("TV", 1999.50, "2525252"),
                new Clothing("Coat", 199.99, "111111"),
                new Furniture("Couch set", 1800.28, "444444"),
               new Books("Twisted Love", 11.15, "99999")};
        for (Product p : arr) {
            p.info();
            p.calculateTax();

            if(p instanceof Electronics){
                Electronics E=(Electronics)p;
                E.calculateTaxWarr(207.30);


            }
        }

    }
}
