import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStringsByFirstCharacter {
    public static void main(String[] args) {

        List<String> listOfWords = Arrays.asList("salt", "tea", "soda", "toast");
        setKeyValueToFirstChar(listOfWords);
    }

    public static void setKeyValueToFirstChar(List<String> listOfWords) {
        Map<String, String> map = new HashMap<>();

        for (String word : listOfWords) {
            String firstChar = word.substring(0, 1);
            if (map.containsKey(firstChar)) {
                map.put(firstChar, map.get(firstChar) + word);
            } else {
                map.put(firstChar, word);
            }
        }
        System.out.println(map);
    }

}

