public class StartHi {
    public static boolean startHi(String str){
        if (str.length() < 2 ) return false;

        String firstTwo = str.substring(0, 2);

        if (firstTwo.equals("hi")){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi "));
        System.out.println(startHi("hello hi"));
        System.out.println(startHi("h"));
        System.out.println(startHi("hippo"));
    }
}
