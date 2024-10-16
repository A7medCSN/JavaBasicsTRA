
import java.util.*;

public class NonOverlappingIntervals {
    public static void main(String[] args) {

        List<List<Integer>> intervals = new ArrayList<>(List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(3, 4),
                List.of(1, 3)
        ));
        findMaxNonOverlappingIntervals(intervals);
    }

    public static void findMaxNonOverlappingIntervals(List<List<Integer>> intervals) {

        Collections.sort(intervals, (a, b) -> a.get(1) - b.get(1));
        System.out.println(intervals);
        Set<List<Integer>> selectedIntervals = new HashSet<>();

        int previousEnd = 0; //suppose min value is zero

        for (List<Integer> num : intervals) {
            int start = num.get(0);
            int end = num.get(1);

            if (start >= previousEnd) {
                selectedIntervals.add(num);
                previousEnd = end;
            }

        }
        System.out.println("Non-Overlapping Intervals " + selectedIntervals);
        System.out.println("number of Non-Overlapping Intervals= " + selectedIntervals.size());
    }
}
