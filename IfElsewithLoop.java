public class IfElsewithLoop {
    public static void main(String[] args){

//Question: Write a Java program that prints all even numbers between 1 and 20 using a for loop. Use an if-else statement inside the loop to determine if a number is even.
//Expected Output: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20

                for (int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
