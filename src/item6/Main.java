package item6;

public class Main {
    public static void main(String[] args) throws Exception {
        SpellChecker spellChecker = new SpellChecker(new Lexicon());

        System.out.println(Korean.isKoreanWord("한글"));

        System.out.println(Korean2.isKoreanWord("한글한글a"));

        System.out.println(Boolean.valueOf("true"));
    }

}
