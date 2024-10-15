import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public static void main(String[] args) {

        String wordToCheck = "taco cat";
        isPalindrome(wordToCheck);


    }

    public static void isPalindrome(String wordToCheck) {

        wordToCheck = wordToCheck.replace(" ", "");
        Character[] listOfLetters = HelperUtils.convertStringToCharacterArray(wordToCheck);
        System.out.println(Arrays.asList(listOfLetters));
        Set<Character> letters = new HashSet<>();

        for (Character c : listOfLetters) {
            if (!letters.add(c)) {
                letters.remove(c);
            } else {
                letters.add(c);
            }
        }
        System.out.println("letters repeating odd number of time: " + letters);

        if (letters.size() >= 1) {
            System.out.println("Can the word be Palindrome: " + true);

        } else System.out.println("Can the word be Palindrome: " + false);
    }
}
