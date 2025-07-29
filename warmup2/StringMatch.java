public class StringMatch {
    public static int stringMatch(String a, String b) {
        int count = 0;


        int minLength = Math.min(a.length(), b.length());


        for (int i = 0; i < minLength - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);

            if (subA.equals(subB)) {
                count = count + 1;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

}
