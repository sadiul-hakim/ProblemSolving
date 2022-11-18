import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        boolean isSpace = true;
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        int count = 0;

        for (int c = chars.length - 1; c >= 0; c--) {
            if (chars[c] == ' ' && !isSpace)
                break;
            else if (chars[c] != ' ') {
                isSpace = false;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        var s = new LengthOfLastWord();
        System.out.println(s.lengthOfLastWord("I am HK  "));
    }
}