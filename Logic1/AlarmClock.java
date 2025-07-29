public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        boolean weekend = (day == 0 || day == 6);
        if (vacation) {
            if (weekend) {
                return "off";

            }else {
                return "10:00";

            }

        } else {
            if (weekend) {
                return "10:00";

            } else {
                return "7:00";
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
    }

}
