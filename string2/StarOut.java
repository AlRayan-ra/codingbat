public class StarOut {
    public static String starOut(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);

            if (current == '*') {
                continue;
            }

            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            result = result + current;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }
}
