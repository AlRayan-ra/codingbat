public class ZeroMax {
    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > maxOdd) {
                        maxOdd = nums[j];
                    }
                }
                if (maxOdd != 0) {
                    nums[i] = maxOdd;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 5, 0, 3};
        int[] arr2 = {0, 4, 0, 3};
        int[] arr3 = {0, 1, 0};

        printArray(zeroMax(arr1)); // [5, 5, 3, 3]
        printArray(zeroMax(arr2)); // [3, 4, 3, 3]
        printArray(zeroMax(arr3)); // [1, 1, 0]
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
