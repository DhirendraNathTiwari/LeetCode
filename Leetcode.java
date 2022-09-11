import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[][] arr = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
        maxEnvelopes(arr);
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes);
        System.out.println(Arrays.deepToString(envelopes));
        return 1;

    }
}
