public class SameEnds {

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SameEnds obj = new SameEnds();

        int[] arr = {5, 6, 45, 99, 13, 5, 6};

        System.out.println(obj.sameEnds(arr, 1));
        System.out.println(obj.sameEnds(arr, 2));
        System.out.println(obj.sameEnds(arr, 3));
    }
}
