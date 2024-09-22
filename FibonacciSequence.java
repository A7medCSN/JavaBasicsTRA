import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            n = scanner.nextInt();
        } else {
            // Print the Fibonacci sequence
            System.out.print("Fibonacci sequence: ");
            int first = 0;
            int second = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }

    }
}
