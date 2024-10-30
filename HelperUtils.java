import java.util.*;

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
    public static <T> List<T> getUserInputList(Class<T> type) {
        Scanner scanner = new Scanner(System.in);
        List<T> list = new ArrayList<>();

        System.out.println("Enter items for the list (type 'done' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Convert the input to the required type
            T item = convertInput(type, input);
            if (item != null) {
                list.add(item);
            } else {
                System.out.println("Invalid input. Please enter a valid " + type.getSimpleName() + " or 'done' to finish.");
            }
        }
        return list;
    }

    public static <T> Stack<T> getUserInputStack(Class<T> type) {
        Scanner scanner = new Scanner(System.in);
        Stack<T> stack = new Stack<>();

        System.out.println("Enter items for the stack (type 'done' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Convert the input to the required type
            T item = convertInput(type, input);
            if (item != null) {
                stack.push(item);
            } else {
                System.out.println("Invalid input. Please enter a valid " + type.getSimpleName() + " or 'done' to finish.");
            }
        }
        return stack;
    }

    public static <T> Set<T> getUserInputSet(Class<T> type) {
        Scanner scanner = new Scanner(System.in);
        Set<T> set = new HashSet<>();

        System.out.println("Enter items for the set (type 'done' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Convert the input to the required type
            T item = convertInput(type, input);
            if (item != null) {
                set.add(item);
            } else {
                System.out.println("Invalid input. Please enter a valid " + type.getSimpleName() + " or 'done' to finish.");
            }
        }
        return set;
    }

    // Reuse the same conversion helper
    private static <T> T convertInput(Class<T> type, String input) {
        try {
            if (type == Integer.class) return type.cast(Integer.parseInt(input));
            if (type == Double.class) return type.cast(Double.parseDouble(input));
            if (type == String.class) return type.cast(input);
            // Add more types as needed
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
