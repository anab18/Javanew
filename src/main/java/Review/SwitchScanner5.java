package Review;

import java.util.Scanner;

public class SwitchScanner5 {
    public static void main(String[] args) {
        Scanner capture=new Scanner(System.in);
        System.out.println("Please enter where you from");
        String country=capture.nextLine();
        switch (country) {
            case "India":
            System.out.println("you love biriyani");
            break;
            case "Egypt":
                System.out.println("you love kashary");
                break;
                case "Moldova":
                    System.out.println("I love mamaliga");
                    break;
            default:
                System.out.println("I don't know");

        }
    }
}
