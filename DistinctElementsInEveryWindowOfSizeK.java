import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctElementsInEveryWindowOfSizeK {
    public static void main(String[] args) {

        findTupleEqualsToTarget();
    }

    public static void findTupleEqualsToTarget() {

        List<Integer> numbers = List.of(1, 4, 5, 7, -1, 1, 5);
        int target = 6;
        Set<Integer> seenNumbers = new HashSet<>();
        Set<String> uniquePairs = new HashSet<>();

        for (int num : numbers) {
            int complement = target - num;
            if (!seenNumbers.add(complement)) {
                String pair = Math.min(num, complement) + "," + Math.max(num, complement);
                uniquePairs.add(pair);
            }
            seenNumbers.add(num);
        }
        for (String pair : uniquePairs) {
            System.out.println("pair of (" + pair + ")");
        }
        System.out.println(uniquePairs);
    }
}