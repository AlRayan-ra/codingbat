public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumB > sumA) return b;
        return a;
    }

    public static void main(String[] args) {
        int[] r1 = biggerTwo(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = biggerTwo(new int[]{3, 4}, new int[]{1, 2});
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = biggerTwo(new int[]{1, 1}, new int[]{1, 2});
        System.out.println(r3[0] + ", " + r3[1]);
    }
}
