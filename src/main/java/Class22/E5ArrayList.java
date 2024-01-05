package Class22;
/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("Elisabeth");
        names.add("Felicia");
        names.add("Andreea");
        names.add("Gabriela");
        names.add("Ana");


        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ana"));
        System.out.println(names.size());
        System.out.println(names);

        }

        }


