public class RecursiveExtractionOfParenthesisAndContents {

    public static void main(String[] args) {

        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
    }

    public static StringBuilder parenBit(String inputString) {

        StringBuilder newString = new StringBuilder();
        if (inputString.charAt(0) == '(' && inputString.charAt(inputString.length() - 1) == ')') {
            return newString.append(inputString);
        } else if (inputString.charAt(0) != '(') {
            newString = parenBit(inputString.substring(1));
        } else {
            newString = parenBit(inputString.substring(0, inputString.length() - 1));
        }
        return newString;
    }

}

