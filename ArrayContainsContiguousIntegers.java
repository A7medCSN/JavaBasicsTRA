import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainsContiguousIntegers {
    public static void main(String[] args) {

        checkForMissingNumberInSequence();
    }

    public static void checkForMissingNumberInSequence() {

        List<Integer> listOfNumbers = List.of(2, 4, 6, 5, 3, 8, 7);
        Integer min = Collections.min(listOfNumbers);
        Integer max = Collections.max(listOfNumbers);
        Boolean isAllIntegersInSequence = null;
        Set<Integer> uniqueNumbers = new HashSet<>(listOfNumbers);

        for (Integer i = min; i <= max; i++) {
            if (uniqueNumbers.add(i)) {
                isAllIntegersInSequence = false;
                break;
            } else {
                isAllIntegersInSequence = true;
            }
        }
        System.out.println(isAllIntegersInSequence);
    }
}
