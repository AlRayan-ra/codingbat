public class PlusOut {
    public static String plusOut(String str, String word) {
        String result = "";
        int i = 0;

        while (i < str.length()) {

            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length();
            } else {
                result += "+";
                i++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }
}
