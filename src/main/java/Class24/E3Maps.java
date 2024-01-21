package Class24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E3Maps {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Apple", 20);
        maps.put("kiwi", 10);
        maps.put("banana", 25);
        maps.put("orange", 5);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        //returns the keys in the form of the a set
        Set<String>keys=maps.keySet();
        ArrayList<String>arrayList=new ArrayList<>(keys);
        for(String k:keys){
            System.out.println(k);
        }







    }
}