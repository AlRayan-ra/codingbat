public class Fix23 {
    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] r1 = fix23(new int[]{1, 2, 3});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2]);

        int[] r2 = fix23(new int[]{2, 3, 5});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2]);

        int[] r3 = fix23(new int[]{1, 2, 1});
        System.out.println(r3[0] + ", " + r3[1] + ", " + r3[2]);
    }
}

