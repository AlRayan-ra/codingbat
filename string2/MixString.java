public class MixString {

    public static String mixString(String a, String b) {
        String result = "";


        int minLen = Math.min(a.length(), b.length());


        for (int i = 0; i < minLen; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }

        if (a.length() > minLen) {
            result = result + a.substring(minLen);
        }

        if (b.length() > minLen) {
            result = result + b.substring(minLen);
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
}
