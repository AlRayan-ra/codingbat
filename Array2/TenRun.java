public class TenRun {
    public static int[] tenRun(int[] nums) {
        int currentMultiple = 0;
        boolean foundMultiple = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                currentMultiple = nums[i];
                foundMultiple = true;
            } else if (foundMultiple) {
                nums[i] = currentMultiple;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 10, 3, 4, 20, 5};
        int[] arr2 = {10, 1, 20, 2};
        int[] arr3 = {10, 1, 9, 20};

        printArray(tenRun(arr1)); // [2, 10, 10, 10, 20, 20]
        printArray(tenRun(arr2)); // [10, 10, 20, 20]
        printArray(tenRun(arr3)); // [10, 10, 10, 20]
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
