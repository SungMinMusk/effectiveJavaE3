package item23;


public class Main {
    public static void main(String[] args) throws Exception {
        // 정적 멤버 클래스는 이렇게 외부에서 접근 가능하다.
        A.B.run();
        A a = new A();
        a.run();
        A.C c = a.new C();
        c.run();
    }
}