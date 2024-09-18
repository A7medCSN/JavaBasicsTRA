public class SwitchStatement {
    public static void main(String[] args){

//Question: Write a Java program that uses a switch statement to print the name of the day based on a number from 1 to 7 (1 for Sunday, 2 for Monday, etc.). Use a for loop to print the day names for numbers 1 through 7.
//Expected Output: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
        for(int n=1;n<=7;n++){
            switch (n){
                case 1: System.out.println("sunday"); break;
                case 2: System.out.println("monday"); break;
                case 3: System.out.println("tuesday"); break;
                case 4: System.out.println("wednesday"); break;
                case 5: System.out.println("thursday"); break;
                case 6: System.out.println("friday"); break;
                case 7: System.out.println("saturday"); break;
            }}


    }
}
