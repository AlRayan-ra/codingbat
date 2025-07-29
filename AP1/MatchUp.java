public class MatchUp {
    public static int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        System.out.println(matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        System.out.println(matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
    }
}
