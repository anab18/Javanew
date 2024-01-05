package Class8;

public class T3 {
    public static void main(String[] args) {
        // show the sum of even numer and odd num
        //separetely
        int[] number = {10, 15, 20, 18, 9, 60, 22, 30};
        int sumOdd=0,sumEven=0;
        for (int num:number) {
            if (num % 2 == 0) {
                sumEven=sumEven+num;
            }else{
                sumOdd=sumOdd+num;
            }}
            System.out.println("Sum of even number is "+ sumEven);
            System.out.println("Sum of odd number is "+ sumOdd);
    }

}

