package Class13;
//Write a method to return whether
// given number is prime or not?
public class T6 {
    void isPrime(int num){
        boolean b=false;
        for(int i=2;i<num/2; ++i){
            if (num % i ==0){
                b=true;
                break;
            }
        }
        if(!b)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+ " is not a prime number");
    }
}
