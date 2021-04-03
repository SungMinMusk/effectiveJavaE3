package item5;

import java.util.regex.Pattern;

public class Korean2 {

    private static final Pattern KOREAN_WORD = Pattern.compile("[가-힣]{2,4}");

    static boolean isKoreanWord(String s) {
        return KOREAN_WORD.matcher(s).matches();
    }
}
