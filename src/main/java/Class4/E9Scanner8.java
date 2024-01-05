package Class4;

import java.util.Scanner;

public class E9Scanner8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=sc.nextInt();

        if(age>=18) {
            System.out.println("I will issue a driveing license to you");
        }else{
        }
        System.out.println("for now you can only have learners permit");
    }
}
