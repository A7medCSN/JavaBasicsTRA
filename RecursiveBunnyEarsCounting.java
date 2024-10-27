public class RecursiveBunnyEarsCounting {


    public static void main(String[] args) {

        System.out.println(bunnyEars2(2));
    }

    public static Integer bunnyEars2(Integer numberOfBunnies) {
        Integer numberOfEars = 0;

        if (numberOfBunnies == 0) {
            return 0;
        } else if (numberOfBunnies % 2 != 0) {
            numberOfEars = numberOfEars + 2;
        } else {
            numberOfEars = numberOfEars + 3;
        }
        numberOfEars += bunnyEars2(numberOfBunnies - 1);

        return numberOfEars;
    }
}
