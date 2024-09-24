import java.util.Scanner;

public class SubstringBeginAndEnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string (at least 2 letters):");
        String str = scan.nextLine();
        without2(str);
    }

    public static void without2(String str) {
        String newStr;
        if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            newStr = str.substring(2, str.length());
            System.out.println(newStr);
        } else if (str.length() == 2) {
            System.out.println("");
        } else {
            System.out.println(str);
        }
    }
}
