import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WordsCheckerTest {
    WordsChecker checker = new WordsChecker("Lorem ipsum dolor sit amet, " +
            " consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud" +
            " exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
            "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non" +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

    @ParameterizedTest
    @ValueSource(strings = {"ipsum", "anim"})
    public void testWithContainedWords(String word) {
        boolean res = checker.hasWord(word);
        Assertions.assertTrue(res);
    }

    @ParameterizedTest
    @ValueSource(strings = {"At", "on"})
    public void testWithNotContainedWords(String word) {
        boolean res = checker.hasWord(word);
        Assertions.assertFalse(res);
    }

    WordsChecker checker2 = new WordsChecker("Белая берёза\n" +
            "Под моим окном\n" +
            "Принакрылась снегом,\n" +
            "Точно серебром.\n" +
            "\n" +
            "На пушистых ветках\n" +
            "Снежною каймой\n" +
            "Распустились кисти\n" +
            "Белой бахромой.\n" +
            "\n" +
            "И стоит берёза\n" +
            "В сонной тишине,\n" +
            "И горят снежинки\n" +
            "В золотом огне.\n" +
            "\n" +
            "А заря, лениво\n" +
            "Обходя кругом,\n" +
            "Обсыпает ветки\n" +
            "Новым серебром.");

    @ParameterizedTest
    @ValueSource(strings = {"серебром", "горят", "заря"})
    public void testWithContainedRussianWords(String word) {

        boolean result = checker2.hasWord(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Если", "страшно", "условие"})
    public void testWithNotContainedRussianWords(String word) {
        boolean res = checker.hasWord(word);
        Assertions.assertFalse(res);
    }
}
