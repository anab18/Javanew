package Class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("Elisabeth");
        names.add("Felicia");
        names.add("Andreea");
        names.add("Gabriela");
        System.out.println(names.size());
        System.out.println(names.contains("Ana"));
        System.out.println(names);
       // System.out.println(names.remove("Felicia"));
        System.out.println(names.remove(3));
        System.out.println(names.get(0));
        names.set(0,"Alina");
        System.out.println(names);
        System.out.println(names.indexOf("Andreea"));
        System.out.println(names.indexOf("Tudor"));

    }
}
