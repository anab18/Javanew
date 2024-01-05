package replit;

public class Main {
    String make;

    String model;

    int numberOfDoors;

    int topSpeed;

    double price;

    public Main(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }


    public Main(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Main(int numberOfDoors, int topSpeed, double price) {

        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Main(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;

    }


    public static void main(String[] args) {
        Main m=new Main("Toyota","Prius",4,120,30000.0);
        Main m2=new Main("unknown","unknown",4,120,30000.0);
        Main m3=new Main("Toyota","Prius",4,90,0.0);
        System.out.println(m.make+" "+ m.model+" "+m.numberOfDoors+" "+m.topSpeed+" "+ m.price);
        System.out.println(m.make+" "+ m.model+" "+m.topSpeed+" "+m.price);
        System.out.println(m2.make+" "+ m2.model+" "+m.numberOfDoors+" "+m.price);
        System.out.println(m.make+" "+ m.model+" "+m.numberOfDoors+" "+m3.topSpeed+" "+m3.price);
}


    }
