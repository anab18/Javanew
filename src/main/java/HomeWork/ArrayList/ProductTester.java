package HomeWork.ArrayList;

public class ProductTester {
    public static void main(String[] args) {
        Product p = new Product("coat1254", "coat", 199.99, 9);
        p.setProductID("D12541");
        System.out.println(p.getProductID());
        p.setProductName("dress");
        System.out.println(p.getProductName());
        p.setPrice(99.99);
        System.out.println(p.getPrice());
        p.setStockQuantity(5);
        System.out.println(p.getStockQuantity());
        System.out.println(p.restock(60));
        System.out.println(p.sell(40));
        p.printProductDetails();
    }
}
