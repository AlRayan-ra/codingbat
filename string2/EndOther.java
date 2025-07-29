public class EndOther {
    public static boolean endOther(String a, String b) {
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);


    }
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }
}
