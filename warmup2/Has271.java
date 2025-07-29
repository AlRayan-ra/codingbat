public class Has271 {
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length -2 ; i++){
            int val = nums[i];

            if  (nums[i + 1] == val + 5){
                if (Math.abs(nums [i + 2 ] - (val - 1)) <= 2){
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));
    }

}
