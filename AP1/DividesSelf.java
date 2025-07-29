public class DividesSelf {
    public static boolean dividesSelf(int n) {
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(dividesSelf(128));
        System.out.println(dividesSelf(12));
        System.out.println(dividesSelf(120));
    }
}
