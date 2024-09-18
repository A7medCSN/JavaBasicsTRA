public class ForEachLoopwithArray {
    public static void main(String[] args){


//Question: Write a Java program that stores the first 10 positive integers in an array and then uses a for-each loop to print each number. Use an if statement inside the loop to print only even numbers.
//Expected Output: 2, 4, 6, 8, 10
        int [] num= new int[10];
        for (int i=0;i<num.length;i++){
            num[i]=i+1;
        }
        for (int n:num){
            if (n%2==0) System.out.println(n);

        }
    }
}
