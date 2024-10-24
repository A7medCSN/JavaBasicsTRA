import java.util.*;

public class DuplicatesInArrayAndFindTheLocation {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(2, 3, 4, 2, 5, 6, 4, 3, 7, 3);
        getPositionAndRepeatingTimeOfKey(listOfNumbers);
    }

    public static void getPositionAndRepeatingTimeOfKey(List<Integer> listOfNumbers) {

        Map<Integer, List<Integer>> duplicationPositions = new HashMap<>();
        Map<Integer, Integer> duplicationCounts = new HashMap<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            int number = listOfNumbers.get(i);

            if (duplicationPositions.containsKey(number)) {
                duplicationPositions.get(number).add(i); // add to the list
                duplicationCounts.put(number, duplicationCounts.get(number) + 1);
            } else {
                duplicationPositions.put(number, new ArrayList<>(Arrays.asList(i)));
                duplicationCounts.put(number, 1);
            }
        }
        int sumOfDistinctDuplicates = 0;
        for (Map.Entry<Integer, List<Integer>> entry : duplicationPositions.entrySet()) {
            int duplicatedNumber = entry.getKey();
            List<Integer> positions = entry.getValue();
            int count = duplicationCounts.get(duplicatedNumber);

            if (count > 1) {
                System.out.println(duplicatedNumber + ": Occurs " + count + " times at positions " + positions);
                sumOfDistinctDuplicates += duplicatedNumber;
            }
        }
        System.out.println("Sum of distinct duplicate numbers: " + sumOfDistinctDuplicates);
    }
}
