public class AtFirst {
    public static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);

        }else if (str.length() == 1) {
            return str + "@";
        }else{
            return "@@";
        }
    }
    public static void main(String[] args){
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }

}
