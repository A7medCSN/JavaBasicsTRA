public class RecursiveStringModificationWithStarSeparator {
    public static void main(String[] args) {

        System.out.println(allStar("hello gty"));
    }

    public static StringBuilder allStar(String inputString) {
        StringBuilder newString = new StringBuilder();
        if (inputString.length() <= 1) {
            newString.append(inputString);
        } else {
            newString.append(inputString.charAt(0)).append("*").append(allStar(inputString.substring(1)));
        }
        return newString;
    }
}
