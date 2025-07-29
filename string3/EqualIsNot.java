public class EqualIsNot {
    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                isCount++;
            }

            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }
    public static void main (String[] args) {
        System.out.println(equalIsNot("This is not") );
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

}
