public class CopyEvens {
    public static int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
                if (index == count) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 4, 5, 8};
        int[] arr2 = {3, 2, 4, 5, 8};
        int[] arr3 = {6, 1, 2, 4, 5, 8};

        int[] res1 = copyEvens(arr1, 2);
        int[] res2 = copyEvens(arr2, 3);
        int[] res3 = copyEvens(arr3, 3);

        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + (i < res1.length - 1 ? ", " : "\n"));
        }
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + (i < res2.length - 1 ? ", " : "\n"));
        }
        for (int i = 0; i < res3.length; i++) {
            System.out.print(res3[i] + (i < res3.length - 1 ? ", " : "\n"));
        }
    }
}