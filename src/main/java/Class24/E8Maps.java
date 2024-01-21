package Class24;

import java.util.HashMap;
import java.util.Map;

public class E8Maps {
    public static void main(String[] args) {
        Map<String ,Integer>map=new HashMap<>();
        map.put("Apple",2);
        map.put("Banana",22);
        map.put("Kiwi",6);
        map.put("Orange",7);
        map.forEach((k,v)-> System.out.println(v+" "+k));
        System.out.println("****************");
        map.forEach((k,v)-> {
            if (k.contains("A") || v < 10) {
                System.out.println(v + " " + k);}


            });
        }
    }