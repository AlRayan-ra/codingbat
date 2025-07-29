public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (maxBig > big) {
            maxBig = big;
        }
        int remainder = goal - maxBig * 5;

        if (remainder <= small) {
            return remainder;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }
}
