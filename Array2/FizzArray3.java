public class FizzArray3 {
    public static int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = fizzArray3(5, 10);
        int[] b = fizzArray3(11, 18);
        int[] c = fizzArray3(1, 3);

        for (int x : a) System.out.print(x + " ");
        System.out.println();
        for (int x : b) System.out.print(x + " ");
        System.out.println();
        for (int x : c) System.out.print(x + " ");
    }
}
