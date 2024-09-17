//Thursday  12/9/2024
import java.util.Scanner;
public class parctice_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
/*
//1. If-Else with Loop
//Question: Write a Java program that prints all even numbers between 1 and 20 using a for loop. Use an if-else statement inside the loop to determine if a number is even.
//Expected Output: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20

        for (int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


//2. Switch Statement
//Question: Write a Java program that uses a switch statement to print the name of the day based on a number from 1 to 7 (1 for Sunday, 2 for Monday, etc.). Use a for loop to print the day names for numbers 1 through 7.
//Expected Output: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
        for(int n=1;n<=7;n++){
        switch (n){
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("monday"); break;
            case 3: System.out.println("tuesday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("thursday"); break;
            case 6: System.out.println("friday"); break;
            case 7: System.out.println("saturday"); break;
        }}


//3. While Loop with Condition
//Question: Write a Java program that keeps asking the user to enter a positive number until the user enters a negative number. Use a while loop and an if statement to check the number.
//Expected Output: The loop should keep running until a negative number is entered.

 Scanner scan = new Scanner(System.in);
        System.out.println("enter integer:" );
        int input  = scan.nextInt();
  while (input>0){
      System.out.println("enter integer: ");
      input  = scan.nextInt();
  }

//4. Nested Loops with If-Else
//Question: Write a Java program to print a right-angled triangle pattern of stars (*) using nested for loops. The program should also skip printing the middle row of stars using an if-else statement.
int totalRows=5;

        for (int i = 1; i <= totalRows; i++) {
            // Skip the middle row
            if (i == totalRows / 2 + 1) {
                continue;
            }

            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

       // 5. Do-While Loop
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

//6. For Loop with Switch Case
//Question: Write a Java program that iterates through numbers 1 to 12 using a for loop and prints the corresponding month name for each number using a switch statement.

        for(int n=1;n<=12;n++){
            switch (n){
                case 1: System.out.println("Jan"); break;
                case 2: System.out.println("Feb"); break;
                case 3: System.out.println("Mar"); break;
                case 4: System.out.println("Apr"); break;
                case 5: System.out.println("May"); break;
                case 6: System.out.println("Jun"); break;
                case 7: System.out.println("Jul"); break;
                case 8: System.out.println("Aug"); break;
                case 9: System.out.println("Sep"); break;
                case 10: System.out.println("Oct"); break;
                case 11: System.out.println("Nov"); break;
                case 12: System.out.println("Dec"); break;
            }}


//7. Break and Continue in Loops
//Question: Write a Java program that prints the numbers from 1 to 10 but skips the number 5 using a for loop and a continue statement. Also, use a break statement to stop the loop when the number 8 is reached.
//Expected Output: 1, 2, 3, 4, 6, 7
        for (int i=1;i<=10;i++){
            if (i==5) continue;
            if (i==8) break;
            System.out.print(","+i);
        }


//8. Combining If-Else and While Loop
//Question: Write a Java program that reads numbers from the user and prints whether each number is even or odd. The program should stop reading when the user enters zero. Use a while loop and an if-else statement.
//Expected Output: The program should print "even" or "odd" for each number until zero is entered.
      int input;
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


//9. Nested If-Else with For Loop
//Question: Write a Java program that prints "Fizz" for numbers divisible by 3, "Buzz" for numbers divisible by 5, and "FizzBuzz" for numbers divisible by both 3 and 5, using a for loop from 1 to 15.
        for (int i=1;i<=15;i++){
            if (i%3==0) System.out.println("Buzz");
            else if (i%5==0) System.out.println("Fizz");
            else if (i%5==0 && i%3==0)
            {System.out.println("FizzBuzz");}
            else System.out.print("");

        }




//10. For-Each Loop with Array
//Question: Write a Java program that stores the first 10 positive integers in an array and then uses a for-each loop to print each number. Use an if statement inside the loop to print only even numbers.
//Expected Output: 2, 4, 6, 8, 10
        int [] num= new int[10];
        for (int i=0;i<num.length;i++){
            num[i]=i+1;
        }
        for (int n:num){
            if (n%2==0) System.out.println(n);

        }*/
    }
}

