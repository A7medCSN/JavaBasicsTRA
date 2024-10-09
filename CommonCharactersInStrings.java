import java.util.*;

public class CommonCharactersInStrings {
    public static void main(String[] args) {

        String firstWord = "hello";
        String secondWord = "world";
        getCommonCharactersInTwoStrings(firstWord, secondWord);
    }

    public static void getCommonCharactersInTwoStrings(String firstWord, String secondWord) {

        List<Character> firstList = Arrays.asList(HelperUtils.convertStringToCharacterArray(firstWord));
        List<Character> secondList = Arrays.asList(HelperUtils.convertStringToCharacterArray(secondWord));
        Set<Character> repeatedCharacter = new HashSet<>(firstList);
        repeatedCharacter.retainAll(secondList);
        System.out.println(repeatedCharacter);
    }
}
