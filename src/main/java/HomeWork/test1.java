package HomeWork;

import java.util.Scanner;

public class test1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your mobile number");
        String moble=sc.next();
        System.out.println("Enter your age");
        int age =sc.nextInt();
        System.out.println("My name is "+name+", your age is " +age+" and your moble number is"+moble);

    }
}

