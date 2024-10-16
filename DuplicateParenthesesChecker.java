import java.util.Stack;

public class DuplicateParenthesesChecker {
    static Stack<Character> parenthesesStack = new Stack<>();
    static Stack<Character> parenthesesStack2 = new Stack<>();

    public static void main(String[] args) {

        String str = "((a+b))";
        checkIfParenthesesAreDuplicate(str);
    }

    public static void checkIfParenthesesAreDuplicate(String str) {

        char[] letters = str.toCharArray();
        for (char c : letters) {
            if (c == 40) {
                parenthesesStack.push(c);
            }
        }
        for (char b : letters) {
            if (b == 41) {
                parenthesesStack2.push(b);
            }
        }

        if (parenthesesStack.size() == 0 && parenthesesStack2.size() == 0) {
            System.out.println("there is no parentheses in the string");
            return;
        } else if (parenthesesStack.size() == 0 || parenthesesStack2.size() == 0) {
            System.out.println("parentheses only in one direction");
            return;
        }

        if (parenthesesStack.size() % 2 == 0 && parenthesesStack2.size() % 2 == 0) {
            System.out.println("duplicate");
        } else {
            System.out.println("not duplicate");
        }

    }
}


