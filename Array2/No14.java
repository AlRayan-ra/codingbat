public class No14 {

    public static boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                has1 = true;
            }
            if (nums[i] == 4) {
                has4 = true;
            }
        }

        return !(has1 && has4);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {2, 3, 4};

        System.out.println(no14(arr1));
        System.out.println(no14(arr2));
        System.out.println(no14(arr3));
    }
}
