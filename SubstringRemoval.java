public class SubstringRemoval {
    public static void main(String[] args) {

      removeSubstringFromString("Hello there", "llo");
      removeSubstringFromString("Hello there", "e");
      removeSubstringFromString("Hello there", "x");
      removeSubstringFromString("Hello there", "H");

    }
    public static void removeSubstringFromString(String baseString, String removedString){
        String newString = baseString.replaceAll("(?i)"+removedString, "");
        // "(?i)" used for case case-insensitive
        System.out.println(newString);
    }
}
