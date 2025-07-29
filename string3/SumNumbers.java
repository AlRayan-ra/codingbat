public class SumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                num = num + c;
            }else {
                if (!num.equals("")) {
                    sum = sum + Integer.parseInt(num);
                    num = "";

                }
            }
        }
        if (!num.equals("")) {
            sum = sum + Integer.parseInt(num);

        }
        return sum;
    }
    public static void main (String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

    }

}
