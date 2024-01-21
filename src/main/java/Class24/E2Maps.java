package Class24;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("Apple",20);
        maps.put("kiwi",10);
        maps.put("banana",25);
        maps.put("orange",5);
        System.out.println(maps);
        maps.remove("kiwi");
        System.out.println(maps);
        maps.replace("Apple",30);
        System.out.println(maps);
        maps.clear();
        System.out.println(maps);
    }
}
