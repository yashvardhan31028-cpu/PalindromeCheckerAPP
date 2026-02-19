import java.util.*;
public class PalindromeCheckerApp {
    /*
     * ==================================================================================================================
     * MAIN CLASS - UseCase2PalindromeCheckerApp
     * ==================================================================================================================
     *
     * Use Case 2 - Hardcoded Palindrome Validation
     *
     * Description
     * This class represents basic palindrome validation
     * using a hardcoded string value.
     *
     * At this stage the application:
     * - Stores a predefined string
     * - Compares characters from both ends
     * - Determines whether the string is palindrome
     * - Displays the result on the console
     *
     * This use case introduces fundamental comparison logic
     * before using advanced data structures.
     *
     * @developer CoderDevOp
     * @version 1.0
     * */
    public static void main(String args[]){
        System.out.print("Input text: ");
        Scanner Sc = new Scanner(System.in);
        String str = Sc.nextLine();
        boolean isPalindrome = true;
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? :" + isPalindrome);
        Sc.close();
    }
}