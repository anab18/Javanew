package Class24.HW;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John",56);
        studentsMap.put("Maria",36);
        studentsMap.put("Elena",6);
        studentsMap.put("Tudor",50);
        studentsMap.put("Alina",61);
        System.out.println(studentsMap);
        ArrayList<String>names=new ArrayList<>();
        studentsMap.forEach((k,v)->{


            if(v>55)
                names.add(k);
            System.out.println(k+" "+v);


        });
    }
    }
