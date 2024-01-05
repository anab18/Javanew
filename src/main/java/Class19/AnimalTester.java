package Class19;

public class AnimalTester {
    public static void main(String[] args) {
        Animal a = new Animal("Pufic", "red", 6, 35);
        Dog d = (Dog) a;
        d.bark();
        double[] arr = {12, 23};
        Dog d1 = new Dog("Pufic", "red", 6, 35);
        Cat c = new Cat("Crystal", "Gry", 1, 20);
        Animal a1 = new Animal("Vali", "black", 2, 20);
        Animal[] animal = {d1, c, a1};

    }
}
