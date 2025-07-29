public class Unlucky1 {
    public static boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len >= 2) {
            if (nums[0] == 1 && nums[1] == 3) return true;
            if (len > 2 && nums[1] == 1 && nums[2] == 3) return true;
            if (nums[len - 2] == 1 && nums[len - 1] == 3) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{1, 1, 1}));
    }
}

