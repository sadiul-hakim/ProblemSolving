package recursion;

public class SumOfNNumber {
    // ? One way
    // public static int sum(int n) {
    // if (n < 1)
    // return 0;

    // return n + sum(n - 1);
    // }
    // ? Another way
    public static void sum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }

        sum(n - 1, sum + n);
    }

    public static void main(String[] args) {
        sum(9, 0);
    }
}
