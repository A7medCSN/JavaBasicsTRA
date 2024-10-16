import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackWithUserInput {
    public static void main(String[] args) {
      Stack<Integer> numbers = new Stack<>();
        Scanner scan = new Scanner(System.in);
        Integer stackElements;
        System.out.println("enter stack element, enter -1 to stop:");
        stackElements = scan.nextInt();
        while (stackElements != -1) {
            numbers.push(stackElements);
            stackElements = scan.nextInt();
        }
        System.out.println("your stack is " + numbers);
    }
}
