import java.util.ArrayList;

public class StackImplementationUsingArray {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        push(20);
        push(30);
        push(40);
        push(50);
        print();
        pop();
        print();
        isEmpty();
        peek();
    }

    public static void print() {
        System.out.println("printing the stack: " + numbers);
    }

    public static void push(Integer element) {
        numbers.addFirst(element);
    }

    public static void pop() {
        Integer removedElement = numbers.removeFirst();
        System.out.println("popping element");
        System.out.println("popped element is: " + removedElement);
    }

    public static void isEmpty() {
        System.out.println("Is stack empty? " + numbers.isEmpty());
    }

    public static void peek() {
        System.out.println("element on the top of stack= " + numbers.getFirst());

    }
}
