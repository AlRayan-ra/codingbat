public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        int[] r1 = plusTwo(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(r1[0] + ", " + r1[1] + ", " + r1[2] + ", " + r1[3]);

        int[] r2 = plusTwo(new int[]{4, 4}, new int[]{2, 2});
        System.out.println(r2[0] + ", " + r2[1] + ", " + r2[2] + ", " + r2[3]);

        int[] r3 = plusTwo(new int[]{9, 2}, new int[]{3, 4});
        System.out.println(r3[0] + ", " + r3[1] + ", " + r3[2] + ", " + r3[3]);
    }
}
