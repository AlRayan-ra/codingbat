public class MaxMod5 {
    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            if (a < b) {
                return a;

            } else {
                return b;

            }
        }else {
            if (a > b){
                return a;
            }else {
                return b;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
    }

}
