public class ScoresSpecial {
    public static int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public static int largestSpecial(int[] scores) {
        int max = 0;
        for (int score : scores) {
            if (score % 10 == 0 && score > max) {
                max = score;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        System.out.println(scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
        System.out.println(scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
    }
}
