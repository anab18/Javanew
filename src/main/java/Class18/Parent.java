package Class18;

public class Parent {
    void marry() {
        System.out.println("Marry the girl that have select for you");
    }
        void sleep(){
            System.out.println("Sleep hours");
        }
    }

class Karimi extends Parent{
    void marry(){
        System.out.println("I want to marry Scarlet ");
    }
}
class Taster {
    public static void main(String[] args) {
        Karimi k = new Karimi();
        k.marry();
        k.sleep();
    }
}