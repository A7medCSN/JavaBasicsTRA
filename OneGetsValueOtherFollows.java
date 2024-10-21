import java.util.HashMap;
import java.util.Map;

public class OneGetsValueOtherFollows {

    public static final String KEY_A = "a";
    public static final String KEY_B = "b";

    public static void main(String[] args) {

        Map<String, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put("a", "aaa");
        // lettersRepresentation.put("b", "bbb");
        lettersRepresentation.put("c", "ccc");
        lettersRepresentation.put("d", "ddd");

        System.out.println("Map before modification: " + lettersRepresentation);

        if (checkIfModificationRequired(lettersRepresentation)) {
            getValueOfKeyAndFollow(lettersRepresentation);
            System.out.println("Map after modification: " + lettersRepresentation);
        } else System.out.println("no modification can be done");
    }

    public static void getValueOfKeyAndFollow(Map<String, String> lettersRepresentation) {
        if (lettersRepresentation.containsKey(KEY_B)) {
            lettersRepresentation.put(KEY_A, lettersRepresentation.get(KEY_B));

        } else if (lettersRepresentation.containsKey(KEY_A)) {
            lettersRepresentation.put(KEY_B, lettersRepresentation.get(KEY_A));
        }
    }

    public static Boolean checkIfModificationRequired(Map<String, String> mapToCheck) {
        if ((mapToCheck.containsKey(KEY_A) || mapToCheck.containsKey(KEY_B)) &&
                !(mapToCheck.containsKey(KEY_A) && mapToCheck.containsKey(KEY_B))) {
            return true;
        }
        return false;
    }
}
