import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPairsWithGivenSum {
    public static void main(String[] args) {

        findDistinctElementsInGivenWindow();
    }

    public static void findDistinctElementsInGivenWindow() {

        List<Integer> listOfNumbers = List.of(1, 2, 1, 3, 4, 2, 3);
        List<Integer> listOfNumbersInWindow = new ArrayList<>();
        Set<Integer> distinctElements = Set.of();
        Integer windowSize = 4;
        List<Integer> distinctCounter = new ArrayList<>(List.of());

        if (windowSize > listOfNumbers.size()) {
            System.out.println("the window size is bigger than list size");
            return;
        }
        for (Integer i = 0; i <= listOfNumbers.size() - windowSize; i++) {
            listOfNumbersInWindow = listOfNumbers.subList(i, i + windowSize);
            distinctElements = new HashSet<>(listOfNumbersInWindow);
            System.out.println("Distinct elements: " + distinctElements);
            distinctCounter.add(distinctElements.size());

        }
        System.out.println("number of distinct elements in each iteration:" + distinctCounter);
    }
}

