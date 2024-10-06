import java.util.Stack;

public class EmptyStackChecker {
    static Stack<Integer> numbers = new Stack<>();

    public static void main(String[] args) {

        numbers.push(1);
        numbers.push(1);
        isEmpty();
        numbers.pop();
        isEmpty();
        numbers.pop();
        isEmpty();

    }

    public static void isEmpty() {
        Integer count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            count++;
        }
        if (count == 0) {
            System.out.println("the stack is empty");
        } else {
            System.out.println("the stack is not empty");
        }
    }
}