public class XyBalance {
    public static boolean xyBalance(String str) {
        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                balanced = false;
            }
            if (str.charAt(i) == 'y') {
                balanced = true;
            }
        }

        return balanced;
    }
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }
}
