package item26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0);
    }

    // 로 타입
    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // 제네릭
    private static void unsafeAddGeneric(List<Object> list, Object o) {
        list.add(o);
    }
}
