import java.util.Scanner;
public class longestWord {
    public static void main(String[] args){

        System.out.println("enter sentence: ");
        Scanner scan=new Scanner(System.in);
        String sentence= scan.nextLine();

        String [] wordsInSentence= sentence.split(" ");
        String longestWord="";

        for (String word:wordsInSentence){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("longest word in your sentence is: "+longestWord);
        
    }
    }