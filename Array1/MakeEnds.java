public class MakeEnds {
    public static int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        int[] r1 = makeEnds(new int[]{1, 2, 3});
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = makeEnds(new int[]{1, 2, 3, 4});
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = makeEnds(new int[]{7, 4, 6, 2});
        System.out.println(r3[0] + ", " + r3[1]);
    }
}
