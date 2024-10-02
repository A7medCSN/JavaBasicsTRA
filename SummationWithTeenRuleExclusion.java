
import java.util.Arrays;
import java.util.List;

public class SummationWithTeenRuleExclusion {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(18, 3, 16, 19);
        summingWithoutTeenNumbers(numbers);
    }

    public static void summingWithoutTeenNumbers(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer n : numbers) {
            if (n >= 13 && n <= 19 && (n != 15 && n != 16)) {
                sum = sum + 0;
            } else {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
