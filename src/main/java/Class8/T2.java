package Class8;

public class T2 {
    public static void main(String[] args) {
        int[] numbers={101,100,25,30,25,50,300};
           int n2=0;
           int n5=0;
        for( int x:numbers ){
           if (x%2==0){
               n2++;
        }
           if(x%5==0) {
               n5++;
           }}
               System.out.println("Number divisible by 2:" + n2);
        System.out.println("Number divisible by 5:"+ n5);
           }

    }

