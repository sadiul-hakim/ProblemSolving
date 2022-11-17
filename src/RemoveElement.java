import java.util.Arrays;

public class RemoveElement {
    public void removeElement(int[] nums, int val) {
        // [3,2,2,3] -> remove all 3
        // [2,2,_,_]
        int j = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                int k = i;
                while (k < j) {
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                    k++;
                }
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3 };
        var s = new RemoveElement();
        s.removeElement(arr, 3);

        System.out.println(Arrays.toString(arr));
    }
}