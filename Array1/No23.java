public class No23 {
    public static boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3);
    }

    public static void main(String[] args) {
        System.out.println(no23(new int[]{4, 5})); // true
        System.out.println(no23(new int[]{4, 2})); // false
        System.out.println(no23(new int[]{3, 5})); // false
    }
}

