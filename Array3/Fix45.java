public class Fix45 {
    public static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
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
        int[] r1 = fix45(new int[] {5, 4, 9, 4, 9, 5});
        int[] r2 = fix45(new int[] {1, 4, 1, 5});
        int[] r3 = fix45(new int[] {1, 4, 1, 5, 5, 4, 1});

        for (int x : r1) System.out.print(x + " ");
        System.out.println();

        for (int x : r2) System.out.print(x + " ");
        System.out.println();

        for (int x : r3) System.out.print(x + " ");
        System.out.println();
    }
}
