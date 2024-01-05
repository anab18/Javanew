package Class16;

public class AnimalTester {
    public static void main(String[] args) {


        Dog d = new Dog();
        d.name = "Jakie";
        d.color = "Grey";
        d.age = 1;
        d.weight = 15;
        d.printInfo();
        d.bark();


        cat c = new cat();
        c.name = "Crystal";
        c.color = "Grey";
        c.age = 1;
        c.weight = 15;
        c.printInfo();
        c.sleep();
    }
}