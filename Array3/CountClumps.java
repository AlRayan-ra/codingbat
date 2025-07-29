public class CountClumps {
    public static int countClumps(int[] nums) {
        int count = 0;
        boolean inClump = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (!inClump) {
                    count++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[] {1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[] {1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[] {1, 1, 1, 1, 1}));
    }
}
