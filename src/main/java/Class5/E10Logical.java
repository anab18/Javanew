package Class5;

import java.util.Scanner;

public class E10Logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What month i born?");
        String month=sc.next();
        String season;
      if(month.equals("March")||month.equals("April")){
          System.out.println("Srping");
      }else if(month.equals("June")||month.equals("July")) {
          System.out.println("Summer");
      }else if(month.equals("Sectember")||month.equals("Octomber")||month.equals("November")){
          System.out.println("Fall");
}else if(month.equals("December")||month.equals("Jun")||month.equals("Feb")) {
          System.out.println("Winter");
      }else{
          System.out.println("Invalid");
          System.out.println("What season you born");
      }}}