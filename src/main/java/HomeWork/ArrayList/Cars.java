package HomeWork.ArrayList;

public class Cars {
    public static void main(String[] args) {
        java.util.ArrayList<String> cars = new java.util.ArrayList<>();
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Audi");
        cars.add("Tesla");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("*************");

        for(String s:cars){
            System.out.println(s);
        }

    }
}

