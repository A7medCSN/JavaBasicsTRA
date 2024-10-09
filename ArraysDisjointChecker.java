import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysDisjointChecker {
    public static void main(String[] args) {

        List<Integer> firstListOfNumbers = List.of(4, 5, 6); //enter elements
        List<Integer> secondListOfNumbers = List.of(1, 2, 3);
        getIntersectionOfSets(firstListOfNumbers, secondListOfNumbers);
    }

    public static void getIntersectionOfSets(List<Integer> firstListOfNumbers, List<Integer> secondListOfNumbers) {

        Boolean isIntersectionExist = false;
        Set<Integer> intersection = new HashSet<>(firstListOfNumbers);
        intersection.retainAll(secondListOfNumbers);
        if (intersection.isEmpty()) {
            isIntersectionExist = true;
        }
        System.out.println("There is no intersection between the arrays? " + isIntersectionExist);
    }
}
