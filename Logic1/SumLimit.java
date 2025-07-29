public class SumLimit {
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        String aStr = String.valueOf(a);
        String sumStr = String.valueOf(sum);

        if (sumStr.length() == aStr.length()) {
            return sum;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));
    }
}
