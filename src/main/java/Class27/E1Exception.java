package Class27;

public class E1Exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        try {
            // System.out.println(10 / 0);
            String name = null;
            System.out.println(name.length());
        }catch(ArithmeticException e){
            System.out.println("Please don't try to divide by zero it is a not allwed in java");
        }catch (NullPointerException a) {
            System.out.println("Make sure your obj.is initialed properly");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Make sure your index is greater than 0 and less than the size");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("6");
        System.out.println("8");
    }
}
