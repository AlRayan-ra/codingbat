public class ScoreUp {
    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                // do nothing
            } else if (answers[i].equals(key[i])) {
                score += 4;
            } else {
                score -= 1;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String[] key = {"a", "a", "b", "b"};
        System.out.println(scoreUp(key, new String[]{"a", "c", "b", "c"}));
        System.out.println(scoreUp(key, new String[]{"a", "a", "b", "c"}));
        System.out.println(scoreUp(key, new String[]{"a", "a", "b", "b"}));
    }
}
