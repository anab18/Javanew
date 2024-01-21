package Class24;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
 */
public class T4 {
    public static void main(String[] args) {
        Map<String, Integer> employee = new LinkedHashMap<>();
        employee.put("Tudor", 50000);
        employee.put("Crytal", 409000);
        employee.put("Poorna", 65000);
        String empName=" ";
        int salary=0;

        for(var e:employee.entrySet()){
            if(e.getValue()>salary){
                empName=e.getKey();
                salary=e.getValue();

            }
        }
        System.out.println(empName+" =$"+salary);
    }
}