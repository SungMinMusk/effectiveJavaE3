package item26;

import java.util.ArrayList;
import java.util.List;

public class TypeTest2 {
    public static void rawTest() {
//        List raw = new ArrayList<String>();
//        raw.add("Hello");
    }

    public static void genericTest() {
        //List<Object> generic = new ArrayList<String>();
    }

    public static void wireCardTest() {
//        List<?> wildcard = new ArrayList<String>();
//        wildcard.add("Hello");
//        wildcard.size();
//        wildcard.clear();
    }
    public static void main(String[] args) {
        rawTest();
        genericTest();
        wireCardTest();
    }
}