package recursion;

//Write a java program to reverse a string using recursion.
public class StringReverse {
    static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            char ch = str.charAt(str.length() - 1);
            String substring = str.substring(0, str.length() - 1);
            return ch + reverse(substring);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("America"));
    }
}
