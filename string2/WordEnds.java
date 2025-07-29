public class WordEnds{
    public static String wordEnds(String str, String word) {

        String result = "";
        int wlen = word.length();

        for (int i = 0; i <= str.length() - wlen; i++) {
            if (str.substring(i, i + wlen).equals(word)) {

                if (i > 0) {
                    result = result + str.charAt(i - 1);
                }

                if (i + wlen < str.length()) {
                    result = result + str.charAt(i + wlen);
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

}
