package Review.Encapsulate;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /*
        int=>Integer

         */
        ArrayList <Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(20);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }
        System.out.println("************************");
        for(int I:numbers){
            System.out.println(I);
        }
 Integer num=10;
        int num2=num;
    }
}
