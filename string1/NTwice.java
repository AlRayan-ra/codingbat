public class NTwice {
    public static String nTwice(String str, int n) {
        String firstPart = str.substring(0, n);

        String lastPart = str.substring(str.length() -  n);

        return firstPart + lastPart;
    }

    public static void main(String[] args){
        System.out.println(nTwice("Hello", 2) );
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }

}
