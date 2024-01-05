package Class11;

public class T4 {
    public static void main(String[] args) {

            String str = "hello";

            if (!str.isEmpty()) {
                int len = str.length();
                if (len >= 3 && len % 2 != 0) {
                    System.out.println(str.charAt(len / 2));
                }

            }
        }}