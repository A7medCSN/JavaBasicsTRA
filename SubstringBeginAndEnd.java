import java.util.Scanner;

public class SubstringBeginAndEnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = scan.nextLine();
        removeFirst2Character(str);
    }

    public static void removeFirst2Character(String str) {

        Scanner scan = new Scanner(System.in);
        String newStr;

        while (str.length() < 2) {
            System.out.println("enter string longer than one character: ");
            str = scan.nextLine();
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            newStr = str.substring(2);
            System.out.println(newStr);
        } else if (str.length() == 2) {
            System.out.println();
        } else {
            System.out.println(str);
        }
    }
}
