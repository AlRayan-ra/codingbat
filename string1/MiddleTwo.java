public class MiddleTwo {
    public static String middleTwo(String str) {
        int mid = str.length() / 2;

        return str.substring(mid - 1, mid + 1);
    }
    public static void main(String[] args){
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

}
