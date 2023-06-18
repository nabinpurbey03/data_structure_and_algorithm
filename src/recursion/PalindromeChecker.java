package recursion;

public class PalindromeChecker {
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

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
