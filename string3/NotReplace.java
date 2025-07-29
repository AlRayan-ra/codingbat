public class NotReplace {
    public static String notReplace(String str) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                boolean before = (i > 0 && Character.isLetter(str.charAt(i - 1)));
                boolean after = (i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)));

                if (!before && !after) {
                    result += "is not";
                    i += 2;
                    continue;
                }
            }

            result += str.charAt(i);
            i++;
        }

        return result;
    }
    public static void main (String[] args) {
        System.out.println(notReplace("is test") );
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }

}
