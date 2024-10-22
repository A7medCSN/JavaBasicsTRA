import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstAndLastCharacterPairs {
    public static void main(String[] args) {

        List<String> listOfWords = Arrays.asList("apple", "back", "car", "dream");
        setKeyValueToKeylength(listOfWords);
    }

    public static void setKeyValueToKeylength(List<String> listOfWords) {
        Map<String, String> keysWithValueZero = new HashMap<>();
        for (String key : listOfWords) {
            keysWithValueZero.put(key.substring(0, 1), key.substring(key.length() - 1));
        }
        System.out.println(keysWithValueZero);
    }
}
