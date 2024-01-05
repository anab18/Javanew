package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,70},
                {45,55,66,42}
        };
//enetire one do array from the 2d array
        int []row0=matrix[0];
        System.out.println(row0.length);//3
        for(int n:row0){
            System.out.print(n+" ");
        }
        System.out.println();
        //accesing individula elements from the 2d array
        System.out.println(matrix[2][2]);
}}
