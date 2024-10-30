import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

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

    public static HashMap<String, String> getUserInputForHashMap() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> userMap = new HashMap<>();

        while (true) {
            System.out.print("Enter key (or 'exit' to finish): ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter value for key '" + key + "': ");
            String value = scanner.nextLine();

            userMap.put(key, value);
        }

        return userMap;
    }
    public static List<Integer> getUserInputList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numList.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        scanner.close();
        return numList;
    }

}
