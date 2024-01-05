package Class18;

public class Animal {

private String name;
private String color;
private int age;
private double weight;

Animal(String name,String color,int age,double weight){
    this.name=name;
    this.color=color;
    this.age=age;
    this.weight=weight;}
    void sleep(){
        System.out.println("zzzzzzzz");
    }
    void speak(){
        System.out.println("Animal speaking");
}
}
class Dog extends Animal {
    Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);

    }

    public void speak() {
        System.out.println("Woff,Woff");
    }

    void demo(String str) {
        System.out.println(str);
    }


        }
