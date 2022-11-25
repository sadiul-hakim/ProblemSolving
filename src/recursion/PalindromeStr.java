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

    public static void main(String[] args) {
        System.out.println(palindrome("mmmm", 0, 3));
    }
}
