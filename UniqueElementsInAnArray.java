import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementsInAnArray {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = List.of(3, 1, 2, 3, 2, 4, 5, 4);
        removeRedundantNumbers(listOfNumbers);

    }

    public static void removeRedundantNumbers(List<Integer> listOfNumbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(listOfNumbers);
        System.out.println(uniqueNumbers);
    }
}
