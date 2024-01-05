package HomeWork;
/*
Create a method to find the minimum of two numbers.
 Method will be passed two parameters and will return the minimum number. Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5
 */
public class MethodT1 {


   public int num(int num1,int  num2) {
       if (num1 < num2) {
           return num1;
       } else {
           return num2;
       }
   }
    public double num(double num1, double num2){
       if(num1<num2){
           return num1;
       }else{
           return num2;
       }
   }

    public static void main(String[] args) {
        MethodT1 n=new MethodT1();
        System.out.println(n.num(2,5));
        System.out.println(n.num(2.9,9.4));
    }
}
