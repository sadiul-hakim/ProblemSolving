package recursion;

public class PrintName5Times {
    private static void print(int i) {
        if (i < 1)
            return;

        print(i - 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        print(5);
    }
}
