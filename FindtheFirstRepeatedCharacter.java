import java.util.Scanner;
public class FindtheFirstRepeatedCharacter {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word to find the first repeated character:  ");
        String word=scan.nextLine();
        firstRepeatedChar(word);
    }

    public static char firstRepeatedChar(String str){
        char repeatedChar = 0;
        char [] letters= str.toCharArray();

        for(int i=0; i<letters.length-1;i++){
            if(letters[i]==letters[i+1]){
                repeatedChar=letters[i];
                break;
            }
        }
        System.out.println("the first repeated letter is: "+repeatedChar);
        return repeatedChar;
    }
}
