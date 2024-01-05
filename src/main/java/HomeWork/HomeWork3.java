package HomeWork;

import java.util.Scanner;

//Ask user to enter a number and then categorize if number is small, medium or large
//Small number is value between 1 and 10
//Medium number is value between 11 and 100
//Large number is value between 101 and 1000
public class HomeWork3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double num=sc.nextDouble();
        if(num>1 && num<10) {
            System.out.println("Small");
        }else if(num>11 && num<100) {
            System.out.println("Medium");
        }else if(num>101 && num<1000) {
            System.out.println("Large");
        }

    }
}
