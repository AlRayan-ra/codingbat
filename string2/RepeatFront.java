public class RepeatFront {
    public static String repeatFront(String str, int n) {
        String result = "";

        for (int i = n; i > 0; i--) {
            String part = str.substring(0, i);

            result = result + part;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
    }
}
