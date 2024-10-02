import java.util.ArrayList;

public class SummationOfRoundedValues {
    public static void main(String[] args) {

        ArrayList<Double> numbersToSum = new ArrayList<>();
        numbersToSum.add(18.0);
        numbersToSum.add(21.0);
        numbersToSum.add(11.0);
        roundTheSum(numbersToSum);

    }

    public static void roundTheSum(ArrayList<Double> numbersToSum) {
        Double sum = 0.0;
        for (Double n : numbersToSum) {

            sum = sum + (Math.round(n / 10) * 10);
        }
        System.out.println(sum);
    }

}
