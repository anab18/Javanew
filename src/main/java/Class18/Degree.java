package Class18;
/*
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
 */
public class Degree {

    public void getPrerequisity() {
        System.out.println("To get a degree you need high school diploma");
    }

}
   class Master{
    public void getPrerequisity(){
        System.out.println("To get a degree you need high Bachelors diploma");
    }
}
class Bachelors extends Degree{

}
class DegreeTester{
    public static void main(String[] args) {
        Master m=new Master();
        m.getPrerequisity();
        Bachelors b=new Bachelors();
        b.getPrerequisity();
    }
}