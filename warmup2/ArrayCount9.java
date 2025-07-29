public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9){

                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(arrayCount9(new int[]{1, 2, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}
