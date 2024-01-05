package Class22;

public class BankAccount {
    private double balance;
   private String userName;
    private String passWord;
public BankAccount(double balance,String userName,String passWord){
    this.balance=balance;
    this.userName=userName;
    this.passWord=passWord;
}
    void login(){
        System.out.println("Log in");
    }
    void transferFounds(){
        System.out.println("transfer");
    }
    void resetPassword(){
        System.out.println("reset passord");
    }
    public double getBalance(){
    return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
