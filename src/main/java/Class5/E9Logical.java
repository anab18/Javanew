package Class5;

import java.util.Scanner;

public class E9Logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter hours 1 to 24");
        int hoursNum=sc.nextInt();
        if(hoursNum>=1 &&hoursNum<=11){
            System.out.println("Morning");
        } else if  (hoursNum>=12 && hoursNum<=15){
            System.out.println("Afternoon");
        }else if(hoursNum>=16&&hoursNum<=20){
            System.out.println("Evening");
        }else if(hoursNum>=21&&hoursNum<=24){
            System.out.println("night");
        }else{
            System.out.println("invalid");
        }
    }
}
