public class SeriesUp {
    public static int[] seriesUp(int n) {
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index] = j;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = seriesUp(3);
        int[] b = seriesUp(4);
        int[] c = seriesUp(2);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
