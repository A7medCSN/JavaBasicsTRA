public class BreakandContinueinLoops {
    public static void main(String[] args){


//Question: Write a Java program that prints the numbers from 1 to 10 but skips the number 5 using a for loop and a continue statement. Also, use a break statement to stop the loop when the number 8 is reached.
//Expected Output: 1, 2, 3, 4, 6, 7
        for (int i=1;i<=10;i++){
            if (i==5) continue;
            if (i==8) break;
            System.out.print(","+i);
        }
    }
}
