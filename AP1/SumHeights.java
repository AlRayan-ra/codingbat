public class SumHeights {
    public static int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int diff = heights[i] - heights[i + 1];
            if (diff < 0) {
                diff = -diff;
            }
            sum += diff;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] heights = {5, 3, 6, 7, 2};

        System.out.println(sumHeights(heights, 2, 4));
        System.out.println(sumHeights(heights, 0, 1));
        System.out.println(sumHeights(heights, 0, 4));
    }
}
