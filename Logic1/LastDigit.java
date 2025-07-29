public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        return aLast == bLast || aLast == cLast || bLast == cLast;
    }
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
    }

}
