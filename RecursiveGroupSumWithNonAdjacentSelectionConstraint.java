import java.util.ArrayList;
import java.util.List;

public class RecursiveGroupSumWithNonAdjacentSelectionConstraint {
    public static void main(String[] args) {

       /*
       // solving task without recursion
       List<Integer> num = List.of(2, 12, 12, 4);
        Integer target = 6;
        Integer currentSum = 0;
        boolean found = false;
        int start = 0;

        while (!found) {
            if (currentSum + num.get(start) <= target) {
                currentSum += num.get(start);
                if (currentSum.equals(target)) {
                    found = true;
                    break;
                }
                start += 2;
            } else {
                start += 1;
            }
        }
        System.out.println(found);*/

        System.out.println(groupNoAdj(0, List.of(2, 11, 10, 3, 5, 1), 13));
    }


    public static Boolean groupNoAdj(Integer start, List<Integer> num, Integer target) {

        if (target == 0) {
            return true;
        }
        if (start >= num.size()) {
            return false;
        }
        if (groupNoAdj(start + 2, num, target - num.get(start))) {
            return true;
        }
        return groupNoAdj(start + 1, num, target);
    }
}

