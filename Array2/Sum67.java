public class Sum67 {

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                skip = true;
            } else if (skip && nums[i] == 7) {
                skip = false;
            } else if (!skip) {
                sum += nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2};
        int[] arr2 = {1, 2, 2, 6, 99, 99, 7};
        int[] arr3 = {1, 1, 6, 7, 2};

        System.out.println(sum67(arr1));
        System.out.println(sum67(arr2));
        System.out.println(sum67(arr3));
    }
}
