package Review;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter size of the Array ");
        int size= scanner.nextInt();
        int [] num=new int[size];
        System.out.println(num.length);

        for (int i = 0; i <num.length ; i++) {
            System.out.println("Please enter the number" + (i + 1));
            num[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(num));

        }}

