package item5;

public class Korean {

    public static boolean isKoreanWord(String s) {
        // 한글 2~4글자 단어 정규식
        return s.matches("[가-힣]{2,4}");
    }
}
