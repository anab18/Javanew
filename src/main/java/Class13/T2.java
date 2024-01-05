package Class13;

import java.util.Scanner;

public class T2 {
    //Create a method that will take a number
    // and prints whether the number is even or odd.

    void evenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("Number is odd");
    }
}