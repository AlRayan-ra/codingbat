public class ShiftLeft {

    public static int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};

        int[] result1 = shiftLeft(arr1);
        int[] result2 = shiftLeft(arr2);
        int[] result3 = shiftLeft(arr3);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + " ");
        }
    }
}

