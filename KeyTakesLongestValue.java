import java.util.HashMap;
import java.util.Map;

public class KeyTakesLongestValue {
    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("b", "bb");
        lettersRepresentation.put("c", "cake");
        lettersRepresentation.put("a", "aaa");
        System.out.println("Map before modification: " + lettersRepresentation);
        removeKeysIfHsSameValues(lettersRepresentation);
    }

    public static void removeKeysIfHsSameValues(Map<String, String> lettersRepresentation) {

        if ((lettersRepresentation.containsKey("b") && lettersRepresentation.containsKey("a"))) {
            if (lettersRepresentation.get("a").length() > lettersRepresentation.get("b").length()) {
                lettersRepresentation.put("c", lettersRepresentation.get("a"));
            }
            if (lettersRepresentation.get("a").length() < lettersRepresentation.get("b").length()) {
                lettersRepresentation.put("c", lettersRepresentation.get("b"));
            }
            if (lettersRepresentation.get("a").length() == lettersRepresentation.get("b").length()) {
                lettersRepresentation.replace("a", "");
                lettersRepresentation.replace("b", "");
            }
            System.out.println("Map after modification: " + lettersRepresentation);

        } else if ((!lettersRepresentation.containsKey("b") && !lettersRepresentation.containsKey("a"))) {
            System.out.println("both keys a and b are missing");
        } else {
            System.out.println("there is no modification");
        }
    }
}

