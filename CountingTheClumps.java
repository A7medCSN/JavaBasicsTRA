public class CountingTheClumps {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 4, 2, 2, 1, 1, 1, 1};
        countClumps(array);
    }

    public static void countClumps(Integer[] array) {
        Integer clumpsCount = 0;
        boolean newClumb = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                if (!newClumb == true) {
                    clumpsCount++;
                    newClumb = true;
                }
            } else {
                newClumb = false;
            }

        }
        System.out.println("number of clumps= " + clumpsCount);
    }
}