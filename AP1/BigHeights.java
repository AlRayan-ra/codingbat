public class BigHeights {
    public static int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            int diff = Math.abs(heights[i + 1] - heights[i]);
            if (diff >= 5) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}
