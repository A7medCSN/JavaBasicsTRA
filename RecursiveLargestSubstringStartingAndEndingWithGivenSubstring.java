public class RecursiveLargestSubstringStartingAndEndingWithGivenSubstring {
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }

    public static Integer strDist(String inputString, String inputSubString) {

        if (!inputString.contains(inputSubString)) {
            return 0;
        } else if (inputString.startsWith(inputSubString) && inputString.endsWith(inputSubString)) {
            return inputString.length();
        } else if (!inputString.startsWith(inputSubString)) {
            return strDist(inputString.substring(1), inputSubString);
        } else if (!inputString.endsWith(inputSubString)) {
            return strDist(inputString.substring(0, inputString.length() - 1), inputSubString);
        }
        return inputString.length();
    }
}
