public class TwoTwo {
    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean left = (i > 0 && nums[i - 1] == 2);
                boolean right = (i < nums.length - 1 && nums[i + 1] == 2);
                if (!left && !right) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 3};
        int[] arr2 = {2, 2, 4};
        int[] arr3 = {2, 2, 4, 2};

        System.out.println(twoTwo(arr1));
        System.out.println(twoTwo(arr2));
        System.out.println(twoTwo(arr3));
    }
}
