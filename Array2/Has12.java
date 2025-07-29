public class Has12 {
    public static boolean has12(int[] nums) {
        boolean found1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                found1 = true;
            }
            if (found1 && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {3, 1, 2};
        int[] arr3 = {3, 1, 4, 5, 2};

        System.out.println(has12(arr1));
        System.out.println(has12(arr2));
        System.out.println(has12(arr3));
    }
}
