import java.util.Scanner;
public class ThreeCopiesOfFirstTwoCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = scan.nextLine();
        extraFront(str);
    }

    public static void extraFront(String str) {
        if (str.length() >= 2) {
            String twoLetterStr = str.substring(0, 2);
            System.out.println(twoLetterStr.repeat(3));
        } else {
            System.out.println(str.repeat(3));
        }
    }
}
