import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    HashSet<String> words = new HashSet<>();

    public WordsChecker(String text) {
        words.clear();
        words.addAll(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}
