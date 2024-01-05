package HomeWork.ArrayList;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int restock(int amount) {
        return stockQuantity + amount;
    }

    public int sell(int amount) {
        if (stockQuantity >= amount) {
            return stockQuantity - amount;

        }
        return 0;
    }

    public void printProductDetails() {
        System.out.println(productID + "," + productName + "," + price + "," + stockQuantity);
    }
}





