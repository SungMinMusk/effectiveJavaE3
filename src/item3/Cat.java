package item3;

public class Cat {
    public static final Cat INSTANCE = new Cat();

    private Cat() {}

//    private Cat() {
//        // setAccessible이라는 예외 방지
//        if(this.INSTANCE != null) {
//            throw new RuntimeException("이미 생성된 싱글톤 객체가 존재합니다.");
//        }
//    }

    public String getName() {
        return "Bada";
    }
}