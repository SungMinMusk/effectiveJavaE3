package item23;

public class A {
    int a = 10;

    public void run() {
        System.out.println("Run A");
        B.run();
        C c = new C();
        c.run();
    }

    // 정적 멤버 클래스
    public static class B {
        public static void run() {
            System.out.println("Run B");
        }
    }

    // 비정적 멤버 클래스
    public class C {
        public void run() {
            // 정규화된 this를 통해 참조 가능하다.
            System.out.println("Run C: " + A.this.a);
        }
    }
}
