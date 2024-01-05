package HomeWork;
/*
Write program: User that has a constructor that initializes instance
variable name and mobile number. Create a subclass/child class  userInfo
that will have user address variable and it also being initialized through
constructor call. Print users name, mobile number and address in userDetails
 method. Test your code.
 */
public class User {
    String name;
    int MobileNum;

    User(String name, int MobileNum) {
        this.name = name;
        this.MobileNum = MobileNum;
    }
}
    class UserInfo extends User {
        String address;

        UserInfo(String name, int MobileNum, String address) {
            super(name, MobileNum);
            this.address = address;
        }

        void userDetails() {
            System.out.println(name + " " + MobileNum + " " + address);
        }

    public static void main(String[] args) {

            UserInfo  m  = new UserInfo("Mike", 773252562,"2 Powell ave,Lyons Il ");
        m.userDetails();
        }

    }







