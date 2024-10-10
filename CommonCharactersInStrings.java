import java.util.*;

public class CommonCharactersInStrings {
    public static void main(String[] args) {

        String firstWord = "hello";
        String secondWord = "world";
        getCommonCharactersInTwoStrings(firstWord, secondWord);
    }

    public static Character[] covertStringToCharArray(String str) {

        char[] lettersOfFirstWord = str.toCharArray();
        Character[] letters1 = new Character[lettersOfFirstWord.length];
        for (int i = 0; i < lettersOfFirstWord.length; i++) {
            letters1[i] = lettersOfFirstWord[i];
        }
        return letters1;
    }

    public static void getCommonCharactersInTwoStrings(String firstWord, String secondWord) {

        List<Character> firstList = new ArrayList<>(List.of(covertStringToCharArray(firstWord)));
        List<Character> secondList = new ArrayList<>(List.of(covertStringToCharArray(secondWord)));
        Set<Character> repeatedCharacter = new HashSet<>(firstList);
        repeatedCharacter.retainAll(secondList);
        System.out.println(repeatedCharacter);
    }
}
