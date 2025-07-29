public class LinearIn {
    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while (i < inner.length && j < outer.length) {
            if (inner[i] == outer[j]) {
                i++;
                j++;
            } else if (outer[j] < inner[i]) {
                j++;
            } else {
                return false;
            }
        }

        return i == inner.length;
    }

    public static void main(String[] args) {
        System.out.println(linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 4}));
        System.out.println(linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}));
        System.out.println(linearIn(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4}));
    }
}
