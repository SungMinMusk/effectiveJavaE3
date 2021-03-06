package item3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) throws Exception {

        // public static final 필드 방식
        Cat cat = Cat.INSTANCE;
        System.out.println(cat.getName());

        // 위 방식은 setAccessible이라는 예외가 존재.
//        Constructor constructor = cat.getClass().getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Cat CatTmp = (Cat) constructor.newInstance();
//        System.out.println(CatTmp.getName());


        // 정적 팩터리 메서드 방식
        Cat2 cat2 = Cat2.getInstance();
        System.out.println(cat2.getName());

//        Supplier<Cat2> cat2Supplier = () -> Cat2.getInstance();
//        System.out.println(cat2Supplier.get().getName());
//
//        Supplier<Cat2> cat2Supplier2 = Cat2::getInstance;
//        System.out.println(cat2Supplier.get().getName());

        // 원소가 하나뿐인 열거타입 방식
        Cat3 cat3 = Cat3.INSATANCE;
        System.out.println(cat3.getName());

    }
}
