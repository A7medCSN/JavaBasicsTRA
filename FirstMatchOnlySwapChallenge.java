import java.util.*;

public class FirstMatchOnlySwapChallenge {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("ax", "bx", "cx", "cy", "by", "ay", "cz", "aaa", "azz", "qr", "qw");
        swapArrayElementsOnceIfHasSameFirstChar(listOfStrings);
    }

    public static void swapArrayElementsOnceIfHasSameFirstChar(List<String> listOfStrings) {
        Map<String, Integer> unSwappedCharLocationMap = new HashMap<>();
        Map<String, Integer> swappedChars = new HashMap<>();
        String temp;

        for (int i = 0; i < listOfStrings.size(); i++) {

            String characterToSee = listOfStrings.get(i).substring(0, 1);

            if (swappedChars.containsKey(characterToSee)) {
                continue;
            }
            if (unSwappedCharLocationMap.containsKey(characterToSee)) {
                int indexToSwap = unSwappedCharLocationMap.get(characterToSee);
                temp = listOfStrings.get(i);
                listOfStrings.set(i, listOfStrings.get(indexToSwap));
                listOfStrings.set(indexToSwap, temp);

                swappedChars.put(characterToSee, 0);
                unSwappedCharLocationMap.remove(characterToSee);

            } else {
                unSwappedCharLocationMap.put(characterToSee, i);

            }
        }
        System.out.println(listOfStrings);
    }
}
