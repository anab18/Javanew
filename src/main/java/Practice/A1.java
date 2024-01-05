package Practice;

public class A1 {
    public static void main(String[] args) {
        int [] [] lotterynum= {
                {2, 6, 8, 9},
                {96, 85, 65, 25},
                {25, 36, 25, 63}
        };

        for(int i=0;i<3;i++)
        System.out.println(lotterynum[i][i]);

        System.out.println("-------------------------");

        for( int i=0;i<3;i++){
            for( int j=0;j<3;j++){
                System.out.println(lotterynum[i][j]);
            }
        }

        }
    }

