package Review;

public class Array1 {
    public static void main(String[] args) {
        //creating yhr array and initializing it
        int [] num={10,25,36,56,80};
        System.out.println(num.length);
        System.out.println(num[2]);
        for (int i=0;i<num.length/2;i++){
            System.out.print(num[1]+" ");
        }
        System.out.println();
        for(int n:num){
            System.out.print(n+" ");
        }
    }
}
