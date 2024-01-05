package Class10;

public class CarTaster {
    public static void main(String[] args) {
        //create an object from the class
        Car bmw=new Car();
        int age=10;
        bmw.model="I7";
        bmw.make="BMW";
        bmw.price=95000;
        bmw.driver();
        bmw.honk();

    }
}
