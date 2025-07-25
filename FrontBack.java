public class FrontBack {
    public static String frontBack(String str) {
        int len = str.length();

        if (len<= 1){
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(len - 1);
        String middle = str.substring(1, len - 1);

        return last + middle + first;


    }
    public static void main(String[] args) {
        System.out .println(frontBack("code"));
        System.out .println(frontBack("a"));
        System.out .println(frontBack("ab"));

    }
}
