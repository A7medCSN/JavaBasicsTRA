public class MaxTriple {
    public static void main(String[] args) {
        int[] oddtArray = {15, 4, 9};
        largerNumberInOddArray(oddtArray);
    }

    public static void largerNumberInOddArray(int[] oddtArray) {
        int maxElement = oddtArray[0];

        if (oddtArray[0] > oddtArray[1] && oddtArray[0] > oddtArray[2]) {
            maxElement = oddtArray[0];
        } else if (oddtArray[0] < oddtArray[1] && oddtArray[1] > oddtArray[2]) {
            maxElement = oddtArray[1];
        } else if (oddtArray[0] < oddtArray[2] && oddtArray[1] < oddtArray[2]) {
            maxElement = oddtArray[2];
        }
        System.out.println(maxElement);
    }
}
