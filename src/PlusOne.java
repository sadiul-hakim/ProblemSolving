import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    /**
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;// 1,0,0,0
        }
        int[] new_arr = new int[n + 1];
        new_arr[0] = 1;
        return new_arr;
    }

    public static void main(String[] a) {
        var s = new PlusOne();
        int[] res = s.plusOne(new int[] { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7,
                4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6 });
        int[] res2 = s.plusOne(new int[] { 9, 9 });
        int[] res3 = s.plusOne(new int[] { 9, 9, 9 });

        System.out.println(Arrays.toString(res3));
    }
}
