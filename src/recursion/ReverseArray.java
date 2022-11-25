package recursion;

import java.util.Arrays;

public class ReverseArray {
    // ! Reversing using loop
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("Swapping : " + arr[a] + " and " + arr[b]);
    }

    // ? Recursion
    public static void reverseUsingRecursion(int[] arr, int i, int j) {
        if (i > j)
            return;

        swap(arr, i, j);
        reverseUsingRecursion(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8, 9, 10 };
        int[] arr2 = { 2, 4, 6, 8, 9 };

        // reverseUsingRecursion(arr1, 0, arr1.length - 1);
        reverseUsingRecursion(arr2, 0, arr2.length - 1);

        // System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
