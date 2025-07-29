public class ModThree {public class Main {

    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean allEven = (nums[i] % 2 == 0) && (nums[i+1] % 2 == 0) && (nums[i+2] % 2 == 0);
            boolean allOdd = (nums[i] % 2 != 0) && (nums[i+1] % 2 != 0) && (nums[i+2] % 2 != 0);
            if (allEven || allOdd) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 3, 5}));
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
        System.out.println(modThree(new int[]{2, 4, 2, 5}));
    }
}

}
