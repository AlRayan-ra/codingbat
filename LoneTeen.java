public class LoneTeen {
    public static boolean loneTeen(int a, int b) {
        boolean aTeen = isTeen(a);
        boolean bTeen = isTeen(b);
        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

    public static boolean isTeen(int n){
        return n >= 13 && n <= 19;
    }

    public static void main(String[] args){
        System.out.println(loneTeen(13,99));
        System.out.println(loneTeen(21,19));
        System.out.println(loneTeen(13,13));

    }
}
