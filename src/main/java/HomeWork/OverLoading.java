package HomeWork;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.

 */
public class OverLoading
{
    static void num(int num1,int num2) {

        System.out.println(num1+num2);
    }

    static void num(int num1,int num2,int num3) {

        System.out.println(num1-num2-num3);
    }

    static void num(double num1, double num2) {

        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        OverLoading n = new OverLoading();
        num(20, 50);
        num(1000, 799, 55);
        num(60.6, 3.2);

    }

    }


