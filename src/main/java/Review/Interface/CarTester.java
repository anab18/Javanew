package Review.Interface;

public class CarTester {
    public static void main(String[] args) {
        WashAble.Car c=new WashAble.Car();
        c.trust();
    }
}
/*
Interface:
Interfaces are like contracts which make sure that everybody is on the same page.
They achieve this through abstraction.
1.Inside the interface, all the methods are abstract and public.
By default, all the variables we create inside the Interface are public-> static->final.
  Interfaces themselves are also abstract and public by default.
2.Inside interface, you cannot have instance variables. If there is no instance field, there is no need for
  constructors or objects of Interface.
The main pointof interface is everybody is following the same rules and everybody is on the same page.

 */