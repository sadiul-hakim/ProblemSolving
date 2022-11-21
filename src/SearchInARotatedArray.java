
/**
 * Search an element from a rotated sorted arrays
 * like [5,6,7,8,1,2,3,4]
 * 1. first get the starting point.In this case it is index 4
 * 2. Divide the array in two part like [5,6,7,8,1] + [1,2,3,4]
 * 3. Then apply regular Binary Search
 */

public class SearchInARotatedArray {

    private static int search(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;

        // Finding the start on array(Smallest element in the array)
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        int start = left;
        left = 0;
        right = arr.length - 1;

        // Divide the array in index

        if (t >= arr[start] && arr[right] >= t) {
            left = start;
        } else {
            right = start;
        }

        // Regular Binary search in index divided array
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == t)
                return mid;

            if (arr[mid] < t)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // [1,2,3,4,5,6,7,8]
        // [5,6,7,8,1,2,3,4]
        int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };

        System.out.println(search(arr, 8));
    }
}
