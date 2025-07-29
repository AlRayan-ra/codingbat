public class FrontPiece {
    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        } else if (nums.length == 1) {
            return new int[]{nums[0]};
        } else {
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        int[] r1 = frontPiece(new int[]{1, 2, 3});
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = frontPiece(new int[]{1, 2});
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = frontPiece(new int[]{1});
        System.out.println(r3[0]);
    }
}
