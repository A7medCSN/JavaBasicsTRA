public class CountingVowelsinaString {
    public static void main(String[] args){


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
