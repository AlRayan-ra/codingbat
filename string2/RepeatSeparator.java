public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result = result + word;

            if (i < count - 1) {
                result = result + sep;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }
}
