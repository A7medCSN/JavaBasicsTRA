import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KeyRedundancyChecker {
    public static void main(String[] args) {

        List<String> listOfKeys = Arrays.asList("a", "b", "c", "d", "a", "d", "a", "c");
      setKeyValueToTrueOrFalse(listOfKeys);
    }
    public static void setKeyValueToTrueOrFalse(List<String> listOfKeys){

        HashMap<String, Boolean> map = new HashMap<>();
        for (String key : listOfKeys) {
            if (map.containsKey(key)) {
                map.put(key, true);
            } else {
                map.put(key, false);
            }
        }
        System.out.println(map);
    }
}
