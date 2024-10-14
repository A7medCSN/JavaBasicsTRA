import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElementsOfARange {
    public static void main(String[] args) {

        findMissingNumbersInRange();

    }

    public static void findMissingNumbersInRange() {
        List<Integer> listOfNumbers = List.of(2, 4, 7);
        Integer lower = 1;
        Integer upper = 10;
        Set<Integer> uniqueNumbers = new HashSet<>(List.of(2, 4, 7));
        Set<Integer> missingNumbers = new HashSet<>();

        for (Integer i = lower; i <= upper; i++) {
            if (uniqueNumbers.add(i)) {
                missingNumbers.add(i);
            }
        }
        System.out.println("List of missing numbers: " + missingNumbers);
    }
}
