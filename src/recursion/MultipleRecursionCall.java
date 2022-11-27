package recursion;

public class MultipleRecursionCall {

    public int fab(int n) {
        if (n <= 1)
            return n;

        return fab(n - 1) + fab(n - 2);
    }

    public static void main(String[] args) {
        var s = new MultipleRecursionCall();
        System.out.println(s.fab(6));
    }
}