package item18;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        MyHashSet<String> mySet = new MyHashSet<>();
        mySet.addAll(List.of("1","2","3"));

        System.out.println(mySet.getAddCount());


        InstrumentedSet<String> mySet2 = new InstrumentedSet<>(new HashSet<>());
        mySet2.addAll(List.of("1","2","3"));

        System.out.println(mySet2.getAddCount());

//        InstrumentedGuavaSet<String> mySet3 = new InstrumentedGuavaSet<>(new HashSet<>());
//        mySet3.addAll(List.of("1","2","3"));
//
//        System.out.println(mySet3.getAddCount());
    }
}
