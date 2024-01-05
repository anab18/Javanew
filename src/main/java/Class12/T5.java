package Class12;
//reverse the sentence
public class T5 {
    public static void main(String[] args) {
        String str="This is sentence i want to reverse";
     String [] word=str.split(" ");

        for( String w:word){

            for (int i = w.length()-1; i >=0; i--) {
                System.out.print(w.charAt(i));
            }

            System.out.print(" ");



        }
}
}
