public class Main {

    public static void main(String[] args) {
        WordsChecker checker = new WordsChecker("Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud" +
                " exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum" +
                " dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non" +
                " proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        System.out.println("Has word \"ipsum\": " + checker.hasWord("ipsum"));
        System.out.println("Has word \"anim\": " + checker.hasWord("anim"));
        System.out.println("Has word \"At\": " + checker.hasWord("At"));
        System.out.println("Has word \"on\": " + checker.hasWord("on"));
    }
}
