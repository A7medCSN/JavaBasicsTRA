import java.util.List;

public class RecursiveArraySplitWithMultipleConstraints {

    public static void main(String[] args) {
        System.out.println(split53(List.of(3, 2, 9, 4, 2, 15, 10, 10)));
    }

    public static Boolean split53(List<Integer> nums) {
        System.out.println("any number is multiple of both 3 and 5 is ignored");
        return helperToSplitAndSum(0, nums, 0, 0);
    }

    public static Boolean helperToSplitAndSum(Integer index, List<Integer> nums, Integer sumGroup1, Integer sumGroup2) {

        if (index == nums.size()) {
            Boolean isSumOfGroupsEqual = (sumGroup1 == sumGroup2);
            return isSumOfGroupsEqual;
        }
        int currentElement = nums.get(index);
        if (currentElement % 15 == 0) {//group2
            return helperToSplitAndSum(index + 1, nums, sumGroup1, sumGroup2);
        } else if (currentElement % 5 == 0) { //group1
            return helperToSplitAndSum(index + 1, nums, sumGroup1 + currentElement, sumGroup2);
        } else if (currentElement % 3 == 0) { //group2
            return helperToSplitAndSum(index + 1, nums, sumGroup1, sumGroup2 + currentElement);
        } else //remaining numbers
            return helperToSplitAndSum(index + 1, nums, sumGroup1 + currentElement, sumGroup2)
                    || helperToSplitAndSum(index + 1, nums, sumGroup1, sumGroup2 + currentElement);
    }
}

