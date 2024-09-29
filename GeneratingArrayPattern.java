import java.util.Arrays;

public class GeneratingArrayPattern {
    public static void main(String[] args) {
        Integer n = 3;
        createArrayPattern(n);
    }

    public static void createArrayPattern(Integer n) {

        Integer totalArraySize = n * (n + 1) / 2;
        Integer[] arrayPattern = new Integer[totalArraySize];
        Integer elementIndex = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arrayPattern[elementIndex] = j;
                elementIndex++;
            }
        }
        System.out.println(Arrays.toString(arrayPattern));
    }
}
