
import java.util.HashMap;
import java.util.Map;

public class HashMapFundamental {

    public static void main(String[] args) {
        Map<String, Integer> stockOfFruits = new HashMap<>();

        stockOfFruits.put("Apple", 10);
        stockOfFruits.put("Banana", 20);
        stockOfFruits.put("Orange", 30);
        System.out.println("Initial HashMap: " + stockOfFruits);

        int appleCount = stockOfFruits.get("Orange");
        System.out.println("Orange count: " + appleCount);

        stockOfFruits.put("Pear",40);
        System.out.println("HashMap after adding Pear: " + stockOfFruits);

        stockOfFruits.remove("Banana");
        System.out.println("HashMap after removing Banana: " + stockOfFruits);


        if (!stockOfFruits.containsKey("Watermelon")) {
            System.out.println("HashMap !contains key Watermelon");
        }

        System.out.println("Size of HashMap: " + stockOfFruits.size());

        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : stockOfFruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}