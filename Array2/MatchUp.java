public class MatchUp {

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = nums1[i] - nums2[i];
            if (diff != 0 && Math.abs(diff) <= 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {2, 3, 10};
        System.out.println(matchUp(a1, b1));  // 2

        int[] a2 = {1, 2, 3};
        int[] b2 = {2, 3, 5};
        System.out.println(matchUp(a2, b2));  // 3

        int[] a3 = {1, 2, 3};
        int[] b3 = {2, 3, 3};
        System.out.println(matchUp(a3, b3));  // 2
    }
}
