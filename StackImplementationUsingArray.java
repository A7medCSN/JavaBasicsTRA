import java.util.Arrays;

public class StackImplementationUsingArray {
    static int[] stack = new int[5];
    static int top = -1;

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
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.print("printing the stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void push(int element) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow. Cannot push " + element);
        }
        else {
            stack[++top] = element;
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
        }
        else {
            int removedElement = stack[top--];
            System.out.println("popped element is: " + removedElement);
        }
    }

    public static void isEmpty() {
        System.out.println("Is stack empty? " + (top == -1));
    }

    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        }
        else {
            System.out.println("element on the top of stack= " + stack[top]);
        }
    }
}
