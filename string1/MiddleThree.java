public class MiddleThree {
    public static String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid -1, mid +2);
    }

    public static void main(String[] args){
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and") );
        System.out.println(middleThree("solving"));
    }

}
