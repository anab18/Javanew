package HomeWork.Abstract;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle [] V={new Car("BMW","I7","full"),
                     new Truck("International","Prostar","3/4"),
                     new Motorcycle("Harley Davidson","Nightster","1/2")};
        for(Vehicle n:V){
            n.printInfo();
            n.startEngine();
            n.stopEngine();
            n.fuelUp();
            System.out.println("    **************************    ");
        }
    }
}
