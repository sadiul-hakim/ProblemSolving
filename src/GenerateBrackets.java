import java.util.ArrayList;
import java.util.List;

public class GenerateBrackets {
    public List<String> generate(int n) {
        List<String> output = new ArrayList<>();
        backtrack(output, "", 0, 0, n);
        return output;
    }

    private void backtrack(List<String> output, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            System.out.println(str + "-open-" + open + "-close-" + close);
            output.add(str);
            System.out.println("#Return from first");
            return;
        }

        if (open < max) {
            System.out.println(str + "-open-" + open + "-close-" + close);
            backtrack(output, str + "(", open + 1, close, max);
        }
        if (close < open) {
            System.out.println(str + "-open-" + open + "-close-" + close);
            backtrack(output, str + ")", open, close + 1, max);
        }
        System.out.println("# Return from last");
    }

    public static void main(String[] args) {
        var s = new GenerateBrackets();
        System.out.println(s.generate(3));
    }
}
