import java.util.Scanner;

public class CountOccurrencesOfSubstring {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a phrase:");
        String phrase = scan.nextLine();
        System.out.println("enter a sub-phrase to find from original phrase:");
        String subStringTOFind = scan.nextLine();
        countOccurrences(phrase, subStringTOFind);

    }

    public static int countOccurrences(String str, String substr) {

        int occurrenceOfSubstring = 0;
        String[] phraseWords = str.split(" ");

        for (String s : phraseWords) {
            if (s.contains(substr) == true) {
                occurrenceOfSubstring++;

            }
        }
        System.out.println("occurrence= " + occurrenceOfSubstring);
        return occurrenceOfSubstring;
    }
}
