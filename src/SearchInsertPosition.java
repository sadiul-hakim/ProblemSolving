public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // The Arrays is sorted
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 9 };
        var s = new SearchInsertPosition();
        System.out.println(s.searchInsert(arr, 3));
    }
}