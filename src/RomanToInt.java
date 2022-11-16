import java.util.Map;

public class RomanToInt {
    private static Map<Character, Integer> values = Map.of('M', 1000, 'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I',
            1);

    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;

        char[] chars = s.toCharArray();
        /*
         * s= XI
         * chars=x|I
         * value=10|1
         */

        for (int i = chars.length - 1; i >= 0; i--) {
            int value = values.get(chars[i]);

            if (value >= prev) {
                sum += value;
            } else {
                sum -= value;
            }

            prev = value;

        }

        return sum;

    }

    public static void main(String[] args) {
        var s = new RomanToInt();

        System.out.println(s.romanToInt("MMCXI"));
    }
}