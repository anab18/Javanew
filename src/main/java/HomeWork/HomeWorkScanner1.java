package HomeWork;

import java.util.Scanner;

public class HomeWorkScanner1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("How many years do you worked?");
        int years= user.nextInt();
        if (years >= 5) {
            System.out.println("You are eligible for bonus");
        } else {
            System.out.println("You are not");
        }
        System.out.println("What your annual salary?");
        double annualSalary=user.nextDouble();
        if(annualSalary>50000){
            System.out.println("Bonus-5000");
        }else{
            System.out.println("Bonus-3000");
        }

    }
}