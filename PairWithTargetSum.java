import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairWithTargetSum {

    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,4,5,7);
        int target = 6;

        System.out.println(hasPairWithSum(numbers, target));
    }

    public static boolean hasPairWithSum(List<Integer> numbers, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : numbers) {
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}

