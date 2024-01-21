package Class23;
/*
Create a Set in which you need to add names of the countries(5). In this set we want all objects
to be sorted in alphabetical order. retrieve all elements from set.
 */
import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {
        TreeSet<String>countries=new TreeSet<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Romania");
        countries.add("France");
        for(String s : countries){
            System.out.println(s);
        }
        System.out.println(countries);
    }
}
