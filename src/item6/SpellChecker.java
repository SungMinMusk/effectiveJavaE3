package item5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;


    public SpellChecker(Lexicon dictionary) {
        // null인 경우 NullPointerException 예외를 발생
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {return true;}
    public List<String> suggestions(String typo) {return new ArrayList<>();}
}