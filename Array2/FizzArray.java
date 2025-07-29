public class FizzArray {

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result1 = fizzArray(4);
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        int[] result2 = fizzArray(1);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();

        int[] result3 = fizzArray(10);
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + " ");
        }
    }
}
