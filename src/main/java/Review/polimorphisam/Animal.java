package Review.polimorphisam;

public abstract class Animal {
    private String name;
    private String color;
    private int age;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName(){
        return this.name;}

    public abstract void eat();

    public abstract void speak();


    public void printInfo() {
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{
    String bread;
    public Dog(String name, String color, int age,String bread) {
        super(name, color, age);
        this.bread=bread;

    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat meat");
    }
    @Override
    public void speak() {
        System.out.println("wff..wff...");
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(bread);
    }
    public void run(){
        System.out.println("Run dog");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat like to ear tuna");

    }

    @Override
    public void speak() {
        System.out.println("meow...meow..");

    }
}