import java.util.Scanner;
public class NumberReversal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an positive integer to reverse its digits: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
