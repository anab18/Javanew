package class14;

public class T3 {

     String vowels(String str) {

        String str1 = str.replaceAll("[^e,u,o,i,e,a,A,E,I,O,U]", " ");
        return str1;
    }

    public static void main(String[] args) {
        T3 v = new T3();
        String name="Elisabeth";
        System.out.println(v.vowels(name));

    }
}



