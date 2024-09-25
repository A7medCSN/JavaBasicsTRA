public class CommonEnd {
    public static void main(String[] args) {

        int[] firstArray = {3, 2, 3, 4};
        int[] secondArray = {1, 2, 3, 4};
        commonEnd(firstArray, secondArray);
    }

    public static void commonEnd(int[] firstArray, int[] secondArray) {
        boolean isEndElementSame;
        if (firstArray[0] == secondArray[0] || firstArray[firstArray.length - 1] == secondArray[secondArray.length - 1]) {
            isEndElementSame = true;
            System.out.println(isEndElementSame);
        } else {
            isEndElementSame = false;
            System.out.println(isEndElementSame);
        }
    }
}
