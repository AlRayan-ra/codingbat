public class ScoresAverage {
    public static int scoresAverage(int[] scores) {
        int len = scores.length;

        int firstHalf = average(scores, 0, (len / 2) - 1);
        int secondHalf = average(scores, len / 2, len - 1);

        if (firstHalf > secondHalf) {
            return firstHalf;
        } else {
            return secondHalf;
        }
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 4, 4};
        int[] arr2 = {4, 4, 4, 2, 2, 2};
        int[] arr3 = {3, 4, 5, 1, 2, 3};

        System.out.println(scoresAverage(arr1));
        System.out.println(scoresAverage(arr2));
        System.out.println(scoresAverage(arr3));
    }
}
