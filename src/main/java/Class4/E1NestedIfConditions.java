package Class4;

public class E1NestedIfConditions {
    public static void main(String[] args) {
        boolean isMainDoorOpened = true;
        boolean isRoom10Opened = false;
        boolean isRoom2Opened = true;

        if (isMainDoorOpened) {
            if (isRoom10Opened) {
                System.out.println("We are in Room");
            } else {
                System.out.println("Room 1 is close");
            }
if (isRoom2Opened){
    System.out.println("We are in the room2");
}else{
    System.out.println("Room 2 is close");
}
        } else {
            System.out.println("Can't enter the house main door is close");
        }

    }
}
