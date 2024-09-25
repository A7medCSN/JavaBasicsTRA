import java.util.Arrays;

public class FrontElementFromEachArray {
    public static void main(String[] args) {

        int[] firstArray = {3, 5};
        int[] secondArray = {2, 5};
        frontElementsMakesNewArray(firstArray, secondArray);
    }

    public static void frontElementsMakesNewArray(int[] firstArray, int[] secondArray) {

        if (firstArray.length == 0 && secondArray.length == 0) {
            return;
        }
        int[] newArray = new int[2];
        if (firstArray.length > 0 && secondArray.length > 0) {
            newArray = new int[]{firstArray[0], secondArray[0]};
        } else if (firstArray.length == 0) {
            newArray = new int[]{secondArray[0]};
        } else if (secondArray.length == 0) {
            newArray = new int[]{firstArray[0]};
        }
        System.out.println(Arrays.toString(newArray));
    }
}
