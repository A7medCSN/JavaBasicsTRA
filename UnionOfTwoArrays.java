import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {

        List<Integer> firstListOfNumbers = List.of(1, 1, 2, 4, 5, 6); //enter elements
        List<Integer> secondListOfNumbers = List.of(1, 2, 3);
        getUnion(firstListOfNumbers, secondListOfNumbers);
    }

    public static void getUnion(List<Integer> firstListOfNumbers, List<Integer> secondListOfNumbers) {

        Set<Integer> unionOfTwoArrays = new HashSet<>(firstListOfNumbers);
        unionOfTwoArrays.addAll(secondListOfNumbers);
        System.out.println("Union of two arrays: " + unionOfTwoArrays);
    }
}
