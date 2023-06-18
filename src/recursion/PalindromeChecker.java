package recursion;
//Write a java program to check whether a given string is a palindrome or not using recursion
/**
 * The type Palindrome checker.
 */
public class PalindromeChecker {
    /**
     * Is palindrome boolean.
     *
     * @param str the input String
     * @return the boolean
     */
    static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            char firstCharacter = str.charAt(0);
            char lastCharacter = str.charAt(str.length() - 1);
            if (Character.toLowerCase(firstCharacter) != Character.toLowerCase(lastCharacter)) {
                return false;
            } else {
                String sunstring = str.substring(1, str.length() - 1);
                return isPalindrome(sunstring);
            }
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
