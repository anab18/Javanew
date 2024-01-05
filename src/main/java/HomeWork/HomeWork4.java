package HomeWork;

import java.util.Scanner;

//Allow user to enter grade (A, B, or C etc...) and then provide explanation:
// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
// At the end your program should print which grade was entered by a user with explanation.
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        String grade=sc.nextLine();
        switch (grade){
            case ("A"):
                System.out.println("Excellent");
                break;
            case ("B"):
                System.out.println("Good");
                break;
            case ("C"):
                System.out.println("Average");
                break;
            case ("D"):
                System.out.println("Bed");
                break;
            default:
                System.out.println("Not Acceptable");
        }

    }
}
