package Class10;

public class DogTaster {
    public static void main(String[] args) {
        // creating object of the class
        Dog dog1 = new Dog();

        /*
        Dog=> is a valiable that holders the object
        new Dog();=>Creating a object of a dog class

         */
        dog1.name = "Pufic";
        dog1.breed = "Germen";
        dog1.weight = 15;
        dog1.color = "Black";
        dog1.age = 5;
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.color);
        System.out.println(dog1.age);
        dog1.bark();
        dog1.sleep();


        Dog dog2 = new Dog();
        dog2.name = "Tomy";
        dog2.breed = "bulldog";
        dog2.weight = 20;
        dog2.color = "white";
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        dog2.eat();
        dog2.sleep();


    }
}
