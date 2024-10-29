import java.util.List;

public class RecursiveGroupSumWithMultiplesOf5AndExclusionConstraints {

    public static void main(String[] args) {
        System.out.println(groupSum5(0, List.of(2, 5, 10, 4), 19));
        System.out.println(groupSum5(0, List.of(2, 5, 10, 4), 17));
        System.out.println(groupSum5(0, List.of(2, 5, 10, 4, 3), 12));
    }

    public static boolean groupSum5(Integer start, List<Integer> nums, Integer target) {
        // Base cases
        if (target == 0) {
            return true;
        }
        if (start >= nums.size()) {
            return false;
        }
        if (nums.get(start) % 5 == 0) {
            if (start + 1 < nums.size() && nums.get(start + 1) == 1) {
                return groupSum5(start + 2, nums, target - nums.get(start)); // skip 1
            } else {
                return groupSum5(start + 1, nums, target - nums.get(start));
            }
        }
        return groupSum5(start + 1, nums, target - nums.get(start)) // Include current element
                || groupSum5(start + 1, nums, target);          // Exclude current element
    }
}


