public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        int index = 0;

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[index] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index] = "Fizz";
            } else if (i % 5 == 0) {
                result[index] = "Buzz";
            } else {
                result[index] = String.valueOf(i);
            }
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] r1 = fizzBuzz(1, 6);
        for (int i = 0; i < r1.length; i++) {
            System.out.print(r1[i] + " ");
        }
        System.out.println();

        String[] r2 = fizzBuzz(1, 8);
        for (int i = 0; i < r2.length; i++) {
            System.out.print(r2[i] + " ");
        }
        System.out.println();

        String[] r3 = fizzBuzz(1, 11);
        for (int i = 0; i < r3.length; i++) {
            System.out.print(r3[i] + " ");
        }
    }
}
