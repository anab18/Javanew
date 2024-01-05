package HomeWork;
/*
Create a Bird class create 4 fields and use the Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors
make fields private and define printInfo methods as well create the object of each class and call the methods
 */
public class Bird {
    private String name;
    private String color;
    private String size;
    private int age;
    public void info() {
        System.out.println(name + " " + color + " " + size + " " + age);}
    public Bird(String name, String color, String size, int age) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.age = age;}
}
class sparrow extends Bird {
    sparrow(String name, String color, String size, int age) {
        super(name, color, size, age);}
    class Parrot extends Bird {
        Parrot(String name, String color, String size, int age) {
            super(name, color, size, age);}}

        public static void main(String[] args) {
            Bird Sparrow = new Bird("Sparrow", "white", "Medium", 3);
            Sparrow.info();
            Bird Parrot = new Bird("Parrot", "green", "Small", 1);
            Parrot.info();
        }
    }

