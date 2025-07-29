public class Max1020 {
    public static int max1020(int a, int b) {
        boolean inRangeA = ( a >= 10 && a <= 20);
        boolean inRangeB = ( b >= 10 && b <= 20);

        if (inRangeA && inRangeB) {
            return Math.max(a, b);

        }else if (inRangeA){
            return a;

        }else if (inRangeB){
            return b;
        }else{
            return 0;
        }

    }
    public static void main(String[] args){
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }
}
