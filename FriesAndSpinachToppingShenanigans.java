import java.util.HashMap;
import java.util.Map;

public class FriesAndSpinachToppingShenanigans {
    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("potato", "ketchup");
        lettersRepresentation.put("salad", "oil");
        lettersRepresentation.put("spinach", "dirt");
        changeAndAddTopping(lettersRepresentation);
    }

    public static void changeAndAddTopping(Map<String, String> lettersRepresentation) {

        System.out.println("Map before modification: " + lettersRepresentation);
        if (lettersRepresentation.containsKey("potato")) {
            lettersRepresentation.put("fries", lettersRepresentation.get("potato"));
        }
        if (lettersRepresentation.containsKey("salad")) {
            lettersRepresentation.put("spinach", lettersRepresentation.get("salad"));
        }
        System.out.println("Map after modification: " + lettersRepresentation);
    }
}
