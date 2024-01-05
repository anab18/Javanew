package HWNov27;
/*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.
 */
public class T3 {
    public static void main(String[] args) {
        int[][] num = {
                {22, 23, 25},
                {45, 55, 53},
                {85, 96, 85}};
        int sum = 0;
        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num[a].length; b++) {
                sum = sum + num[a][b];
            }
        }
        System.out.print("The sum of all numbers " +sum);



            }
        }

