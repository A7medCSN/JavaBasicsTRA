import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {

        int[] firstArray = {3,7};
        firstTwoElementsMakesNewArray(firstArray);
    }

    public static void firstTwoElementsMakesNewArray(int[] firstArray) {

        int[] newArray = new int[2];
        if (firstArray.length > 1) {
            newArray = new int[]{firstArray[0], firstArray[1]};
        } else {
            newArray = new int[]{firstArray[0]};
        }
        System.out.println(Arrays.toString(newArray));
    }
}
