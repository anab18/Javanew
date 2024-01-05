package Class13;
// Create a method that will print whether given String is
//palindrome or not
public class T3 {
//Create a method that will print whether given String
    //is palindrome or not
      void isPalindrome(String str){
          String reversedWord="";
        for (int i =str.length()-1; i >=0; i--) {
            reversedWord = reversedWord + str.charAt(i);
        }
        if(str.equals(reversedWord)) {
            System.out.println("It's palindrome");
        }else{
            System.out.println("It's not a palindrome");

        }

    }


}
