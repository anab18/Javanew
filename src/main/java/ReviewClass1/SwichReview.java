package ReviewClass1;

public class SwichReview {
    public static void main(String[] args) {
        /*
        switch(variable)
        case value1:
        code to excute;
        break;
         */

    int electionYear=2016;
    switch (electionYear) {
        case 2020:
            System.out.println("President Biden");
            break;
        case 2016:
            System.out.println("President is Trump");
            break;
        case 2012:
            System.out.println("President is Obama");
            break;
        default:
            System.out.println("President is unknown");


    }
    }



}
