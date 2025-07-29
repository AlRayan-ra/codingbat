public class ExtraFront {

    public static String extraFront(String str) {
        String front;

        if (str.length() >= 2){
            front = str.substring(0, 2);
        }else{
            front = str;

        }
        return front + front + front;
    }
    public static void main(String[] args){
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }

}
