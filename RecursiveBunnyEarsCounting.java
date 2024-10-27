public class RecursiveBunnyEarsCounting {

    static Integer numberOfEars = 0;

    public static void main(String[] args) {

        numberOfEars = bunnyEars2(1);
        System.out.println(numberOfEars);
    }

    public static Integer bunnyEars2(Integer numberOfBunnies) {

        if (numberOfBunnies == 0) {
            return 0;
        } else if (numberOfBunnies % 2 != 0) {
            numberOfEars = numberOfEars + 2;
            bunnyEars2(numberOfBunnies - 1);
        } else {
            numberOfEars = numberOfEars + 3;
            bunnyEars2(numberOfBunnies - 1);
        }
        return numberOfEars;
    }
}
