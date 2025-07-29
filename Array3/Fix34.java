public class Fix34 {
    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {

                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] r1 = fix34(new int[] {1, 3, 1, 4});
        int[] r2 = fix34(new int[] {1, 3, 1, 4, 4, 3, 1});
        int[] r3 = fix34(new int[] {3, 2, 2, 4});

        for (int x : r1) System.out.print(x + " ");
        System.out.println();

        for (int x : r2) System.out.print(x + " ");
        System.out.println();

        for (int x : r3) System.out.print(x + " ");
        System.out.println();
    }
}
