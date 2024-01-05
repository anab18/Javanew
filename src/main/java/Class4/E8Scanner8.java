package Class4;

import java.util.Scanner;

public class E8Scanner8 {
    public static void main(String[] args) {
        System.out.println("Please enter the load amount");
        Scanner sc = new Scanner(System.in);
        double loanAmount = sc.nextDouble();
        if (loanAmount <= 200000) {

            System.out.println("You can get this loan");
        } else {
            System.out.println("This amount can't be provided");

        }
    }
}