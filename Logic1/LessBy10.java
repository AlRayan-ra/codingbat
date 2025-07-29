public class LessBy10{
    public boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10) {
            return true;
        } else if (Math.abs(a - c) >= 10) {
            return true;
        } else if (Math.abs(b - c) >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LessBy10 obj = new LessBy10();

        System.out.println(obj.lessBy10(1, 7, 11));
        System.out.println(obj.lessBy10(1, 7, 10));
        System.out.println(obj.lessBy10(11, 1, 7));

    }
}
