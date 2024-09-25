import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {

        int[] firstArray = {8, 7, 5, 2};
        endSwapper(firstArray);
    }

    public static void endSwapper(int[] firstArray) {
        int swapedEndArray = firstArray[0];
        firstArray[0] = firstArray[firstArray.length - 1];
        firstArray[firstArray.length - 1] = swapedEndArray;
        System.out.println(Arrays.toString(firstArray));
    }
}
