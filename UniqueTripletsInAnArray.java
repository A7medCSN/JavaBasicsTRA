import java.util.*;

public class UniqueTripletsInAnArray {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-1, 0, 1, 2, -1, -4);
        findUniqueTriplets(numbers);
    }

    public static void findUniqueTriplets(List<Integer> numbers) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < numbers.size() - 2; i++) {
            for (int j = i + 1; j < numbers.size() - 1; j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 0) {
                        List<Integer> triplets = Arrays.asList(numbers.get(i), numbers.get(j), numbers.get(k));
                        Collections.sort(triplets);
                        uniqueTriplets.add(triplets);
                    }
                }
            }
        }
        System.out.println(uniqueTriplets);

    }
}
