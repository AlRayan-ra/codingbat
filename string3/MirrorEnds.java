public class MirrorEnds {

    public static String mirrorEnds(String str) {
        String result = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == str.charAt(len - 1 - i)) {
                result = result + str.charAt(i);
            }else {
                break;
            }

        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }

}
