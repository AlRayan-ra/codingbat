public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        String lastPart = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + lastPart;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}
