
import java.util.Stack;

public class StacksInJava {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("The 11th Habit");
        books.push("Intelligent Investor");
        books.push("A Song of Ice and Fire");
        books.push("Venture Cafe");

        System.out.println("Books in the stack: " + books);

        String topBook = books.peek();
        System.out.println("Top book: " + topBook);

        String book1 = books.pop();
        System.out.println("After popping: " + books);
        System.out.println("Book Popped: " + book1);

        System.out.println("Iterating over stack:");
        for (String book : books) {
            System.out.println(book);
        }

        if (books.contains("1984")) {
            System.out.println("Stack contains 1984");
        }

        int size = books.size();
        System.out.println("Size of the stack: " + size);

        boolean isEmpty = books.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        books.clear();
        System.out.println("Stack after clearing: " + books);
    }
}
