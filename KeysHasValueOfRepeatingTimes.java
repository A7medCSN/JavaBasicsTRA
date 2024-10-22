import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysHasValueOfRepeatingTimes {
    public static void main(String[] args) {

        List<String> listOfKeys = Arrays.asList("a", "b", "c", "d", "a", "d", "a");
        setKeyValueToKeyOccurrence(listOfKeys);
    }

    public static void setKeyValueToKeyOccurrence(List<String> listOfKeys) {
        Map<String, Integer> keysWithValueZero = new HashMap<>();
        int count = 0;
        for (String key : listOfKeys) {
            if (keysWithValueZero.containsKey(key)) {
                count = keysWithValueZero.get(key);
                keysWithValueZero.put(key, ++count);
            } else {
                keysWithValueZero.put(key, 1);
            }
        }
        System.out.println(keysWithValueZero);
    }
}
