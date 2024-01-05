package ReviewClass1;

import java.util.Scanner;

public class scannerExemple {
    public static void main(String[] args) {
        //dataType variable-value
        int num=12;


        Scanner input=new Scanner(System.in);
        System.out.println("Enter todad's month");
       String month= input.next();//next() captures 1 word
        System.out.println("enter day today");
        int day=input.nextInt();
        System.out.println("Please enter today year");
        int year=input.nextInt();
        System.out.println(("Today is"+month+" "+day));

        System.out.println("Are you tired?");

        boolean isTired=input.nextBoolean();
        System.out.println("I am tired"+isTired);
        System.out.println("Are you F or M");
        char gender=input.next().charAt(0);
        System.out.println("Gender");
    }

}
