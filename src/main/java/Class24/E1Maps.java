package Class24;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        Map<String,Integer>maps=new HashMap<>();
        maps.put("Apple",20);
        maps.put("kiwi",10);
        maps.put("banana",25);
        maps.put("orange",5);
        System.out.println(maps);
        System.out.println(maps.size());//4
        System.out.println(maps.containsKey("Apple"));//true
        System.out.println(maps.containsKey("Apple".toLowerCase()));//false
        System.out.println(maps.containsValue(25));//true
        System.out.println(maps.containsValue(3));//false
        System.out.println(maps.isEmpty());//false
        System.out.println(maps.get("kiwi"));//10









    }
}
