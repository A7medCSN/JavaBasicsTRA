import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesChecker {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = List.of(1, 2, 3); //enter elements

        Set<Integer> uniqueNumbers = new HashSet<>(listOfNumbers);
        checkArrayForDuplication(listOfNumbers, uniqueNumbers);
    }

    public static void checkArrayForDuplication(List<Integer> listOfNumbers, Set<Integer> uniqueNumbers) {
        Boolean isDuplicate = false;
        if (listOfNumbers.size() != uniqueNumbers.size()) {
            isDuplicate = true;
        }
        System.out.println("Dose array has duplication: " + isDuplicate);
    }
}

