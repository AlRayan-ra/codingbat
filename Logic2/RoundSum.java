public class RoundSum {
    public static int roundSum(int a, int b, int c) {
        a = (a % 10 >= 5) ? a + (10 - a % 10) : a - (a % 10);
        b = (b % 10 >= 5) ? b + (10 - b % 10) : b - (b % 10);
        c = (c % 10 >= 5) ? c + (10 - c % 10) : c - (c % 10);

        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(12, 13, 14));
        System.out.println(roundSum(6, 4, 4));
    }
}
