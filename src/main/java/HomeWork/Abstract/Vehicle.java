package HomeWork.Abstract;
/*
2)Vehicle Management System: Design a base class
Vehicle with methods like startEngine(), stopEngine(), fuelUp(),
 and fields like make, model, and fuelLevel. Create subclasses like Car,
  Truck, and Motorcycle, each with specific implementations for the methods,
considering their unique characteristics.
 */
public abstract class Vehicle {
    private String make;
    private String model;
    private String fuelLevel;

    public Vehicle( String make,String model,String fuelLevel){
        this.make=make;
        this.model= model;
        this.fuelLevel=fuelLevel;}
    void printInfo(){
        System.out.println(make+" "+model+" "+fuelLevel);}

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();
    }
   class Car extends Vehicle {
           Car(String make, String model, String fuelLevel) {
            super(make, model, fuelLevel);}
       @Override
        public void startEngine(){
            System.out.println("The car started engine.");}
       @Override
     public void stopEngine(){
         System.out.println("The car stopped engine.");}
       @Override
        public void fuelUp(){
        System.out.println("The car refilled the fuel");}}
         class Truck extends  Vehicle{
            public Truck(String make, String model, String fuelLevel) {
                super(make, model, fuelLevel);}
             @Override
            public void startEngine(){
                System.out.println("The truck started engine.");}
             @Override
            public void stopEngine(){
                System.out.println("The truck stopped engine.");}
             @Override
            public void fuelUp(){
                System.out.println("The truck refilled the fuel");}
        }
         class Motorcycle extends  Vehicle{
            public Motorcycle(String make, String model, String fuelLevel) {
                super(make, model, fuelLevel);}
             @Override
            public void startEngine(){
                System.out.println("The motorcycle started engine.");}
             @Override
            public void stopEngine(){
                System.out.println("The motorcycle stopped engine.");}
             @Override
            public void fuelUp(){
                System.out.println("The motorcycle refilled the fuel");}
        }

