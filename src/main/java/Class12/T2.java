package Class12;
// Create a String that should be combination of letters, numbers and special
// characters. Find out how many alpha characters are there in the String.

public class T2 {
    public static void main(String[] args) {
        String str=" DSFFG#$%^&*(3548614GDJFKGLL<MN";
        System.out.println(str.replaceAll("[^A-Za-z]",""));
        System.out.println(str.length());


}}
