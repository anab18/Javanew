package HomeWork;
// Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
// Based on operator provide the result to user.
//Please complete this assignment in 2 ways: using if statement and switch case.

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2;
        String operator;
        System.out.println("enter first number");
         num1= sc.nextDouble();
        System.out.println("enter second number");
        num2=sc.nextDouble();
        System.out.println("operator(+,-,*,/)");
        operator=sc.next();
        
        if(operator.equals("+")) {
            System.out.println(num1+num2);
        }else if(operator.equals("-")){
            System.out.println(num1-num2);
        }else if(operator.equals("*")){
            System.out.println(num1*num2);
        }else if(operator.equals("/")){
            System.out.println(num2/num1);

        }


    }
}
