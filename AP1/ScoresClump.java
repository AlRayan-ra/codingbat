public class ScoresClump {
    public static boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            int diff = scores[i + 2] - scores[i];
            if (diff <= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(scoresClump(new int[]{3, 4, 5}));
        System.out.println(scoresClump(new int[]{3, 4, 6}));
        System.out.println(scoresClump(new int[]{1, 3, 5, 5}));
    }
}
