public class HaveThree {
    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                // Check if next element is also 3 (no two 3s next to each other allowed)
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3, 1, 3};
        int[] arr2 = {3, 1, 3, 3};
        int[] arr3 = {3, 4, 3, 3, 4};

        System.out.println(haveThree(arr1)); // true
        System.out.println(haveThree(arr2)); // false
        System.out.println(haveThree(arr3)); // false
    }
}
