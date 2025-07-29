public class MaxBlock {
    public static int maxBlock(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int maxBlock = 1;
        int currentBlock = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlock++;
            } else {
                if (currentBlock > maxBlock) {
                    maxBlock = currentBlock;
                }
                currentBlock = 1;
            }
        }

        if (currentBlock > maxBlock) {
            maxBlock = currentBlock;
        }

        return maxBlock;
    }
    public static void main (String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }

}
