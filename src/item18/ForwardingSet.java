package item18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> implements Set<E> {
    private final Set<E> set; // private 필드로 기존 클래스의 인스턴스 참조

    public ForwardingSet(Set<E> set) { this.set = set; }

    // 기존 클래스의 대응하는 메서드를 호출해 그결과를 반환 (해당 방식을 전달 : forwarding이라 하며 forwarding이라 메소드라 한다.)
    @Override public void clear() { set.clear(); }
    @Override public boolean isEmpty() { return set.isEmpty(); }
    @Override public boolean add(E e) { return set.add(e); }
    @Override public boolean addAll(Collection<? extends E> c) { return set.addAll(c); }
    @Override public int size() { return set.size(); }
    @Override public boolean contains(Object o) { return set.contains(o); }
    @Override public Iterator<E> iterator() { return set.iterator(); }
    @Override public Object[] toArray() { return set.toArray(); }
    @Override public <T> T[] toArray(T[] a) { return set.toArray(a); }
    @Override public boolean remove(Object o) { return set.remove(o); }
    @Override public boolean containsAll(Collection<?> c) { return set.containsAll(c); }
    @Override public boolean retainAll(Collection<?> c) { return set.retainAll(c); }
    @Override public boolean removeAll(Collection<?> c) { return set.removeAll(c); }
}