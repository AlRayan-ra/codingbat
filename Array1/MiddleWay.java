public class MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public static void main(String[] args) {
        int[] r1 = middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});
        System.out.println(r3[0] + ", " + r3[1]);
    }
}

