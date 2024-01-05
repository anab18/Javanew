package Class21;

public abstract class Animal {
    private String name;
    private String color;
    public abstract void eat() ;
    public void sleep(){
        System.out.println("Animal sleep");
    }
    public abstract void speak() ;

    public Animal(String name,String color) {
        this.color = color;
        this.name = name;
    }
    public void printInfo(){
        System.out.println(name+" "+color);
    }
}
class Dog extends Animal{
    public Dog(String name,String color){super(name,color);}
    @Override
    public void eat(){
        System.out.println("dog like eat");
    }
    @Override
    public void speak(){
        System.out.println("whf");}}
        class Cat extends Animal{
            public Cat(String name,String color){super(name,color);}

            @Override
            public void eat(){
                System.out.println("cats like to eat fish");
            }
            @Override
            public void speak(){
                System.out.println(" meaw");
            }
            public void sleep(){
                System.out.println("animal sleep");
            }}