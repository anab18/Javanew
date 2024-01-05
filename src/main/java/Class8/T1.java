package Class8;

public class T1 {
    public static void main(String[] args) {
        String[] name = {"Sidos", "Zeeshan", "Abid", "Sharif", "Zeeshan"};
        int count = 0;
        for (int i = 0; i < name.length; i++){
        if (name[i].equals("Zeeshan")) {
            count++;
        }
    }

        System.out.println("Zeeshan appeared"+count+"times");
}

}
