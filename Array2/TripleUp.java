public class TripleUp {
    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6, 2};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};

        System.out.println(tripleUp(arr1)); // true
        System.out.println(tripleUp(arr2)); // true
        System.out.println(tripleUp(arr3)); // false
    }
}
