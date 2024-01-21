package Class24;

import java.util.ArrayList;
import java.util.HashMap;

public class E4Maps {
    public static void main(String[] args) {
        var maps = new HashMap<>();
        maps.put("Apple", 20);
        maps.put("kiwi", 10);
        maps.put("banana", 25);
        maps.put("orange", 5);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        //Returns the keys in the form of a set
        var keys= maps.keySet();
        var arrayList=new ArrayList<>(keys);
        for(var k:keys){
            System.out.println(k);
        }
    }
}