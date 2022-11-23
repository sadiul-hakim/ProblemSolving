package recursion;

/**
 * Operations after function call makes execute last when function is returned
 */

public class BackTrackCount {
    private static void print(int i, int n) {
        if (i > n)
            return;

        print(i + 1, n);
        System.out.println(i);// Backtrack
    }

    public static void main(String[] args) {
        // print from 1 to n using recursion backtrack
        print(1, 5);
        System.out.println("Done");
    }
}
