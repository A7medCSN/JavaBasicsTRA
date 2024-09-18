public class NestedLoopswithIfElse {
    public static void main(String[] args){

//Question: Write a Java program to print a right-angled triangle pattern of stars (*) using nested for loops. The program should also skip printing the middle row of stars using an if-else statement.
        int totalRows=5;

        for (int i = 1; i <= totalRows; i++) {
            // Skip the middle row
            if (i == totalRows / 2 + 1) {
                continue;
            }

            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
