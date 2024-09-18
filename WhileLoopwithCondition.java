import java.util.Scanner;
public class WhileLoopwithCondition {
    public static void main(String[] args){

//Question: Write a Java program that keeps asking the user to enter a positive number until the user enters a negative number. Use a while loop and an if statement to check the number.
//Expected Output: The loop should keep running until a negative number is entered.

        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer:" );
        int input  = scan.nextInt();
        while (input>0){
            System.out.println("enter integer: ");
            input  = scan.nextInt();
        }
    }
}
