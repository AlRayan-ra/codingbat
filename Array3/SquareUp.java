public class SquareUp {
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j <= i) {
                    result[index] = j;
                } else {
                    result[index] = 0;
                }
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = squareUp(3);
        int[] b = squareUp(2);
        int[] c = squareUp(4);

        for (int x : a) System.out.print(x + " ");
        System.out.println();

        for (int x : b) System.out.print(x + " ");
        System.out.println();

        for (int x : c) System.out.print(x + " ");
        System.out.println();
    }
}
