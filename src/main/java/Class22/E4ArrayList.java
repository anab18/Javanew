package Class22;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("Elisabeth");
        names.add("Felicia");
        names.add("Andreea");
        names.add("Gabriela");
        System.out.println(names);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("*************************");
     for(String s:names){
     System.out.println(s);
}

    }
}
