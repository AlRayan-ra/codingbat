public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        int sum = 0;

        if (a >= 13 && a <= 19 && a != 15 && a != 16) {
            a = 0;
        }
        if (b >= 13 && b <= 19 && b != 15 && b != 16) {
            b = 0;
        }
        if (c >= 13 && c <= 19 && c != 15 && c != 16) {
            c = 0;
        }

        sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {


        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));
    }
}
