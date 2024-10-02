import java.util.Scanner;

public class ChocolateMaking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of small bars:");
        Integer smallBar = scan.nextInt();
        System.out.println("enter the number of big bars:");
        Integer bigBar = scan.nextInt();
        System.out.println("enter the weight of the bar to make:");
        Integer totalBar = scan.nextInt();

        Integer result = makeChocolate(smallBar, bigBar, totalBar);
        if (result != -1) {
            System.out.println("Number of small bars to use: " + result);
        } else {
            System.out.println("It can't be done");
        }
    }

    public static Integer makeChocolate(Integer small, Integer big, Integer goal) {
        Integer bigBarsUsed = Math.min(goal / 5, big);
        Integer remainingWeight = goal - (bigBarsUsed * 5);
        if (remainingWeight <= small) {
            return remainingWeight;
        } else {
            return -1;
        }

    }
}
