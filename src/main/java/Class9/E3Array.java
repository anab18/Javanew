package Class9;

public class E3Array {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,66,55,86},
                {80,90,70},
                {45,55,66,42}
        };

        int[] row=matrix[2];
        System.out.println(row[2]);
        for(int i=0;i<row.length;i++){
            System.out.println(row[i]+" ");
        }
    }
}
