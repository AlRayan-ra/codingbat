public class CopyEndy {
    public static int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
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


        int[] res1 = copyEndy(new int[]{9, 11, 90, 22, 6}, 2);
        int[] res2 = copyEndy(new int[]{9, 11, 90, 22, 6}, 3);
        int[] res3 = copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2);

        // Print results simply
        for (int i = 0; i < res1.length; i++) System.out.print(res1[i] + (i < res1.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res2.length; i++) System.out.print(res2[i] + (i < res2.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res3.length; i++) System.out.print(res3[i] + (i < res3.length - 1 ? ", " : "\n"));
    }
}
