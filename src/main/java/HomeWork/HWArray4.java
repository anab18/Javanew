package HomeWork;
//From an array of integer elements find the largest number.
public class HWArray4 {
    public static void main(String[] args) {
        int[] num={50,100,600,400,30,900};
        int largestNum=0;
        for(int i=1;i<num.length;i++) {
            if (num[i] > largestNum) {
                largestNum = num[i];
            }
        }
            System.out.println(largestNum);
        }
    }

