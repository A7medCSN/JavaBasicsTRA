import java.util.HashMap;
import java.util.Map;

public class IngredientAdjustment {
    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("ice cream", "cherry");
        lettersRepresentation.put("yogurt", "salt");
        lettersRepresentation.put("spinach", "dirt");
        changeIngredient(lettersRepresentation);
    }

    public static void changeIngredient(Map<String, String> lettersRepresentation) {

        System.out.println("Map before modification: " + lettersRepresentation);
        if (lettersRepresentation.containsKey("ice cream")) {
            lettersRepresentation.put("yogurt", "cherry");
        }
        if (lettersRepresentation.containsKey("spinach")) {
            lettersRepresentation.put("spinach", "nuts");
        }
        System.out.println("Map after modification: " + lettersRepresentation);
    }
}
