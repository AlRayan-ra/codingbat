public class WordsWithout {
    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                result[index] = words[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] res1 = wordsWithout(new String[]{"a", "b", "c", "a"}, "a");
        String[] res2 = wordsWithout(new String[]{"a", "b", "c", "a"}, "b");
        String[] res3 = wordsWithout(new String[]{"a", "b", "c", "a"}, "c");

        for (int i = 0; i < res1.length; i++) System.out.print(res1[i] + (i < res1.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res2.length; i++) System.out.print(res2[i] + (i < res2.length - 1 ? ", " : "\n"));
        for (int i = 0; i < res3.length; i++) System.out.print(res3[i] + (i < res3.length - 1 ? ", " : "\n"));
    }

}
