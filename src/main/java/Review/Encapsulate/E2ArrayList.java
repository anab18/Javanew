package Review.Encapsulate;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Double>num=new ArrayList<>();
        num.add(5.2);
        num.add(4.2);
        num.add(3.2);
        num.add(5.9);


        System.out.println(num);//overloading
        num.remove(0);//remuve linia o
        num.remove(4.);//remuve exact numaru
        System.out.println(num);


    }
}
