import java.util.Scanner;

public class checkIfTwoStringsAreRotations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter string 1: ");
        String str1 = scan.nextLine();
        System.out.println("enter string 2: ");
        String str2 = scan.nextLine();
        areRotations(str1, str2);
    }

    public static boolean areRotations(String str1, String str2) {
        boolean res;
        String concString;
        concString = str1.concat(str1);
        res = concString.contains(str2);
        System.out.println(res);
        return res;
    }
}
