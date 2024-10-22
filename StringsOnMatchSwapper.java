import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringsOnMatchSwapper {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz");
        swapArrayElementsIfHasSameFirstChar(listOfStrings);
    }

    public static void swapArrayElementsIfHasSameFirstChar(List<String> listOfStrings) {
        Map<String, Integer> map = new HashMap<>();
        String temp;
        for (int i = 0; i < listOfStrings.size(); i++) {
            String firstChar = listOfStrings.get(i).substring(0, 1);
            if (map.containsKey(firstChar)) {
                int indexToSwap = map.get(firstChar);
                temp = listOfStrings.get(i);
                listOfStrings.set(i, listOfStrings.get(indexToSwap));
                listOfStrings.set(indexToSwap, temp);
                map.remove(firstChar);

            } else {
                map.put(firstChar, i);
            }

        }
        System.out.println(listOfStrings);
    }
}
