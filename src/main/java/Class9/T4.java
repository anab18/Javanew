package Class9;

public class T4 {
    public static void main(String[] args) {
        int[][] num={
                {1,2,3,4},
                {5,6,7,8},
                {9,2,4,5}
        };

        for(int i=0;i<num.length;i++){
               for(int j=0;j<num[i].length;j++){
                       if(num[i][j]%2==0);
            }
            System.out.println("Print the even number"+ num);
        }
        System.out.println();
    }

}
