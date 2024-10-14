import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class MissingNumberFinder {
    public static void main(String[] args) {

        findMissingNumberInSequence();
    }

    public static void findMissingNumberInSequence() {

        Set<Integer> orderedNumbers = Set.of(0, 1, 6, 5, 4, 3);
        System.out.println(orderedNumbers);
        // this way is giving me 2*n complexity
        Integer sumOfOrderedNumbers = 0;
        for (Integer x : orderedNumbers) {
            sumOfOrderedNumbers += x;
        }
        Integer sumOfSequence = 0;

        for (int i = 0; i <= orderedNumbers.size(); i++) {
            sumOfSequence += i;
        }

        System.out.println("the missing number is: " + (sumOfSequence - sumOfOrderedNumbers));

            /*
        this way is giving me n^2 complexity for the code
            for (int i = 0; i < orderedNumbers.size(); i++) {
            if (!orderedNumbers.contains(i)) {
                System.out.println(i);
            } else {
                orderedNumbers.remove(i);
            }
        }*/

    }
}

