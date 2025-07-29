public class Right2 {
    public static String right2(String str) {
        String last2 = str.substring (str.length() - 2);

        String rest = str.substring (0, str.length() - 2);

        return last2 + rest;

    }
    public static void main(String[] args){
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }
}
