import java.util.HashMap;
import java.util.Map;

public class MapValueTakingFromA {
    public static void main(String[] args) {

        Map<Character, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put('n', "nnn");
        lettersRepresentation.put('b', "bbb");
        lettersRepresentation.put('c', "ccc");
        lettersRepresentation.put('a', "www");
        System.out.println("Map before modification: " + lettersRepresentation);
        updateMapWithAValue(lettersRepresentation);
    }

    public static void updateMapWithAValue(Map<Character, String> lettersRepresentation) {

        if (lettersRepresentation.containsKey('b') && lettersRepresentation.containsKey('a')) {
            lettersRepresentation.put('b', lettersRepresentation.get('a'));
            lettersRepresentation.put('a', "");
            System.out.println("Map after modification: " + lettersRepresentation);
        } else {
            System.out.println("there is no modification");
        }

    }
}
