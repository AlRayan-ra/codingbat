public class Has77 {

    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            }
            if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, 7};
        int[] arr2 = {1, 7, 1, 7};
        int[] arr3 = {1, 7, 1, 1, 7};

        System.out.println(has77(arr1)); // true
        System.out.println(has77(arr2)); // true
        System.out.println(has77(arr3)); // false
    }
}
