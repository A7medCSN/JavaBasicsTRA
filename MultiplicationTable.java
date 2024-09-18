import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("enter number from 1 to 10: ");
        int input  = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(input*i);
        }
    }
}
