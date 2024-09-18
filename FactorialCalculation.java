public class FactorialCalculation {
    public static void main(String[] args){


        int input1=3;
        int fact1=1;
        while (input1>0){

            fact1*=input1;
            input1--;
        }
        System.out.println("the factorial is "+fact1);
    }
}
