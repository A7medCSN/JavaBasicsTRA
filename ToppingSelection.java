import java.util.HashMap;
import java.util.Map;

public class ToppingSelection {
    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("ice cream", "chocolate");
        lettersRepresentation.put("pancake", "syrup");
        lettersRepresentation.put("bread", "butter");
        changeTopping(lettersRepresentation);
    }

    public static void changeTopping(Map<String, String> lettersRepresentation) {

        System.out.println("Map before modification: " + lettersRepresentation);
        if (lettersRepresentation.containsKey("ice cream")) {
            lettersRepresentation.put("ice cream", "cherry");
        }
        if (!lettersRepresentation.containsKey("bread")) {
            lettersRepresentation.put("bread", "butter");
        }

        System.out.println("Map after modification: " + lettersRepresentation);
    }
}
