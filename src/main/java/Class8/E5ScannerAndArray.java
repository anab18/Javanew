package Class8;

import java.util.Scanner;

public class E5ScannerAndArray {
    public static void main(String[] args) {

         int[] num=new int[5];
        Scanner scanner=new Scanner(System.in);
        for ( int i =0; i< num.length;i++) {
            System.out.println("Plese enter a num "+(i+1));
            num[i] = scanner.nextInt();
        }
        System.out.println("Here are all nr that you entered");
        for ( int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
