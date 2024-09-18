import java.util.Scanner;
public class Calculator {
    static boolean exitFlage=false;
    public static void main(String[] args) {

        while (exitFlage==false) {
            printingMenue();
            int option = userOption();
            if(option>5){
                System.out.println("Wrong option");
            }
            else if (option==5) {
                exit();
            }
            else{
                calculation(option);
            }
        }
    }


    public static void printingMenue() {
        System.out.println("Hi, Welcome to the calculator");
        System.out.println("This is the menu for calculator");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Exit");


    }
    public static int userOption(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your choice:");
        int option= scan.nextInt();
        return option;
    }

    public static int [] userNumbers(){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the first number:");
        int firstNumber= scan.nextInt();
        System.out.println("enter the second number:");
        int secondNumber= scan.nextInt();
        int [] arrayNumbers = {firstNumber,secondNumber};
        return arrayNumbers;
    }
    public static void calculation(int option){

        int [] inputNumbers= userNumbers();
       int n1=inputNumbers[0];
       int n2=inputNumbers[1];

        switch (option){
            case 1: System.out.println("result is: "+(n1+n2));break;
            case 2: System.out.println("result is: "+(n1-n2));break;
            case 3: if (n2==0) {System.out.println("Division by zero!!");}
            else System.out.println("result is: "+(n1/n2));break;
            case 4: System.out.println("result is: "+(n1*n2));break;

            case 5: exit();
        }




    }
    public static void exit(){
        exitFlage=true;
    }
}