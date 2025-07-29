public class Less20 {
    public static boolean less20(int n) {
        if (n % 20 == 18 || n % 20 == 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(less20(18));
        System.out.println(less20(19));
        System.out.println(less20(20));
    }
}
