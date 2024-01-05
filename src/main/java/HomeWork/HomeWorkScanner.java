package HomeWork;

import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sume = 1000;
        System.out.println("Do the user have credit card?");
        String creditCard = sc.nextLine();
        if (creditCard.equals("no")) {
            System.out.println("Can you open a new credit");
        } else {
            if (creditCard.equals("yes")) {
                System.out.println("What is balance on the card?");
                if (sume < sc.nextDouble()) {
                    System.out.println("They need to pay off immediately");
                } else {
                }
                System.out.println("They can spend more");

            }
        }

    }}