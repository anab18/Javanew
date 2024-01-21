package Class24.HW;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class T1 {
    public static void main(String[] args) {
        Map<Integer, String> BestBuyStore = new LinkedHashMap<>();
        BestBuyStore.put(12346, "Printer");
        BestBuyStore.put(242526, "TV");
        BestBuyStore.put(624521, "Coffee maker");
        BestBuyStore.put(864521, "Vacuum");
        var BestBuy = BestBuyStore.entrySet();
        System.out.println(BestBuy);

            System.out.println("-***************************-");
            BestBuyStore.forEach((i,s)->System.out.println(i+" "+s));
        }
    }