public class SquirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (temp >= 60 && temp <= 100) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp >= 60 && temp <= 90) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
    }
}
