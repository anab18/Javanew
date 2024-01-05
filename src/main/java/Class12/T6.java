package Class12;

public class T6 {
    public static void main(String[] args) {
        String str = "mina";
        String reversedWord="";

        for (int i = str.length() - 1; i >=0; i--) {
            reversedWord = reversedWord + str.charAt(i);
        }
            if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a palindrome");
            }else{
            System.out.println("It's not a palindrome");
            }
        }
    }
