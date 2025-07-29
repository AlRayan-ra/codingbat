public class WithoutTen {

    public static int[] withoutTen(int[] nums) {
        int index = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        int[] r1 = withoutTen(arr1);
        for (int i = 0; i < r1.length; i++) {
            System.out.print(r1[i] + " ");
        }
        System.out.println();

        int[] r2 = withoutTen(arr2);
        for (int i = 0; i < r2.length; i++) {
            System.out.print(r2[i] + " ");
        }
        System.out.println();

        int[] r3 = withoutTen(arr3);
        for (int i = 0; i < r3.length; i++) {
            System.out.print(r3[i] + " ");
        }
    }
}
