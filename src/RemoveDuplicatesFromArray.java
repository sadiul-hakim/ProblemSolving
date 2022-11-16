import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public void removeDuplicates(int[] nums) {

        int j = nums.length - 1;
        int prev = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == prev) {
                nums[i] = -1;
                int k = i;
                System.out.println("Debug k:" + k);
                while (k < j) {
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                    k++;
                }
                j--;
            }
            prev = nums[i];
            System.out.println("Debug prev:" + prev);
        }

    }

    public static void main(String[] args) {
        var s = new RemoveDuplicatesFromArray();
        int[] arr = { 2, 3, 3, 4, 4, 5, 6, 7, 7, 7 };
        s.removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));
    }
}