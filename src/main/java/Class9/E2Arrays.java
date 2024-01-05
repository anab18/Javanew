package Class9;

public class E2Arrays {
    public static void main(String[] args) {

        int [][] matrix={
                {10,20,50},
                {25,35,66,55,86},
                {80,90,70},
                {45,55,66,42}
        };

        System.out.println(matrix[1][1]);
        System.out.println(matrix[2][0]);
        System.out.println(matrix[3][2]);
        //System.out.println(matrix[0][3]);error

        System.out.println(matrix.length);//4
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[2].length);//num of that row '3'



    }
}
