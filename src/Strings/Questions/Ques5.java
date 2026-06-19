package Strings.Questions;

public class Ques5 {
    public static void main(String[] args) {
        System.out.println(is_palindrome("madam"));
        System.out.println(is_palindrome("hello"));
    }

    static boolean is_palindrome(String str) {
        String original = str;
        String reverse = reverse(original);

        for (int i = 0; i <= original.length()-1; i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    static String reverse(String name) {
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }

        return reverse;
    }
}