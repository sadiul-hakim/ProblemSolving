package recursion;

public class PalindromeStr {
    public static boolean palindrome(String str, int i, int j) {
        if (i > j) {
            return true;

        }

        if (str.charAt(i) == str.charAt(j)) {
            /**
             * If chars matches wail for the end . If we reach to the end that means str is
             * palindrome
             */
            return palindrome(str, i + 1, j - 1);
        } else {
            // If any char does not match return false
            return false;
        }
    }

    public static boolean palindrome2(String str, int i) {
        if (i >= str.length() / 2) {
            return true;

        }

        if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            /**
             * If chars matches wail for the end . If we reach to the end that means str is
             * palindrome
             */
            return palindrome2(str, i + 1);
        } else {
            // If any char does not match return false
            return false;
        }
    }

    public static void main(String[] args) {
        String name = "Hakim";
        System.out.println(palindrome2("mmmma", 0));
        System.out.println();
    }
}
