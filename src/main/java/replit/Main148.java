package replit;

public class Main148 {String item;
    double price;
    int quantity;



    Main148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice() {
        double totalValue = this.price * this.quantity;
        return totalValue;
    }


    public static void main(String[] args) {
        Main148 Blanket = new Main148("Blanket", 49.99, 2);
        double totalBlanket = Blanket.itemTotalPrice();
        System.out.println("Blanket Total Value " + totalBlanket);

        Main148 Mattress = new Main148("Mattress", 219.59, 2);
        double totalMattress = Mattress.itemTotalPrice();
        System.out.println("Mattress Total Value " + totalMattress);

        double totalPurchase = totalBlanket + totalMattress;
        System.out.println("You purchased " + totalPurchase + " today");
    }
}

