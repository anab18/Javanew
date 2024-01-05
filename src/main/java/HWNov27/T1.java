package HWNov27;
/*Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
 */
public class T1 {
    public static void main(String[] args) {
        String[][] groceryList = {
                {"Potato", "Carrot", "Onion", "Garlic"},
                {"Apple", "Banana", "kiwi", "Orange"},
                {"Milk", "Cheese", "Yogurt", "Butter"},
                {"Candy", "Chocolate", "cookie", "Cake"}};
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {

                System.out.print(groceryList[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        for (String[] list : groceryList) {
            for (String notes : list) {
                System.out.print(notes + " ");
            }
                System.out.println();
            }
        }
    }

