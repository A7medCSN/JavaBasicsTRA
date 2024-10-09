import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        List<Integer> firstListOfNumbers = List.of(4, 5, 6);
        List<Integer> secondListOfNumbers = List.of(1, 2, 3, 4);
        getIntersectionOfSets(firstListOfNumbers, secondListOfNumbers);
    }

    public static void getIntersectionOfSets(List<Integer> firstListOfNumbers, List<Integer> secondListOfNumbers) {
        Set<Integer> intersection = new HashSet<>(firstListOfNumbers);
        intersection.retainAll(secondListOfNumbers);
        System.out.println(intersection);
    }
}
