public class StringYak {

    public static String stringYak(String str) {
        String result = "";

        int i = 0;

        while (i < str.length()){

            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k'){
                i = i + 3 ;

            }else {

                result = result + str.charAt(i);
                i = i +1;
            }
        }

        return result;
    }

    public static void main( String [] args ){
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

}
