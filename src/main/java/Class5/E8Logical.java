package Class5;

import java.util.Scanner;

public class E8Logical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number from 1-7");
        int dayNumber=sc.nextInt();
        if(dayNumber>=1 &&dayNumber<=5) {
            System.out.println("Weekday");
        }else if (dayNumber>=6 && dayNumber<=7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid");
        }


    }
}
