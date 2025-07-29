public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0, j = 0, k = 0;

        while (k < n) {
            if (i < a.length && (j >= b.length || a[i].compareTo(b[j]) < 0)) {
                if (k == 0 || !a[i].equals(result[k - 1])) {
                    result[k++] = a[i];
                }
                i++;
            } else if (j < b.length && (i >= a.length || a[i].compareTo(b[j]) > 0)) {
                if (k == 0 || !b[j].equals(result[k - 1])) {
                    result[k++] = b[j];
                }
                j++;
            } else {
                if (k == 0 || !a[i].equals(result[k - 1])) {
                    result[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] res1 = mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3);
        String[] res2 = mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3);
        String[] res3 = mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3);

        for (int i = 0; i < res1.length; i++) System.out.print(res1[i] + (i < res1.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res2.length; i++) System.out.print(res2[i] + (i < res2.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res3.length; i++) System.out.print(res3[i] + (i < res3.length - 1 ? ", " : "\n"));
    }
}
