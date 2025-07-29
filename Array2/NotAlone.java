public class NotAlone {
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                if (nums[i - 1] > nums[i + 1]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 2, 5, 2};
        int[] arr3 = {3, 4};

        printArray(notAlone(arr1, 2)); // [1, 3, 3]
        printArray(notAlone(arr2, 2)); // [1, 3, 3, 5, 5, 2]
        printArray(notAlone(arr3, 3)); // [3, 4]
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
