public class ScoresIncreasing {
    public static boolean scoresIncreasing(int[] scores) {
        for (int i =1; i < scores.length; i++) {
            if(scores[i] < scores [i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 4};
        int[] b = {1, 3, 2};
        int[] c = {1, 1, 4};

        System.out.println(scoresIncreasing(a));
        System.out.println(scoresIncreasing(b));
        System.out.println(scoresIncreasing(c));
    }

}
