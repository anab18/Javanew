package HomeWork;
/*
Create a class named Vehicle. If no arguments are passed while creating an object
 of the class, it should print "I love vehicles". If a String representing the type
 of vehicle (like "Car", "Bike") is passed, it should print "I love [VehicleType]".
  For example, if "Car" is passed, it should print "I love Car"

 */
public class Vehicle {

   public void Vehicle(){
        System.out.println("I love vehicle");
    }
    public void Vehicle(String name){
        System.out.println("I love "+name);
    }
    public void Vehicle(String name1,String name2){
        System.out.println("I love "+name1+","+name2);
    }

    public static void main(String[] args) {
        Vehicle m=new Vehicle();
        m.Vehicle();
        m.Vehicle("car");
        m.Vehicle("car","bike");
    }
}
