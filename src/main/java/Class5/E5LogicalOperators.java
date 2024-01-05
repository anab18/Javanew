package Class5;

public class E5LogicalOperators {
    public static void main(String[] args) {
        boolean isGvbl=false;
        boolean isWifiAvbl=true;

        if(isWifiAvbl||isGvbl){
            System.out.println("You can browse the internet");
        }else{
            System.out.println("Can't use internet");
        }
    }
}
