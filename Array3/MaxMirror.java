public class MaxMirror {
    public static int maxMirror(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int a = i;
                int b = j;
                while (a < nums.length && b >= 0 && nums[a] == nums[b]) {
                    count++;
                    a++;
                    b--;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[] {1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[] {1, 2, 1, 4}));
        System.out.println(maxMirror(new int[] {7, 1, 2, 9, 7, 2, 1}));
    }
}
