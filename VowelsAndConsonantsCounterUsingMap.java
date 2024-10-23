import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class VowelsAndConsonantsCounterUsingMap {
    public static void main(String[] args) {

        String inputString = "Hello World ! 123";
        inputString = inputString.toLowerCase();
        inputString = inputString.replaceAll("[^a-z]", "");
        countingVowelsAndConsonantInString(inputString);
    }

    public static void countingVowelsAndConsonantInString(String inputString) {

        Map<Character, Integer> vowelsCharsMap = new TreeMap<>();
        Map<Character, Integer> consonantsCharsMap = new TreeMap<>();
        int vowelsCounter;
        int consonantsCounter;
        for (int i = 0; i < inputString.length(); i++) {
            char seenCharacter = inputString.charAt(i);
            if (vowelsCharsMap.containsKey(seenCharacter)) {
                vowelsCounter = vowelsCharsMap.get(seenCharacter);
                vowelsCharsMap.put(seenCharacter, ++vowelsCounter);
            } else if (consonantsCharsMap.containsKey(seenCharacter)) {
                consonantsCounter = consonantsCharsMap.get(seenCharacter);
                consonantsCharsMap.put(seenCharacter, ++consonantsCounter);
            } else if (seenCharacter == 'a' || seenCharacter == 'e' || seenCharacter == 'o' || seenCharacter == 'i' || seenCharacter == 'u') {
                vowelsCharsMap.put(seenCharacter, 1);
            } else {
                consonantsCharsMap.put(seenCharacter, 1);
            }
        }
        System.out.println("Vowels: " + vowelsCharsMap);
        System.out.println("Consonants: " + consonantsCharsMap);
    }
}
