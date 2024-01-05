package HomeWork;

public class E12StringDemo {
    public static void main(String[] args) {

            String str="My name is John my number is 245-5525521";
            String number=str.replaceAll("[^0-9]","");
        System.out.println(number);

        StringBuilder stringbilder=new StringBuilder("Java");
        System.out.println(stringbilder);
    }
}
