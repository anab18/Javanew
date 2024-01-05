package Class11;

public class T1 {
    public static void main(String[] args) {
         String username="AnaB";
         String password="Batch2023";
         String confirmPassword="Batch2023";

         if(username.isEmpty() ||password.isEmpty()) {
             System.out.println("Useror password cannot be empty");
         }else if(password.length()<8) {
             System.out.println("Password is too short");
         }else if(password.contains(username)){
             System.out.println("Password cannot contain username");
         }else if(!password.equals(confirmPassword)){
             System.out.println("Password do not match");
         }else{
             System.out.println("Username and password has been created");
         }


        }
    }

