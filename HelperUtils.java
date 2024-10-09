import java.util.List;

public class HelperUtils {

    public static Character[] convertStringToCharacterArray(String str) {

        if (str == null || str.isEmpty()) {
            return new Character[0];
        }

        char[] charArray = str.toCharArray();
        Character[] charObjectArray = new Character[charArray.length];


        for (int i = 0; i < charArray.length; i++) {
            charObjectArray[i] = charArray[i];
        }

        return charObjectArray;
    }
}
