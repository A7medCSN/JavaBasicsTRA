public class RecursiveTriangleBlockCounting {

    public static void main(String[] args) {

        Integer numberOfBlocks = triangle(3);
        System.out.println(numberOfBlocks);
    }

    public static Integer triangle(Integer numberOfRows) {
        Integer numberOfBlocks = 0;
        if (numberOfRows == 0) {
            return 0;
        } else {
            numberOfBlocks = numberOfRows + triangle(numberOfRows - 1);
        }
        return numberOfBlocks;
    }
}
