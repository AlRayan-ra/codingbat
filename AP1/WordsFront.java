public class WordsFront {
    public static String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] res1 = wordsFront(new String[]{"a", "b", "c", "d"}, 1);
        String[] res2 = wordsFront(new String[]{"a", "b", "c", "d"}, 2);
        String[] res3 = wordsFront(new String[]{"a", "b", "c", "d"}, 3);

        for (int i = 0; i < res1.length; i++) System.out.print(res1[i] + (i < res1.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res2.length; i++) System.out.print(res2[i] + (i < res2.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res3.length; i++) System.out.print(res3[i] + (i < res3.length - 1 ? ", " : "\n"));
    }
}
