import java.util.Stack;

public class ValiParentheses {
    public boolean validate(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (Character c : chars) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && stack.peek() == '(' ||
                            c == '}' && stack.peek() == '{' ||
                            c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var v = new ValiParentheses();
        System.out.println(v.validate("}{"));
    }
}