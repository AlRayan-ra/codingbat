public class SwapEnds {
    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        int[] r1 = swapEnds(new int[]{1, 2, 3, 4});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2] + ", " + r1[3]);

        int[] r2 = swapEnds(new int[]{1, 2, 3});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2]);

        int[] r3 = swapEnds(new int[]{8, 6, 7, 9, 5});
        System.out.println(r3[0] + ", " + r3[1] + ", " + r3[2] + ", " + r3[3] + ", " + r3[4]);
    }
}
