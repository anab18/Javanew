package HomeWork.T1polymorphism;

public class BankAccountTester {
    public static void main(String[] args) {

               BankAccount BA= new BankAccount("Lion Smith",22225555,30000);
               BA.info();
               BA.deposit(200);
               BA.withDraw(50);
        System.out.println();
        CheckingAccount CB=new CheckingAccount("Veran Kici",28886666,2500);
        CB.deposit(1400);
        SavingsAccount SB=new SavingsAccount("Britney Spears",2524455,25000,35);
SB.info();
SB.deposit(300,25000);
SB.wiDraw(500,5300);
        System.out.println();
        FixedDepositAccount FD=new FixedDepositAccount("Michel Jackson",2525252,15000,35);
            FD.info();
            FD.deposit(600);
            FD.deposit(50);
        System.out.println();

    }
        }
