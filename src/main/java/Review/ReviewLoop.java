package Review;

public class ReviewLoop {
    public static void main(String[] args) {
        // for lopp when we know in advance how many time can
        //repet of cods

        /*for( initialization ,condition, increment/decrement)
        code to repet;
         */

        for (int i = 0; i < 4; i++) {
            System.out.println("Hello " + i);
        }
        System.out.println("---------");

        for (int i = 2; i <= 10; i += 3) {
            System.out.print(i);
        }
        System.out.println("-----------------");

        for (int i = 10; i < 2; i--) {
            System.out.print(i + " ");// no execute becouse is f
        }


        System.out.println("----------------");

        for (int i = 10; i >= 2; i++) {
            System.out.print(i + " ");// execute infinite
        }

    }


}
