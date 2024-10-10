import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NearbyDuplicate {
    public static void main(String[] args) {

        isNearestDuplicateLessThanInteger();
    }

    public static void isNearestDuplicateLessThanInteger() {

        List<Integer> numbers = List.of(1, 2, 3, 4, 1);
        Set<Integer> setOfNumbers = new HashSet<>();
        int k = 3;

        for (int i = 0; i < numbers.size(); i++) {
            if (setOfNumbers.contains(numbers.get(i))) {
                System.out.println("true");
                return;
            }

            setOfNumbers.add(numbers.get(i));

            if (setOfNumbers.size() > k) {
                setOfNumbers.remove(numbers.get(i - k));
            }
        }
        System.out.println("false");
    }
}
