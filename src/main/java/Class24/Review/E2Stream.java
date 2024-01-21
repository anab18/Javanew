package Class24.Review;

import java.util.Arrays;

public class E2Stream {
    public static void main(String[] args) {
        int[] arr={0,20,30,40,5};
        int min= Arrays.stream(arr).min().getAsInt();
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);
        System.out.println(min);
    }
}
