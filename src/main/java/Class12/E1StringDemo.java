package Class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Its Saavera's Birthday. Its Sunday.Today is Java class.";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
    }
}
