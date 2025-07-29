public class ExtraEnd {
    public static String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);

        return last2 + last2 +last2;


    }

    public static void main(String[] args){
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi") );
    }
}
