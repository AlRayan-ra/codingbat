public class MidThree {
    public static int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public static void main(String[] args) {
        int[] r1 = midThree(new int[]{1, 2, 3, 4, 5});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2]);

        int[] r2 = midThree(new int[]{8, 6, 7, 5, 3, 0, 9});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2]);

        int[] r3 = midThree(new int[]{1, 2, 3});
        System.out.println(r3[0] + ", " + r3[1] + ", " + r3[2]);
    }
}
