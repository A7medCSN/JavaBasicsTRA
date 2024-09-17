// Monday 16/9/2024
import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//Sum of Even Numbers
/*int sum=0;
for (int i=1 ; i<=50; i++ ){
    if (i%2==0){
        sum=sum+i;

    }
}
     System.out.println(sum);
//Multiplication Table

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number from 1 to 10: ");
        int input  = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(input*i);
        }
 //Factorial Calculation

        System.out.println("enter number from 1 to 10: ");
        int input1=3;
        int fact1=input1-1;
        while (input1>0){

            fact1*=input1;
            input1--;
        }
        System.out.println("the factorial is "+fact1);

//Finding Maximum in Array
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int max=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("max number in array is: "+max); */

//Counting Vowels in a String
        String a="Hello Ahmed";
        int count=0;
for (char c:a.toCharArray()){
    switch (c) {
        case 'a': count++;break;
        case 'e': count++;break;
        case 'i': count++;break;
        case 'o': count++;break;
        case 'u': count++;break;
        case 'A': count++;break;
        case 'E': count++;break;
        case 'I': count++;break;
        case 'O': count++;break;
        case 'U': count++;break;

    }
}
        System.out.println(count);
    }
}
