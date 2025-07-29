public class OneTwo {
    public static String oneTwo(String str) {
        String result = "";


        for (int i = 0; i + 2 < str.length(); i += 3) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            char third = str.charAt(i + 2);


            result = result + second + third + first;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }

}
