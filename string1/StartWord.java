public class StartWord {
    public static String startWord(String str, String word) {
        if (str.length() < word.length()){
            return"";

        }
        String strSub = str.substring(1, word.length());
        String wordSub = word.substring(1);

        if (strSub.equals(wordSub)){
            return str.substring(0, word.length());

        }else{
            return "";

        }
    }
    public static void main(String[] args){
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip") );
        System.out.println(startWord("hippo", "i") );
    }
}
