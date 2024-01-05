package class17;

class Grandparent{

}
public class Parent {
    String name="Ion";

}
class Child extends Parent{

    String name="Maria";//instatens variable

    void print(){
        String name="Levi";

    }
}
class Tester{
    public static void main(String[] args) {


    Child c=new Child();
    c.print();
}}