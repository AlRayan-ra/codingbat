public class Left2 {
    public static String left2(String str) {
        String first2 = str.substring(0, 2);

        String rest = str.substring(2);

        return rest + first2;
    }
    public static void main(String[] args){
        System.out.println(left2("Hello") );
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }

}
