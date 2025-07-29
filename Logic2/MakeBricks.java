public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        int maxBigBricks = goal / 5;
        if (maxBigBricks > big) {
            maxBigBricks = big;
        }

        int remaining = goal - maxBigBricks * 5;
        return small >= remaining;
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }
}
