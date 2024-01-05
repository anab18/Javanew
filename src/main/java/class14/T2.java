package class14;


public class T2 {

    int sumArray(int [] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

        public static void main(String[] args) {
            T2 n=new T2();
            int [] numbers={22,43,53};
            int sum=n.sumArray(numbers);
            System.out.println(sum);
        }
    }

