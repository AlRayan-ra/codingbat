public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        sum = sum - min - max;
        return sum / (nums.length - 2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 100};
        int[] arr2 = {1, 1, 5, 5, 10, 8, 7};
        int[] arr3 = {-10, -4, -2, -4, -2, 0};

        System.out.println(centeredAverage(arr1));
        System.out.println(centeredAverage(arr2));
        System.out.println(centeredAverage(arr3));
    }
}
