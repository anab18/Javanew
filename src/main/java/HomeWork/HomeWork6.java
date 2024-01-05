package HomeWork;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("enter first number");
        num1 = sc.nextDouble();
        System.out.println("enter second number");
        num2 = sc.nextDouble();
        System.out.println("enter the operator +,-,*,/)");
        char operator= sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num2/num1);
                break;
            default:
                System.out.println("error");

        }

    }
}
