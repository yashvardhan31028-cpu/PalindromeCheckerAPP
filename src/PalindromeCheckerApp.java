import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Iterate the string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
