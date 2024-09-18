import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args){


// Question: Write a Java program that calculates the sum of all positive integers entered by the user until the user enters zero. Use a do-while loop to read the numbers and an if statement to check if the number is positive.
        Scanner scan = new Scanner(System.in);

        int sum=0;
        int input;

        do {
            System.out.println("enter integer:" );
            input  = scan.nextInt();
            if (input>0) {
                sum+=input;
            }
        }while (input!=0);
        System.out.println(sum);
    }
}
