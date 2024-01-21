package Class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        List<String>aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

       Set<String> List=new LinkedHashSet<>(aList);
       aList.clear();
       aList.addAll(List);
        System.out.println(aList);
    }
}
