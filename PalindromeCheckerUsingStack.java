import java.util.Stack;

public class PalindromeCheckerUsingStack {
    public static void main(String[] args) {

        String str = "racecar";
        checkForPalindrome(str);
    }

    public static void checkForPalindrome(String str) {

        Stack<Character> reversedString = new Stack<>();
        char[] letters = str.toCharArray();

        for (char c : letters) {
            reversedString.push(c);
        }

        StringBuilder s = new StringBuilder();
        while (!reversedString.isEmpty()) {
            char a = reversedString.pop();
            s.append(a);
        }
        String tempStr = s.toString();
        if (tempStr.equals(str)) {
            System.out.println("the word is Palindrome");
        } else {
            System.out.println("the word is NOT Palindrome");
        }

    }
}
