import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an positive integer to check if it is prime: ");
        int number = scanner.nextInt();

            boolean isPrime = true;

            // Check for factors from 2 to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

