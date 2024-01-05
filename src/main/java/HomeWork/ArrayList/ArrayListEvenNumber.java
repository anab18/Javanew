package HomeWork.ArrayList;

import java.util.ArrayList;

public class ArrayListEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500; i = i + 2) {
            evenNumbers.add(i);
        }
            System.out.println(evenNumbers);
        for(int x=0;x<evenNumbers.size();x++){
            if(evenNumbers.get(x)%5==0){
                evenNumbers.remove(x);
            }
        }
        System.out.print(evenNumbers);
    }
}