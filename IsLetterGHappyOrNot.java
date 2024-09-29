public class IsLetterGHappyOrNot {
    public static void main(String[] args) {

        String str = "xxgx";
        gHappy(str);

    }

    public static void gHappy(String str) {

        boolean isHappy = false;
        char[] letters = str.toCharArray();

        for (int i = 1; i < letters.length - 1; i++) {
            if (letters[i] == 'g' && letters[i + 1] == 'g' || letters[i] == 'g' && letters[i - 1] == 'g') {
                isHappy = true;
            }
            else {
                isHappy = false;
            }
        }
        System.out.println(isHappy);
    }
}