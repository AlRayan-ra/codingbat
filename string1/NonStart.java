public class NonStart {
    public static String nonStart(String a, String b) {
        String aWithoutFirst = a.substring(1);
        String bWithoutFirst = b.substring(1);

        return aWithoutFirst + bWithoutFirst;

    }
    public static void main(String[] args){
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }
}
