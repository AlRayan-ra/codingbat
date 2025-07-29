public class SumHeights2 {
    public static int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                sum += diff * 2;
            } else {
                sum += -diff;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
        System.out.println(sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1));
        System.out.println(sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}
