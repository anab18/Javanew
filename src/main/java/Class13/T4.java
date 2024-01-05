package Class13;
//Create a method that will say Hello in different
// language based on the country that will passed
// when method is executed.
// Do it for any five countries
public class T4 {
    void differentLanguage(String Hello) {
        if (Hello.equalsIgnoreCase("Russian")) {
            System.out.println("Privet");
        } else if (Hello.equalsIgnoreCase("Romanian")){
            System.out.println("Buna");
        } else if (Hello.equalsIgnoreCase("Spanish")){
            System.out.println("Ola");
        } else if (Hello.equalsIgnoreCase("English")){
            System.out.println("Hello");
        } else if (Hello.equalsIgnoreCase("French")){
            System.out.println("Bonjour");
        }
    }

}
