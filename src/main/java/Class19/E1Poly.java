package Class19;

public class E1Poly {
    public static void main(String[] args) {
       Dog d1=new Dog("Pufic","Red",9,45);
        Dog d2=new Dog("Sisi","white",9,45);
        Cat c1=new Cat("Pichi","brown",9,45);
        Animal a1=new Animal("diki","gray",5,32);
        Animal [] arr={d1,d2,c1,a1};
        Animal a2=arr[0];
        a2.PrintInfo();
    }
}
