package recursion;

public class Basic {
    public static void main(String[] args) {
        int i = 1;
        f(i);
        System.out.println("Done");
    }

    private static void f(int i) {
        if (i == 10)
            return;
        System.out.println(i);
        i++;
        f(i);
        System.out.println("i Printed");
    }
}