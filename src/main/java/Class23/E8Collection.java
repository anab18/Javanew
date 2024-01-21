package Class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E8Collection {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(14);
        number.add(60);
        number.add(10);
        System.out.println(number);

        LinkedHashSet<Integer> UniqueNumber=new LinkedHashSet<>(number);
        System.out.println(UniqueNumber);

        TreeSet<Integer>treeSet=new TreeSet<>(UniqueNumber);
        System.out.println(treeSet);





    }


}