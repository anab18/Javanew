package HomeWork.T1polymorphism;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle [] n={new Vehicle(120,"grey","gas"),
                new Car(130,"black","gas"),
                new Motorcycle(100,"White","gas"),
                new Truck(110,"red","diesel","53 flatbed"),
                new Bicycle(60,"orange","air")};
        for(Vehicle x:n) {
            x.VehicleInfo();
            x.accelerate();
            x.brake();

            if(x instanceof Truck){
                Truck t=(Truck)x;
                t.loadCargo();

            }
        }

    }




}
