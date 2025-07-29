public class MakeLast {
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public static void main(String[] args) {
        int[] r1 = makeLast(new int[]{4, 5, 6});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2] + ", " + r1[3] + ", " + r1[4] + ", " + r1[5]);

        int[] r2 = makeLast(new int[]{1, 2});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2] + ", " + r2[3]);

        int[] r3 = makeLast(new int[]{3});
        System.out.println(r3[0] + ", " + r3[1]);
    }
}
