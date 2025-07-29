public class FrontAgain {
    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String front = str.substring(0, 2);

        String end = str.substring(str.length() - 2);

        return front.equals(end);
    }
    public static void main(String[] args){
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }
}
