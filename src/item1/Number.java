package item1;

public abstract class Number {

    // 장점1
    public static Number fromStr(String s) {

        // 장점3, 4
        if (s.length() < 5) {
            return new ShortNumber(s);
        } else {
            return new JumboNumber(s);
        }

        // 클라이언트는 ~~item1.Number 클래스의 존재를 모른다.
        // 따라서 새로운 클래스의 추가, 기존 클래스의 삭제가 쉽다.

    }

    public abstract String toString();
}
