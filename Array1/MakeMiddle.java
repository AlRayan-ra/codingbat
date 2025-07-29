public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid - 1], nums[mid]};
    }

    public static void main(String[] args) {
        int[] r1 = makeMiddle(new int[] {1, 2, 3, 4});
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = makeMiddle(new int[] {7, 1, 2, 3, 4, 9});
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = makeMiddle(new int[] {1, 2});
        System.out.println(r3[0] + ", " + r3[1]);
    }
}

