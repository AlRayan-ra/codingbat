public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {
        int max = nums[0] > nums[2] ? nums[0] : nums[2];
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    public static void main(String[] args) {
        int[] r1 = maxEnd3(new int[]{1, 2, 3});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2]);

        int[] r2 = maxEnd3(new int[]{11, 5, 9});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2]);

        int[] r3 = maxEnd3(new int[]{2, 11, 3});
        System.out.println(r3[0] + ", " + r3[1] + ", " + r3[2]);
    }
}
