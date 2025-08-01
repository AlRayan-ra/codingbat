public class Sum28 {

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 2, 2, 4, 2};
        int[] arr2 = {2, 3, 2, 2, 4, 2, 2};
        int[] arr3 = {1, 2, 3, 4};

        System.out.println(sum28(arr1));
        System.out.println(sum28(arr2));
        System.out.println(sum28(arr3));
    }
}
