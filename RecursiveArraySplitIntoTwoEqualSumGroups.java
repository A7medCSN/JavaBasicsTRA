import java.util.List;

public class RecursiveArraySplitIntoTwoEqualSumGroups {
    public static void main(String[] args) {

        System.out.println(splitArray(List.of(5, 2, 3)));
        System.out.println(splitArray(List.of(5, 2, 1)));
        System.out.println(splitArray(List.of(2, 2, 4)));
    }

    public static Boolean splitArray(List<Integer> nums) {

        return helperToSplitAndSum(0, nums, 0, 0);
    }

    public static Boolean helperToSplitAndSum(Integer index, List<Integer> nums, Integer sumGroup1, Integer sumGroup2) {

        if (index == nums.size()) {
            Boolean isSumOfGroupsEqual = (sumGroup1 == sumGroup2);
            return isSumOfGroupsEqual;
        }
        int currentElement = nums.get(index);

        return helperToSplitAndSum(index + 1, nums, sumGroup1 + currentElement, sumGroup2)
                || helperToSplitAndSum(index + 1, nums, sumGroup1, sumGroup2 + currentElement);
    }
}
