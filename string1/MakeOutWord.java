public class MakeOutWord {

    public static String makeOutWord(String out, String word) {
        String firstPart = out.substring(0, 2);

        String lastPart = out.substring(2, 4);

        return firstPart + word + lastPart;


    }

    public static void main(String[] args){
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}
