package HomeWork;

import java.util.Scanner;

public class test {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name");
            String name=sc.next();
            System.out.println("Enter your mobile number");
            long moble=sc.nextLong();
            long areaCode,mid3,last4;
            areaCode=(moble/10000)/1000;
            mid3=(moble/10000)%1000;
            last4=moble%10000;
            System.out.println(+areaCode+"-"+mid3+"-"+last4);
        }


    }

