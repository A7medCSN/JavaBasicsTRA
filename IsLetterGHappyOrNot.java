public class IsLetterGHappyOrNot {
    public static void main(String[] args) {
        String str = "xxgggx";
        System.out.println(gHappy(str));
    }

    public static boolean gHappy(String str) {
        if (str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftHappy = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightHappy = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
                if (!leftHappy && !rightHappy) {
                    return false;
                }
            }
        }
        return true;
    }
}