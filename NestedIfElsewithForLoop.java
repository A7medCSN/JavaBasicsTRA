public class NestedIfElsewithForLoop {
    public static void main(String[] args){


//Question: Write a Java program that prints "Fizz" for numbers divisible by 3, "Buzz" for numbers divisible by 5, and "FizzBuzz" for numbers divisible by both 3 and 5, using a for loop from 1 to 15.
        for (int i=1;i<=15;i++){
            if (i%3==0) System.out.println("Buzz");
            else if (i%5==0) System.out.println("Fizz");
            else if (i%5==0 && i%3==0)
            {System.out.println("FizzBuzz");}
            else System.out.print("");

        }
    }
}
