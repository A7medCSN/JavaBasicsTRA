import java.util.Scanner;
public class removeSpecificCharacter {
    public static void main(String[] args) {

        System.out.println("enter string: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        System.out.println("enter character to be removed: ");
        char letterToRemove = scan.next().charAt(0);
        removeCharacter(sentence, letterToRemove);

    }

    public static StringBuilder removeCharacter(String str, char ch) {
        char [] letters=str.toCharArray();
        StringBuilder newStr = new StringBuilder();

        for(char c : letters){
            if (c!=ch){
             newStr.append(c);
            }
        }
        /* there is more easy way to do that
        String str;
        String ch; // character will be declared as string not char.
        a=a.replace(c,"");
        System.out.println(a);
*/
        System.out.println("after remove:" + newStr);
        return newStr;
    }
}
