public class MixStart {
    public static boolean mixStart(String str){
        if (str.length() <3){
            return false;

        }
        return str.substring(1, 3).equals("ix");
    }

    public static void main(String[] args){


        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));


    }
}
