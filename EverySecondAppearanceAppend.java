import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EverySecondAppearanceAppend {
    public static void main(String[] args) {

        List<String> listOfKeys = Arrays.asList("a", "b", "a", "c", "a", "d", "c", "d", "w");
        getKeyInEvenOccurrence(listOfKeys);
    }

    public static void getKeyInEvenOccurrence(List<String> listOfKeys) {
        Map<String, Integer> map = new HashMap<>();
        int count;
        StringBuilder repeatedKey = new StringBuilder();
        for (String key : listOfKeys) {
            if (map.containsKey(key)) {
                count = map.get(key) + 1;
                map.put(key, count);
                if (count != 0 && count % 2 == 0) {
                    repeatedKey.append(key);
                }
            } else map.put(key, 1);
        }
        System.out.println(repeatedKey);
        System.out.println(map);

    }
}
