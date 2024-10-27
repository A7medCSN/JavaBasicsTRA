import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveArrayContainsValueFollowedByValueTimesTen {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 20, 3, 2);
        Boolean isNextMultiplyBy10 = array220(numbers, 0);
        System.out.println(isNextMultiplyBy10);

    }

    public static Boolean array220(List<Integer> numbers, Integer index) {
        Boolean isNextMultiplyBy10;

        if (numbers.size() - index <= 1) {
            isNextMultiplyBy10 = false;
        } else if (numbers.get(index) != (numbers.get(index + 1) / 10)) {
            isNextMultiplyBy10 = array220(numbers, index + 1);
        } else {
            isNextMultiplyBy10 = true;
        }
        return isNextMultiplyBy10;
    }
}
