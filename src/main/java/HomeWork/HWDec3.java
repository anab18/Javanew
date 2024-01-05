package HomeWork;
//How would you swap  2 strings without a temporary variable?
public class HWDec3 {
    public static void main(String[] args) {
        int a=8;
        int b=5;
        System.out.println("Before swap the number:");
        System.out.println("a value is "+a);
        System.out.println("avalue is "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println();
        System.out.println("After swapping the numbers:");
        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);

    }
}
