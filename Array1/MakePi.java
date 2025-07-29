public class MakePi {
    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static void main(String[] args) {
        int[] r = makePi();
        System.out.println(r[0] + ", " + r[1] + ", " + r[2]);
    }
}
