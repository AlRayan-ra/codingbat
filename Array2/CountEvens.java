public class CountEvens {

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};

        System.out.println(countEvens(arr1));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));
    }
}
