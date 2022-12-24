import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
String text;

    public WordsChecker(String text) {
        this.text = text;
    }
    public boolean hasWord(String word){
        HashSet<String> words = new HashSet<>();
        words.addAll(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        return words.contains(word);
    }
}
