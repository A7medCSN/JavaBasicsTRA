
import java.util.Scanner;
public class CountOccurrencesOfSubstring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a phrase:");
        String phrase = scan.nextLine();
        phrase = phrase.replace(" ", "");
        System.out.println("enter a sub-phrase to find from original phrase:");
        String subStringTOFind = scan.nextLine();
        subStringTOFind = subStringTOFind.replace(" ", "");
        countOccurrences(phrase, subStringTOFind);
    }

    public static int countOccurrences(String str, String substr) {

        int occurrenceOfSubstring = 0;
        // str=abab
        //sub=ab
        int endingIndex = substr.length();
        for (int i = 0; i <= str.length() - substr.length(); i++) {
            String matchingCharacters = str.substring(i, endingIndex++);
            System.out.println(matchingCharacters);
            if (substr.equals(matchingCharacters)) {
                occurrenceOfSubstring++;
            }
        }
        System.out.println("occurrence= " + occurrenceOfSubstring);
        return occurrenceOfSubstring;
    }
}