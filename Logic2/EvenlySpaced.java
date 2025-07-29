public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int medium = a + b + c - small - large;  // sum minus small and large

        return (medium - small) == (large - medium);
    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
    }
}
