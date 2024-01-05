package replit;

public class m139 {
    static boolean alphabetical(char c1, char c2) {

        if (c1 < c2) {

            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(alphabetical('z', 'x'));
    }
}