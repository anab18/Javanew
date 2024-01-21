package Class24;

import java.util.HashMap;
import java.util.Map;

public class T1 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Google");
        map.put(2,"Syntax");
        map.put(3,"Microsoft Word");
        map.put(4,"Samsung");
        map.put(5,"Apple");
        map.put(6,"Amazon");
        map.put(7,"Ups");
        System.out.println(map);
        System.out.println( map.size());
        map.replace(4,"Restaurant");
        map.remove(7);
        System.out.println(map);
    }
}
