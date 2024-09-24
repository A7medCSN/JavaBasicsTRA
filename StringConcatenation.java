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
        String concStrIfEqual;
        String concStrIfNotEqual1;
        String concStrIfNotEqual2;

        if (str1.length() == str2.length()) {
            concStrIfEqual = str1.concat(str2);
            System.out.println("after concatenating: " + concStrIfEqual);
        } else if (str1.length() > str2.length()) {
            str1 = str1.substring(str1.length() - str2.length());
            concStrIfNotEqual1 = str1.concat(str2);
            System.out.println("after concatenating: " + concStrIfNotEqual1);
        } else {
            str2 = str2.substring(str2.length() - str1.length());
            concStrIfNotEqual2 = str1.concat(str2);
            System.out.println("after concatenating: " + concStrIfNotEqual2);
        }
    }
}
