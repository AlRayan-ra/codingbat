public class DoubleX {
   public static boolean  doubleX(String str) {
        int index = str.indexOf("x");

        if(index == -1 || index + 1 >= str.length()) {
            return false;

        }
        return str.charAt(index + 1) == 'x';

    }
    public static void main(String[] args){
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

}
