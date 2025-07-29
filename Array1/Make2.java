public class Make2 {
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        if (a.length > 0) {
            result[index++] = a[0];
            if (a.length > 1 && index < 2) result[index++] = a[1];
        }

        int j = 0;
        while (index < 2) {
            result[index++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] r1 = make2(new int[]{4, 5}, new int[]{1, 2, 3});
        System.out.println(r1[0] + ", " + r1[1]);

        int[] r2 = make2(new int[]{4}, new int[]{1, 2, 3});
        System.out.println(r2[0] + ", " + r2[1]);

        int[] r3 = make2(new int[]{}, new int[]{1, 2});
        System.out.println(r3[0] + ", " + r3[1]);
    }
}
