package Class22;
/*
Create an arrayList of drinks call it. If any drink has letter “a” or “e” replace the whole word with water.
Create an arrayList of words. Remove every word that ends with “e”
 */
import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("vodka");
        drinks.add("wine");
        drinks.add("juice");
        for(int i=0;i<drinks.size();i++){
            String s=drinks.get(i);
            if(s.contains("a")||s.contains("e"))
                drinks.set(i,"water");
        }
        System.out.println(drinks);
    }


}
