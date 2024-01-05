package Review.Method;

public class E1Method {
    int arr(int[] array) {

        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println();
            return sum;

    }

    public static void main(String[] args) {
        int[]arr=new int[]{10,20,30};
        System.out.println((arr));

    }
}

