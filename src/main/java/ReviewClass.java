public class ReviewClass {

    //for logical && all condition needs to be true to get a true
    public static void main(String[] args) {
        boolean rain=false;
        boolean cold=true;

        if (cold && rain){
            System.out.println("I am staying home");

        }
boolean messageDisplayed=true;
        String errorMessage="Invalid credentials";

        if (messageDisplayed && errorMessage.equals("Invalid Credentials")) {
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }

    }
}


