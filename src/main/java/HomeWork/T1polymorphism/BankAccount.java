package HomeWork.T1polymorphism;
/*
2)Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.
Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing and withdrawing funds.
 */
public class BankAccount {
    private int AccountNumber;
    private double Balance;
    private String accountHolderName;

    BankAccount( String accountHolderName,int AccountNumber, double Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.accountHolderName = accountHolderName;}

    public void info() {
        System.out.println( "Account name: " + accountHolderName+", Account nr: " + AccountNumber + ", Amount balance $ " + Balance);
    }
    public void deposit(double Amount){
        double totalBal=Balance+Amount;
        System.out.println("Deposit $ "+Amount+" Current balance is " + totalBal);}

    public void withDraw(double Amount) {
        double totalBalance=Balance-Amount;
        System.out.println("withDraw $ "+Amount+ "Current balance $");}}
     class SavingsAccount extends BankAccount {
        private int interestFee;
         public SavingsAccount( String accountHolderName,int AccountNumber, double Balance, int interestFee) {
            super(accountHolderName,AccountNumber,Balance);
         this.interestFee=interestFee;}
         @Override
         public void info(){super.info();}

         public void deposit(double Amount,double Balance){
             double totalBal=Balance+Amount;
             System.out.println("Deposit $ "+Amount+" Current balance is " + totalBal);}

         public void wiDraw(double Amount,double Balance) {
             double totIncludInterest=(Balance+Amount)-interestFee;
            System.out.println("WithDraw $"+Amount+ "Current balance included interest fee $"+totIncludInterest);
        }}

        class CheckingAccount extends BankAccount {
    double Balance;
            public CheckingAccount( String accountHolderName,int AccountNumber, double Balance) {
                super(accountHolderName,AccountNumber,Balance);}

            public void deposit(double Amount){
                double totalBal=Balance+Amount;
                System.out.println("Deposit $ "+Amount+" Current balance is " + totalBal);}

            public void withDraw(double Amount) {
                double totalBalance=Balance-Amount;
                System.out.println("withDraw $ "+Amount+ "Current balance $");
            }}
            class FixedDepositAccount extends BankAccount {
    double Balance;
                FixedDepositAccount(String accountHolderName,int AccountNumber, double Balance, int interestFee) {
                    super(accountHolderName,AccountNumber,Balance);}
                public void deposit(double Amount){
                    double totalBal=Balance+Amount;
                    System.out.println("Deposit $ "+Amount+" Current balance is " + totalBal);}

                public void withDraw(double Amount) {
                    double totalBalance=Balance-Amount;
                    System.out.println("withDraw $ "+Amount+ "Current balance $");
                }}


