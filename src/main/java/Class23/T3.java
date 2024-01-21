package Class23;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a Set of cities in which you want to make sure that
insertion order is maintained. Then remove any city that starts with “A”;
 */
public class T3 {
    public static void main(String[] args) {
       Set<String> city=new LinkedHashSet<>();
        city.add("Atlanta");
        city.add("Chicago");
        city.add("Indiana");
        System.out.println(city);
       city.removeIf(x->x.startsWith("A"));
        System.out.println(city);

    }
}
