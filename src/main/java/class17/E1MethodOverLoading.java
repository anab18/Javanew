package class17;
 class MathDemo{
     static void add(int num1,int num2){
         System.out.println(num1+num2);

     }
     static void add(double num1, double num2){
         System.out.println(num1+num2);


     }
     static void add(double num1,double num2,double num3)
     {
         System.out.println(num1+num2+num3);
     }
 }
public class E1MethodOverLoading {
    public static void main(String[] args) {
        MathDemo.add(24,24);
        MathDemo.add(15.5,25.5);
        MathDemo.add(10.5,25.5,25.2);
    }

}
