package class14;

public class Account {
    String accountNumber = "-125666";
    private double balance = -5245;
    private String userName = "User125=";
    private String password = "Pass123";

    void printHello1() {
        System.out.println("Welcome to bank of america");
    }

    public void Hello() {
        System.out.println("Welcome Custumer");
    }

    private void printInfo() {
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {

        Account a = new Account();
        System.out.println(a.password);
        a.printInfo();


        MyClass n=new MyClass();
    }


    private  static class MyClass{

    }
}