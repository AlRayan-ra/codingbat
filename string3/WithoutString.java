public class WithoutString {
    public static String withoutString(String base, String remove) {
        String result = "";

        String lowBase = base.toLowerCase();
        String lowRemove = remove.toLowerCase();

        int i = 0;

        while (i < base.length()) {
            if (i + remove.length() <= base.length() && lowBase.substring(i, i + remove.length()).equals(lowRemove)) {
                i = i + remove.length();

            }else {
                result = result + base.charAt(i);
                i++;

            }
        }
        return result;

    }
    public static void main (String[] args) {
        System.out.println(withoutString("Hello there", "llo") );
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));

    }
}
