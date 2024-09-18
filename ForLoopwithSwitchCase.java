public class ForLoopwithSwitchCase {
    public static void main(String[] args){


//Question: Write a Java program that iterates through numbers 1 to 12 using a for loop and prints the corresponding month name for each number using a switch statement.

        for(int n=1;n<=12;n++){
            switch (n){
                case 1: System.out.println("Jan"); break;
                case 2: System.out.println("Feb"); break;
                case 3: System.out.println("Mar"); break;
                case 4: System.out.println("Apr"); break;
                case 5: System.out.println("May"); break;
                case 6: System.out.println("Jun"); break;
                case 7: System.out.println("Jul"); break;
                case 8: System.out.println("Aug"); break;
                case 9: System.out.println("Sep"); break;
                case 10: System.out.println("Oct"); break;
                case 11: System.out.println("Nov"); break;
                case 12: System.out.println("Dec"); break;
            }}
    }
}
