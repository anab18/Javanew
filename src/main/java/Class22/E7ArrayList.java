package Class22;
/*
if a name contains the letter "o" replace it with java
 */
import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("Elisabeth");
        names.add("Poorna");
        names.add("Andreea");
        names.add("Gabriela");
        for (int i = 0; i <names.size() ; i++) {
           String s=names.get(i);
           if(s.contains("o")){
               names.set(i,"java");

           }
            }
        System.out.println(names);
        }
    }

