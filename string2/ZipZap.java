public class ZipZap {
    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result = result + "zp";
                i = i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

}
