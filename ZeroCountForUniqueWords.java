import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroCountForUniqueWords {
    public static void main(String[] args) {

        List<String> listOfKeys = Arrays.asList("a", "b", "c", "d");
        setKeyValueToZero(listOfKeys);
    }

    public static void setKeyValueToZero(List<String> listOfKeys) {
        Map<String, Integer> keysWithValueZero = new HashMap<>();
        for (String key : listOfKeys) {
            keysWithValueZero.put(key, 0);
        }
        System.out.println(keysWithValueZero);
    }
}
