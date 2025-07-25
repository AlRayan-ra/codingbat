public class hasTeen {
    public static boolean HasTeen(int a, int b, int c){
        return (a>=13 && a<=19)==
                (b>=13 && b<=19)==
                (c>=13 && c<=19);
    }

    public static void main(String[] args){
        System.out.println(HasTeen(13,20,10));
        System.out.println(HasTeen(20,19,10));
        System.out.println(HasTeen(20,10,13));
    }
}
