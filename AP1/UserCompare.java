public class UserCompare {
    public static int userCompare(String aName, int aId, String bName, int bId) {
        int cmp = aName.compareTo(bName);
        if (cmp < 0) {
            return -1;
        } else if (cmp > 0) {
            return 1;
        } else {
            if (aId < bId) {
                return -1;
            } else if (aId > bId) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(userCompare("bb", 1, "zz", 2));
        System.out.println(userCompare("bb", 1, "aa", 2));
        System.out.println(userCompare("bb", 1, "bb", 1));
    }
}
