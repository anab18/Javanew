package Class6;
// print even nr 100
public class T5 {
    public static void main(String[] args) {
        int i = 20;

        while (i <= 100) {
            System.out.print(i + " ");
            i = i + 2;
        }
        int y = 20;
        while (y <= 100) {
            if (y % 2 == 0) {
                System.out.print(y + " ");
            }
            y++;
        }

    }
}


