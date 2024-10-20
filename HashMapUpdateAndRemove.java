import java.util.HashMap;
import java.util.Map;

public class HashMapUpdateAndRemove {
    public static void main(String[] args) {

        Map<Character, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put('n', "aaa");
        lettersRepresentation.put('b', "bbb");
        lettersRepresentation.put('c', "ccc");
        lettersRepresentation.put('a', "www");
        replaceAndRemoveFromHashMap(lettersRepresentation);
    }

    public static void replaceAndRemoveFromHashMap(Map<Character, String> lettersRepresentation) {
        System.out.println("Map before modification: " + lettersRepresentation);
        if (lettersRepresentation.containsKey('b')) {
            if (lettersRepresentation.containsKey('a')) {
                lettersRepresentation.put('b', lettersRepresentation.get('a'));
            }
        }
        lettersRepresentation.remove('c');
        System.out.println("Map after modification: " + lettersRepresentation);

    }
}
