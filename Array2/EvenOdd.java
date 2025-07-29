public class EvenOdd {
    public static int[] evenOdd(int[] nums) {
        int[] arr = new int[nums.length];
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[pos] = nums[i];
                pos++;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[pos] = nums[i];
                pos++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 0, 1, 1};
        int[] b = {3, 3, 2};
        int[] c = {2, 2, 2};

        int[] r1 = evenOdd(a);
        int[] r2 = evenOdd(b);
        int[] r3 = evenOdd(c);

        for (int n : r1) System.out.print(n + " ");
        System.out.println();
        for (int n : r2) System.out.print(n + " ");
        System.out.println();
        for (int n : r3) System.out.print(n + " ");
    }
}
