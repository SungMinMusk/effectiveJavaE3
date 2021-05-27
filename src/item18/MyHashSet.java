package item18;

import java.util.Collection;
import java.util.HashSet;

public class MyHashSet<E> extends HashSet<E> {
    private int addCount = 0; // 추가된 원소의 개수

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount = addCount + c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
