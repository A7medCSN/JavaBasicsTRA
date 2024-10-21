import java.util.HashMap;
import java.util.Map;

public class ValuesOfKeysCombined {
    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("n", "nnn");
        lettersRepresentation.put("b", "bbb");
        lettersRepresentation.put("c", "ccc");
        lettersRepresentation.put("a", "www");
        combineValueOfAAndB(lettersRepresentation);
    }

    public static void combineValueOfAAndB(Map<String, String> lettersRepresentation) {

        System.out.println("Map before modification: " + lettersRepresentation);
        if (lettersRepresentation.containsKey("b") && lettersRepresentation.containsKey("a")) {
            lettersRepresentation.put("ab", lettersRepresentation.get("a") + lettersRepresentation.get("b"));

        }
        System.out.println("Map after modification: " + lettersRepresentation);
    }
}

