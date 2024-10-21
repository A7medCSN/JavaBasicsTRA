import java.util.HashMap;
import java.util.Map;

public class ValuesOfKeysCombined {
    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("n", "nnn");
        lettersRepresentation.put("b", "bbb");
        lettersRepresentation.put("c", "ccc");
        lettersRepresentation.put("a", "www");
        System.out.println("Map before modification: " + lettersRepresentation);
        combineValueOfKeys(lettersRepresentation);
    }

    public static void combineValueOfKeys(Map<String, String> lettersRepresentation) {
        
        if (lettersRepresentation.containsKey("b") && lettersRepresentation.containsKey("a")) {
            lettersRepresentation.put("ab", lettersRepresentation.get("a") + lettersRepresentation.get("b"));
            System.out.println("Map after modification: " + lettersRepresentation);
        } else if ((!lettersRepresentation.containsKey("b") && !lettersRepresentation.containsKey("a"))) {
            System.out.println("both keys a and b are missing");
        } else {
            System.out.println("there is no modification");
        }
    }
}

