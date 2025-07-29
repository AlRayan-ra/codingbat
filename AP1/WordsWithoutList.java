import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public static List wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                result.add(words[i]);
            }
        }

        return result;

    }
    public static void main(String[] args) {
        WordsWithoutList obj = new WordsWithoutList();

        String[] arr1 = {"a", "bb", "b", "ccc"};

        System.out.println(obj.wordsWithoutList(arr1, 1)); // [bb, ccc]
        System.out.println(obj.wordsWithoutList(arr1, 3)); // [a, bb, b]
        System.out.println(obj.wordsWithoutList(arr1, 4)); // [a, bb, b, ccc]
    }

}
