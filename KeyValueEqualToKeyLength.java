import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValueEqualToKeyLength {
    public static void main(String[] args) {

        List<String> listOfKeys = Arrays.asList("apple", "back", "car", "dream");
        setKeyValueToKeylength(listOfKeys);
    }

    public static void setKeyValueToKeylength(List<String> listOfKeys) {
        Map<String, Integer> keysWithValueZero = new HashMap<>();
        for (String key : listOfKeys) {
            keysWithValueZero.put(key, key.length());
        }
        System.out.println(keysWithValueZero);
    }
}
