public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            return 0;

        }else if (speed <= 80) {
            return 1;

        }else {
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false) );
        System.out.println(caughtSpeeding(65, true));
    }

}
