package item4;

public class MathUtil {
    // 정적 메서드와 정적 필드만을 담은 클래스는 Private 생성자를 만들어 인스턴스화를 막는다.
    private MathUtil() {

        // 내부에서 생성자 실행을 막기위해 에러를 던진다.
        throw new AssertionError();
    }

    public static int add(int a, int b) {
        MathUtil cc = new MathUtil(); // <- 에러 !
        return a + b;
    }
}
