public class SumDigits {
    public static int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {

                int digit = Integer.parseInt("" + c);
                sum += digit;
            }
        }

        return sum;
    }
    public static void main (String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
    }

}
