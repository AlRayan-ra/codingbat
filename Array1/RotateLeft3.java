public class RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static void main(String[] args) {
        int[] r1 = rotateLeft3(new int[]{1, 2, 3});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2]);

        int[] r2 = rotateLeft3(new int[]{5, 11, 9});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2]);

        int[] r3 = rotateLeft3(new int[]{7, 0, 0});
        System.out.println(r3[0] + ", " + r3[1] + ", " + r3[2]);
    }
}
