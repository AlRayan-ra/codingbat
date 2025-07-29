public class LastTwo {
    public static String lastTwo(String str) {
        if (str.length() < 2){
            return str;
        }
        String front = str.substring(0, str.length() - 2);

        char secaondLast = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);

        return front + last + secaondLast;


    }
    public static void main(String[] args){
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }
}
