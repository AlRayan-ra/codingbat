public class IsEverywhere {

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3};
        int[] arr2 = {1, 2, 1, 3};
        int[] arr3 = {1, 2, 1, 3, 4};

        System.out.println(isEverywhere(arr1, 1));
        System.out.println(isEverywhere(arr2, 2));
        System.out.println(isEverywhere(arr3, 1));
    }
}
