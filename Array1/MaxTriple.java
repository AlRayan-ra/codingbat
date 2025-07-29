public class MaxTriple {
    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        int max = first;
        if (middle > max) max = middle;
        if (last > max) max = last;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));
    }
}

