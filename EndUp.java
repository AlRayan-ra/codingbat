public class EndUp {
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            int cut = str.length() - 3;
            String front = str.substring(0, cut);
            String end = str.substring(cut).toUpperCase();
            return front + end;
        }
    }

    public static void main(String[] args){
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }

}
