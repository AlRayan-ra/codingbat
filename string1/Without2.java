public class Without2 {
    public static String without2(String str) {
        if (str.length() >= 2) {
            String start = str.substring(0, 2);
            String end = str.substring(str.length() - 2);

            if (start.equals(end)) {
                return str.substring(2);
            }
        }
        return str;
    }
    public static void main(String[] args){
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }
}
