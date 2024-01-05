package Class10;

public class PhoneTaster {
    public static void main(String[] args) {
/*
Create a Class “Phone”.
Create 3 Objects of it: iPhone, Pixel, Samsung
 create 3 to 5 attributes
And three behaviours
 */
        Phone Iphone=new Phone();
        Iphone.make="Apple";
        Iphone.model="ProMax 11";
        Iphone.color="black";
        Iphone.price=1000;
        System.out.println(Iphone.make);
        System.out.println(Iphone.model);
        System.out.println(Iphone.color);
        System.out.println(Iphone.price);
        Iphone.ring();
        Iphone.massage();
        Iphone.takePics();

        System.out.println("******************");

        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="S23 Ultra";
        samsung.color="black";
        samsung.price=1000;
        System.out.println(samsung.make);
        System.out.println(samsung.model);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        samsung.ring();
        samsung.massage();
        samsung.takePics();

        System.out.println("*****************");



    }
}
