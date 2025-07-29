public class Post4 {

    public static int[] post4(int[] nums) {
        int last4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                last4 = i;
            }
        }

        int[] result = new int[nums.length - last4 - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[last4 + 1 + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 2};
        int[] arr2 = {4, 1, 4, 2};
        int[] arr3 = {4, 4, 1, 2, 3};

        int[] r1 = post4(arr1);
        for (int i = 0; i < r1.length; i++) {
            System.out.print(r1[i] + " ");
        }
        System.out.println();

        int[] r2 = post4(arr2);
        for (int i = 0; i < r2.length; i++) {
            System.out.print(r2[i] + " ");
        }
        System.out.println();

        int[] r3 = post4(arr3);
        for (int i = 0; i < r3.length; i++) {
            System.out.print(r3[i] + " ");
        }
    }
}
