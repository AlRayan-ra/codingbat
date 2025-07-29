public class GetSandwich {
    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first != -1 && last != -1 && first != last) {
            return str.substring(first + 5, last);
        }

        return "";
    }
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

}
