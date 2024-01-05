package Class22;

import java.util.ArrayList;

/*
print yes if a nam contain letter o otherwise no for all name
 */
public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("Elisabeth");
        names.add("Felicia");
        names.add("Andreea");
        names.add("Gabriela");

       for( String a:names){
           if(names.contains("o")){
               System.out.println("yes");
           }else{
               System.out.println("no");
           }

        }
    }
}
