public class LargestBlockofConsecutiveIdenticalCharacters {

    public static void main(String[] args) {

        String str = "assggg";
        mostRepeatedCharacter(str);
    }

    public static void mostRepeatedCharacter(String str) {
        char[] letters = str.toCharArray();
        int count = 1;
        int maxCount = 0;
        for (int i = 1; i < letters.length; i++) {

            if (letters[i] == letters[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }

        }
        if (count > maxCount) {
            maxCount = count;
        }
        System.out.println("longest repeated character count= " + maxCount);
    }
}
