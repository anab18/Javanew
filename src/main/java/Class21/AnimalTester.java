package Class21;

public class AnimalTester {
    public static void main(String[] args) {
       // Animal animal=new Animal();
        Cat c=new Cat("Lulu","Grey");
        c.eat();
        c.speak();
        c.speak();
        Animal c2=new Cat("Nurca","white");
        Animal c3=new Dog("Vivi","black");

        Animal [] arr ={new Cat("dasy","red"),new Dog("Fifi","White")};
        for(Animal a:arr){
            a.eat();
            a.sleep();
            a.speak();
        }


    }


}
