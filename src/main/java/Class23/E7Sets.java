package Class23;

import java.util.TreeSet;

public class E7Sets {
    public static void main(String[] args) {
        TreeSet<Integer > numbers=new TreeSet<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(21);
        System.out.println(numbers);
        for(int n:numbers){
            if(n<10){
                System.out.println(n);
            }
        }

    }






}
