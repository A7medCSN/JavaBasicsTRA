import java.util.HashSet;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

        String pattern = "AABBBBA";
        int numberOfChanges = 1;
        int result = characterReplacement(pattern, numberOfChanges);
        System.out.println("Length of the longest substring: " + result);
    }

    public static int characterReplacement(String pattern, int numberOfChanges) {

        int[] charCount = new int[26];  // to count the occurrence of each letter, charCount[n]=0.
        HashSet<Character> seenCharacter = new HashSet<>();

        int maxCount = 0;
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < pattern.length(); end++) {
            char currentChar = pattern.charAt(end);
            seenCharacter.add(currentChar);
            charCount[currentChar - 'A']++;  // how many the char occur, based on its location in the array.

            maxCount = Math.max(maxCount, charCount[currentChar - 'A']);  //most repeated char.

            // Check if number of changes needed exceeds the allowed changes
            //(end - start + 1) - maxCount: gives # of non most frequency char
            if ((end - start + 1) - maxCount > numberOfChanges) {
                char startChar = pattern.charAt(start);
                charCount[startChar - 'A']--;  // Decrease the count of character that will be deleted.
                start++;  // reduce window size.
            }
            System.out.println(seenCharacter);

            maxLength = Math.max(maxLength, end - start + 1);  //stores the length of longest repeated char.
        }

        return maxLength;
    }
}
