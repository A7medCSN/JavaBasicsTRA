
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
        System.out.println("enter integer elements, enter -1 to stop:");
        Integer inputForArray = scan.nextInt();

        while (true) {
            if (inputForArray != -1) {
                numbers.add(inputForArray);
                inputForArray = scan.nextInt();
            } else {
                break;
            }
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
