public class LongestMirrorImage {

    public static void main(String[] args) {
        String str1 = "abXYZba";
        mirrorEnds(str1);
    }

    public static void mirrorEnds(String str) {
        char[] letters = str.toCharArray();
        StringBuilder mirrorCharacters = new StringBuilder();

        int length = letters.length;
        for (int i = 0; i < length; i++) {
            if (letters[i] == letters[length - i - 1]) {
                mirrorCharacters.append(letters[i]);
            } else {
                break;
            }
        }
        System.out.println(mirrorCharacters);
    }
}
