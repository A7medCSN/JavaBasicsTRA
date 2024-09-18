import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args){

Scanner scan=new Scanner(System.in);
        System.out.println("enter number to find the factorial:");
        int input1= scan.nextInt();
        int fact1=1;
        while (input1>0){

            fact1*=input1;
            input1--;
        }
        System.out.println("the factorial is "+fact1);
    }
}
