import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        Random random= new Random();
        int randomNumber= random.nextInt(101);
        System.out.println("Welcome to the Guessing Game !");
        System.out.println("Guess the number between 0-100 that is generated by the code");
        System.out.println("enter your guess:");
        int guess= scan.nextInt();
        int count=1;

        while (guess!=randomNumber){
            if (guess>randomNumber){
                System.out.println("Lower!,enter your guess:");
                guess= scan.nextInt();
                count++;
            }
            else if (guess<randomNumber){
                System.out.println("Higher!,enter your guess:");
                guess= scan.nextInt();
                count++;
            }
        }
        System.out.println("you guess the number correctly!");
        System.out.println("your total attempts are: "+count);

    }
}
