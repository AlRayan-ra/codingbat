public class Front11 {
    public static int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        int[] r1 = front11(new int[]{1, 2, 3}, new int[]{7, 9, 8});
        System.out.println(r1.length == 2 ? r1[0] + ", " + r1[1] : r1[0]);

        int[] r2 = front11(new int[]{1}, new int[]{2});
        System.out.println(r2.length == 2 ? r2[0] + ", " + r2[1] : r2[0]);

        int[] r3 = front11(new int[]{1, 7}, new int[]{});
        System.out.println(r3[0]);
    }
}
