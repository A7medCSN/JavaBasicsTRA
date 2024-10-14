import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedElement {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5, 3, 3);
        findFirstRepeatedNumber(listOfNumbers);
    }

    public static void findFirstRepeatedNumber(List<Integer> listOfNumbers) {

        Set<Integer> nonRepeatedListOfNumber = new HashSet<>();
        for (Integer i : listOfNumbers) {
            if (!nonRepeatedListOfNumber.add(i)) {
                System.out.println("First repeated number is: " + i);
                return;
            }
            nonRepeatedListOfNumber.add(i);
        }
        System.out.println("there is  no repeated number!");
    }
}

