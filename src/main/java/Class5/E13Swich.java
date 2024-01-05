package Class5;

import java.util.Scanner;

public class E13Swich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your country");
        String country=sc.nextLine();
        switch (country){
            case("Moldova"):
                System.out.println("Romanian");
                break;
            case("Brazil"):
                System.out.println("Spanish");
                break;
            case("Russia"):
                System.out.println("Rushen");
                break;
            case("Germania"):
                System.out.println("German");
                break;
            default:
                System.out.println("Error");


        }

    }
}
