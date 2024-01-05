package Class8;

public class T4 {
    public static void main(String[] args) {
        int[] number = {10, 15, 20, 18, 9, 60, 22, 30};

        boolean issorted=true;
         for( int i=0; i< number.length-1;i++){
        if (number[i] > number[i+1]) {
           issorted=false;
           break;
        }}
        System.out.println("Is loop sorted " + issorted);
    }
}
