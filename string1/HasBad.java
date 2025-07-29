public class HasBad {
    public static boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }


}
