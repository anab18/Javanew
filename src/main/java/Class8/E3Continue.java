package Class8;

public class E3Continue {
    public static void main(String[] args) {
        int[] num = {10, 45, 12, 47, 20, 30};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                continue;

            }
            System.out.println(num[i]);
        }
    }}
