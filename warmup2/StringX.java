public class StringX {
    public static String stringX(String str) {
        if ( str.length() <= 2) {
            return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() -1);

        String mid = str.substring(1, str.length() -1);
        mid = mid.replace("x", "");

        return first + mid + last;



    }

    public static void main (String[] args){
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
}
