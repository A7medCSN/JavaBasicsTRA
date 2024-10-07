import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string:");
        String str1 = scan.nextLine();
        System.out.println("enter second string:");
        String str2 = scan.nextLine();
        concatenateStrings(str1, str2);
    }

    public static void concatenateStrings(String str1, String str2) {
        String concStr;

        if (str1.length() == str2.length()) {
            concStr = str1.concat(str2);
        } else if (str1.length() > str2.length()) {
            str1 = str1.substring(str1.length() - str2.length());
            concStr = str1.concat(str2);
        } else {
            str2 = str2.substring(str2.length() - str1.length());
            concStr = str1.concat(str2);

        }
        System.out.println("after concatenating: " + concStr);
    }
}
