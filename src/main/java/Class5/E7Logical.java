package Class5;

import java.util.Scanner;

//Prompt the user to enter person heights in inches.
// Person should be classified as one of the following:
//• short (under 60 inch)
//• medium(between 60 -72 inch)
//• tall (over 72 inch)
public class E7Logical {
    public static <scanner> void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the in inches");
        double height=sc.nextDouble();
        if(height<60){
            System.out.println("Short");
        }else if(height>=60 && height<72){
            System.out.println("Medim");
        }else{
            System.out.println("Tall");
        }


    }
}
