import java.util.Scanner;
public class longestWord {
    public static void main(String[] args){


        System.out.println("enter sentence: ");
        Scanner scan=new Scanner(System.in);
        String sentence= scan.nextLine();
        longesrWord(sentence);
    }


    public static String longesrWord(String s){
        String [] wordsInSentence= s.split(" ");
        int lengthWord=0;
        String longestWord = "";

        for (String word:wordsInSentence){
            if(word.length()>lengthWord){
                longestWord=word;
            }
        }
        System.out.println("longest word in your sentence is: "+longestWord);
        return longestWord;
    }
    }