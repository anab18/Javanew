package Class11;

public class T3 {
    public static void main(String[] args) {
        //print the all the index of letter a from above stringSystem.out.println(str.length());
        String str="Today is Saturday";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                System.out.println(i);
            }
        }
    }
}
