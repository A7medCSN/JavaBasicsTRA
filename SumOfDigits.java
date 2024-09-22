import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // last digit
            sum += digit;
            number /= 10; // remove last digit
        }
        System.out.println("The sum of the digits is: " + sum);

    }
}
