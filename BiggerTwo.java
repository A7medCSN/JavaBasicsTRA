import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args) {
        int[] firstArray = {5, 4};
        int[] secondArray = {4, 3};
        largerSumArrayPrinted(firstArray, secondArray);
    }

    public static void largerSumArrayPrinted(int[] firstArray, int[] secondArray) {

        if ((firstArray[0] + firstArray[1]) > (secondArray[0] + secondArray[1])) {
            System.out.println(Arrays.toString(firstArray));
        } else if ((firstArray[0] + firstArray[1]) < (secondArray[0] + secondArray[1])) {
            System.out.println(Arrays.toString(secondArray));
        } else {
            System.out.println("equal sum");
        }
    }
}
