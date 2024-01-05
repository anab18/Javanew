package HomeWork;

public class HWDec2 {
    public static void main(String[] args) {
        String day="Sunday";

       for(int i=day.length()-1;i>=0; i--){

         String reverse=" ";
                reverse +=day.charAt(i);

           System.out.print(reverse);
       }

    }
}
