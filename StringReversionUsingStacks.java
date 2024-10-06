import java.util.ArrayList;
import java.util.Stack;

public class StringReversionUsingStacks {
    public static void main(String[] args) {

        String str = "Any String";
        reversingString(str);

    }

    public static void reversingString(String str) {

        Stack<Character> reversedString = new Stack<>();
        char[] letters = str.toCharArray();

        for (char c : letters) {
            reversedString.push(c);
        }
        //concurrent modification on data structure???
        StringBuilder s = new StringBuilder();
        while (!reversedString.isEmpty()) {
            char a = reversedString.pop();
            s.append(a);
        }
        System.out.println("String after reversed: " + s);
    }


}