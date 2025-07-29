public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++){
            if (nums[i] == 9){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

}
