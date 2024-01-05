package HomeWork.T1polymorphism;
/*
Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.
 */
public class Vehicle {
     int speed;
     String color;
     String fuelType;
       public  Vehicle(int speed,String color,String fuelType){
            this.speed=speed;
            this.color=color;
            this.fuelType=fuelType;}
           void VehicleInfo(){
               System.out.println(speed+ " "+color+" "+fuelType);}
     void accelerate(){System.out.println("Car accelerate quickly");}
    void brake(){System.out.println("pedal brake");}
    }
    class Car extends Vehicle {
    Car(int speed,String color,String fuelType){super(speed,color,fuelType);}

        public void accelerate(){System.out.println("Car accelerate quickly");}
        public void brake(){System.out.println("pedal brake");}}
        class Truck extends Vehicle{
            String loadCargo;
            Truck(int speed,String color,String fuelType,String loadCargo){
                super(speed,color,fuelType);
                this.loadCargo=loadCargo;}
            public void loadCargo(){System.out.println("Truck to transport heavy loads");}
            public void accelerate(){System.out.println("Truck accelerate slow");}
            public void brake(){System.out.println("air brake ");}}
            class Motorcycle extends Vehicle{Motorcycle(int speed,String color,String fuelType){super(speed,color,fuelType);}
                public void accelerate(){System.out.println("Motorcycle accelerate very fast");}
                public void brake(){System.out.println("pedal brake");}}
                class Bicycle extends Vehicle{Bicycle(int speed,String color,String fuelType){super(speed,color,fuelType);}
                    public void accelerate(){System.out.println("Bicycle accelerate ");}
                    public void brake(){System.out.println("disk brake");}}
