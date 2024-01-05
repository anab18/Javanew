package Class18;

public class CreditCard {

    void calculate(double amount) {
        double interest = amount * 5.25;
        System.out.println("Interest on " + amount + " is " + interest);
    }
}
    class Visa extends CreditCard{
        @Override
       void calculate(double amount) {
            double interest = amount * 5.25;
            System.out.println("Interest on " + amount + " is " + interest);
        }
    }
    class AX extends CreditCard{
        @Override
        void calculate(double amount) {
            double interest = amount * 5.25;
            System.out.println("Interest on " + amount + " is " + interest);
        }
    }
    class CreditCardTester{
        public static void main(String[] args) {
            AX n=new AX();
            n.calculate(540000);
            Visa v=new Visa();
            n.calculate(15000);
        }
    }

