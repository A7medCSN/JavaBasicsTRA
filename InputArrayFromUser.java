import java.util.Arrays;
import java.util.Scanner;

public class InputArrayFromUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter size for arrayA: ");
        int sizeA = scan.nextInt();
        int[] arrayA = new int[sizeA];
        System.out.println("enter elements for arrayA: ");
        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = scan.nextInt();
        }

        System.out.println("enter size for arrayB: ");
        int sizeB = scan.nextInt();
        int[] arrayB = new int[sizeB];
        System.out.println("enter elements for arrayB: ");
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = scan.nextInt();
        }
        System.out.print("arrayA= ");
        System.out.println(Arrays.toString(arrayA));
        System.out.print("arrayB= ");
        System.out.println(Arrays.toString(arrayB));

    }
}