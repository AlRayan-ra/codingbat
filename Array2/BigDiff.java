public class BigDiff {

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 3, 5, 6};
        int[] arr2 = {7, 2, 10, 9};
        int[] arr3 = {2, 10, 7, 2};

        System.out.println(bigDiff(arr1));
        System.out.println(bigDiff(arr2));
        System.out.println(bigDiff(arr3));
    }
}
