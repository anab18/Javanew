package class14;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Ana";
        p1.age=34;
        p1.weight=69;
        p1.printInfo();
        System.out.println(Person.noOfEye);

        Person p2=new  Person();
        p2.name="Andreea";
        p2.age=12;
        p2.weight=52;
        p2.printInfo();
        System.out.println(Person.noOfEye);
    }
}
