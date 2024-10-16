import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummationOfRoundedValues {
    public static void main(String[] args) {

        List <Double> numbersToSum = Arrays.asList(19.0,11.0,12.0);

        roundTheSum(numbersToSum);

    }

    public static void roundTheSum(List<Double> numbersToSum) {
        Double sum = 0.0;
        for (Double n : numbersToSum) {

            sum = sum + (Math.round(n / 10) * 10);
        }
        System.out.println(sum);
    }

}
