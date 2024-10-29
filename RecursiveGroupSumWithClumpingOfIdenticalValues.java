import java.util.List;

public class RecursiveGroupSumWithClumpingOfIdenticalValues {
    public static void main(String[] args) {

        System.out.println(groupSumClump(0, List.of(3, 3, 2, 1), 5));
    }

    public static Boolean groupSumClump(Integer start, List<Integer> num, Integer target) {

        if (target == 0) {
            return true;
        }
        if (start >= num.size()) {
            return false;
        }
        int count = 0;
        int currentElement = num.get(start);
        int sumOfClump = 0;

        //identify clumps
        while (start + count < num.size() && num.get(start + count).equals(currentElement)) {
            sumOfClump += num.get(start + count);
            count++;
        }

        //include clump
        if (groupSumClump(start + count, num, target - sumOfClump)) {
            return true;
        }
        // exclude clump
        return groupSumClump(start + count, num, target);
    }
}


