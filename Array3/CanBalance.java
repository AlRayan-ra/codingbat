public class CanBalance {
    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j <= i; j++) {
                leftSum += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[] {2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[] {10, 10}));
    }
}
