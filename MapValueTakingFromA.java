import java.util.HashMap;
import java.util.Map;

public class MapValueTakingFromA {
    public static void main(String[] args) {

        Map<Character, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put('n', "nnn");
        lettersRepresentation.put('b', "bbb");
        lettersRepresentation.put('c', "ccc");
        lettersRepresentation.put('a', "www");
        getValueOfA(lettersRepresentation);
    }

    public static void getValueOfA(Map<Character, String> lettersRepresentation) {

        System.out.println("Map before modification: " + lettersRepresentation);
        if (lettersRepresentation.containsKey('b')) {
            if (lettersRepresentation.containsKey('a')) {
                lettersRepresentation.put('b', lettersRepresentation.get('a'));
                lettersRepresentation.put('a', "");
            }
        }
        System.out.println("Map after modification: " + lettersRepresentation);
    }
}
