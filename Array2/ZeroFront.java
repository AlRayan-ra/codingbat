public class ZeroFront {
    public static int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[index] = 0;
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1};
        int[] b = {0, 1, 1, 0, 1};
        int[] c = {1, 0};

        int[] r1 = zeroFront(a);
        int[] r2 = zeroFront(b);
        int[] r3 = zeroFront(c);

        for (int n : r1) System.out.print(n + " ");
        System.out.println();
        for (int n : r2) System.out.print(n + " ");
        System.out.println();
        for (int n : r3) System.out.print(n + " ");
    }
}
