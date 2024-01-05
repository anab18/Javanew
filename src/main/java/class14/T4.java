package class14;

public class T4 {

    String name(String str) {
        String reversed = " ";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
            return reversed;
        }


        public static void main(String[] args) {
        T4 n=new T4();

        System.out.println(n.name("Happy Holiday"));

}

    }