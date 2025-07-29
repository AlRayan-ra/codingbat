public class Lucky13 {

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 2, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};

        System.out.println(lucky13(arr1));
        System.out.println(lucky13(arr2));
        System.out.println(lucky13(arr3));
    }
}
