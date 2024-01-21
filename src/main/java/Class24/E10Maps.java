package Class24;

import java.util.HashMap;
import java.util.Map;

public class E10Maps {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("Apple",2);
        map.put("Banana",20);
        map.put("Kiwi",6);
        map.put("Orange",7);
        //map.entrySet().removeIf(e->e.getKey().contains("i"));
        //map.entrySet().removeIf(e->e.getValue()==6);
        //map.entrySet().removeIf(e->e.getValue()==6||e.getKey().contains("0"));
       map.entrySet().removeIf(e->e.getKey().contains("a")||e.getKey().length()>5);
       // map.entrySet().removeIf(e->{
            //if(e.getValue()==6||e.getKey().toLowerCase().contains("0")){
           //     return true;
           // }else{
           //     return false;
           // }
       // });



        System.out.println(map);
    }
}
