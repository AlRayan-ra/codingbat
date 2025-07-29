public class Pre4 {
    public static int[] pre4(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                pos = i;
                break;
            }
        }

        int[] result = new int[pos];
        for (int i = 0; i < pos; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 1};
        int[] b = {3, 1, 4};
        int[] c = {1, 4, 4};

        int[] r1 = pre4(a);
        int[] r2 = pre4(b);
        int[] r3 = pre4(c);

        for (int n : r1) System.out.print(n + " ");
        System.out.println();
        for (int n : r2) System.out.print(n + " ");
        System.out.println();
        for (int n : r3) System.out.print(n + " ");
    }
}
