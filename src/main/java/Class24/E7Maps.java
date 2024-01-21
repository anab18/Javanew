package Class24;

import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("<Maria");
        names.add("Ana");
        names.add("Alina");
        names.add("Tudor");
        names.add("Ion");
        names.forEach(e-> System.out.println(e));
        System.out.println("***************");
        names.forEach(e->{
            if(e.contains("a")){
                }
                System.out.println(e);});
        names.removeIf(d->d.length()>3);
        System.out.println(names);












    }
}