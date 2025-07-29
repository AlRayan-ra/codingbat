public class InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if (a <= b && b <= c) {
                return true;
            } else {
                return false;
            }
        } else {
            if (a < b && b < c) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(inOrderEqual(2, 5, 11, false));
        System.out.println(inOrderEqual(5, 7, 6, false));
        System.out.println(inOrderEqual(5, 5, 7, true));
    }
}
