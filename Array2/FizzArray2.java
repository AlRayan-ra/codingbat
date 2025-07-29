public class FizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = "" + i;  // simple way to convert int to String
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] a = fizzArray2(4);
        String[] b = fizzArray2(10);
        String[] c = fizzArray2(2);

        for (String s : a) System.out.print(s + " ");
        System.out.println();
        for (String s : b) System.out.print(s + " ");
        System.out.println();
        for (String s : c) System.out.print(s + " ");
    }
}
