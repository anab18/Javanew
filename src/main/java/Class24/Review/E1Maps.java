package Class24.Review;

import java.util.LinkedHashMap;

public class E1Maps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentsMap = new LinkedHashMap<>();
        studentsMap.put("John", 56);
        studentsMap.put("Maria", 36);
        studentsMap.put("Elena", 6);
        studentsMap.put("Tudor", 50);
        studentsMap.put("Alina", 61);
//if the name of the student the letter a or if makes are less then 50 remove those

        studentsMap.entrySet().removeIf(x -> x.getValue() < 50||x.getKey().contains("a"));

        System.out.println(studentsMap);
    }
}
