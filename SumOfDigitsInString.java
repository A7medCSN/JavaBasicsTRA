public class SumOfDigitsInString {
    public static void main(String[] args) {

        String str = "fdg6gf3s2";
        findSumOfDigitsInString(str);
    }

    public static void findSumOfDigitsInString(String str) {
        int sum = 0;
        char[] lettersFromStr = str.toCharArray();
        for (char c : lettersFromStr) {
            if (Character.isDigit(c)) {
                String n = String.valueOf(c);
                int number = Integer.parseInt(n);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
