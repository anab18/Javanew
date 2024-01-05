package Class7;
//search for num 55 if present print found
public class E13Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45, 69, 55, 45, 69, 20};
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 20) {
                System.out.print("Found");
                break;
            }
        }
    }}
