package HomeWork;

public class HomeWorkReview2 {
    public static void main(String[] args) {
        double mortgageRate=4.5;
        int mortgagePrice=100000;
        if(mortgageRate>4.5){
            System.out.println("user will not buy a house");
        }else{
            System.out.println("user will consider buying");

        }
        if(mortgagePrice>100000){
            System.out.println("user will take a loan");

        }else{
            System.out.println(" user will pay cash");
        }
    }
}
