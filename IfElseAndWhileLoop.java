import java.util.Scanner;
public class IfElseAndWhileLoop {
    public static void main(String[] args){


//Question: Write a Java program that reads numbers from the user and prints whether each number is even or odd. The program should stop reading when the user enters zero. Use a while loop and an if-else statement.
//Expected Output: The program should print "even" or "odd" for each number until zero is entered.
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer number:");
        input = scan.nextInt();
        while (input!=0){

            if (input%2==0){
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
            System.out.println("enter integer number:");
            input= scan.nextInt();
        }
    }
}
