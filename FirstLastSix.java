public class FirstLastSix {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {6, 3, 6, 5, 4};
        isSixInLastOrFirst(arrayOfNumbers);
    }

    public static void isSixInLastOrFirst(int[] arrayOfNumbers) {
        boolean numberSixLocation;
        if (arrayOfNumbers[0] == 6 || arrayOfNumbers[arrayOfNumbers.length - 1] == 6) {
            numberSixLocation = true;
            System.out.println(numberSixLocation);
        } else {
            numberSixLocation = false;
            System.out.println(numberSixLocation);
        }
    }
}
