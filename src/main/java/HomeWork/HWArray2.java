package HomeWork;

//Create an array of animals and store 5 elements into it.
// Using 2 different loops print all elements from the array.
public class HWArray2 {
    public static void main(String[] args) {
        String[]animals={"Giraffe","Lion","Zebra","Tiger","Bison"};
        System.out.print(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);

        System.out.println();
        System.out.println("-------------");

        for(int i=0; i<animals.length; i++){
            System.out.print(animals[i]+" ");


        }
    }
}
