package Class4;

import java.util.Scanner;

public class E5Scanner2 {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner fetchName= new Scanner(System.in);
        String name=fetchName.next();

        System.out.println("Your name is " +name);

    }


}
