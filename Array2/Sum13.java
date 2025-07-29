public class Sum13 {

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++; // skip the next number after 13
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {1, 1};
        int[] nums3 = {1, 2, 2, 1, 13};

        System.out.println(sum13(nums1));
        System.out.println(sum13(nums2));
        System.out.println(sum13(nums3));
    }
}
