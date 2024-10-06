import java.util.Stack;

public class StackWithPushAndFindMaximum {
    static Stack<Integer> numbers = new Stack<>();

    public static void main(String[] args) {
        push(3);
        push(6);
        push(4);
        findMax();

    }

    public static void push(Integer element) {
        numbers.addFirst(element);
    }

    public static void findMax() {
        Integer max = 0;
        for (Integer i : numbers) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("maximum element is " + max);
    }
}