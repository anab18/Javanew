package Class24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E6Maps {
    public static void main(String[] args) {
        Map<Integer,String>studentsMap=new LinkedHashMap<>();
        studentsMap.put(20,"Anna");
        studentsMap.put(1,"Alina");
        studentsMap.put(5,"Yustina");
        studentsMap.put(15,"Aaron");
        studentsMap.put(2,"Muhayee");
        System.out.println(studentsMap);
        //Map->Entry->Keys value
        Set<Map.Entry<Integer, String>> entries = studentsMap.entrySet();

        // var studentEnters=studentsMap.entrySet();//values and keys
       // Map.Entry<Integer, String> e:enteries){
        for(var e:entries) {
            if (e.getKey() > 2) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        var entries2=studentsMap.entrySet();
            for(var a:entries2){
                var key=a.getKey();
                var value=a.getValue();
                System.out.println(key+" "+value);
            }
            System.out.println("****************************");
            studentsMap.forEach((k,v)->System.out.println(k+" "+v));
        }

        



    }
}
