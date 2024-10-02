public class SubstringRemoval {
    public static void main(String[] args) {

        String baseString = "Hello there";
        String removedString = "x";
        String newString = baseString.replace(removedString, "");
        System.out.println(newString);
    }
}
