public class MonkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return aSmile == bSmile;

    }

    public static void main(String[] args){
        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));



    }
}
