package Class22;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList <String>name=new ArrayList<>();
        System.out.println(name.size());
        name.add("Ana");
        System.out.println(name.contains("Ana"));
        System.out.println(name.size());
        name.remove("Ana");
        System.out.println(name.size());
    }
}
