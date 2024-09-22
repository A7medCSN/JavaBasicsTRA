public class MostFrequentCharacter {
    public static void main(String[] args) {

        String input = "success";
        mostFrequentChar(input);
    }

    public static char mostFrequentChar(String str) {
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            int count = 0;
            
            for (char d : str.toCharArray()) {
                if (c == d) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = c;
            }
        }
        System.out.println("Most frequent character: " + mostFrequentChar);
        return mostFrequentChar;
    }


}
