package item18;

import java.util.Collection;
import java.util.Set;
import com.google.common.collect.ForwardingSet;

public class InstrumentedGuavaSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    private final Set<E> set;

    public InstrumentedGuavaSet(Set<E> set) { this.set = set; }

    @Override
    public Set<E> delegate() {
        return this.set;
    };

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        addCount = addCount + collection.size();
        return super.addAll(collection);
    }

    public int getAddCount() {
        return addCount;
    }
}