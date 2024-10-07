
import java.util.ArrayList;
import java.util.Scanner;

public class SummationWithTeenRuleExclusion {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = getUserInput();
        summingWithoutTeenNumbers(numbers);
    }

    public static ArrayList<Integer> getUserInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("enter 3 integer elements:");
        for (int i = 0; i < 3; i++) {
            Integer inputForArray = scan.nextInt();
            numbers.add(inputForArray);
        }
        return numbers;
    }

    public static void summingWithoutTeenNumbers(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for (Integer n : numbers) {
            if (n >= 13 && n <= 19 && (n != 15 && n != 16)) {
                sum = sum + 0;
            } else {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
