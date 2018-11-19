package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.C19447i;

public final class SpscExactAtomicArrayQueue<T> extends AtomicReferenceArray<T> implements Queue<T> {
    private static final long serialVersionUID = 6210984603741293445L;
    /* renamed from: a */
    final int f60644a;
    /* renamed from: b */
    final int f60645b;
    /* renamed from: c */
    final AtomicLong f60646c = new AtomicLong();
    /* renamed from: d */
    final AtomicLong f60647d = new AtomicLong();

    public SpscExactAtomicArrayQueue(int i) {
        super(C19447i.m69985a(i));
        int length = length();
        this.f60644a = length - 1;
        this.f60645b = length - i;
    }

    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        long j = this.f60646c.get();
        int i = this.f60644a;
        if (get(((int) (j + ((long) this.f60645b))) & i) != null) {
            return null;
        }
        i &= (int) j;
        this.f60646c.lazySet(j + 1);
        lazySet(i, t);
        return true;
    }

    public T poll() {
        long j = this.f60647d.get();
        int i = ((int) j) & this.f60644a;
        T t = get(i);
        if (t == null) {
            return null;
        }
        this.f60647d.lazySet(j + 1);
        lazySet(i, null);
        return t;
    }

    public T peek() {
        return get(((int) this.f60647d.get()) & this.f60644a);
    }

    public void clear() {
        while (true) {
            if (poll() == null) {
                if (isEmpty()) {
                    return;
                }
            }
        }
    }

    public boolean isEmpty() {
        return this.f60646c == this.f60647d;
    }

    public int size() {
        long j = this.f60647d.get();
        while (true) {
            long j2 = this.f60646c.get();
            long j3 = this.f60647d.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    public T remove() {
        throw new UnsupportedOperationException();
    }

    public T element() {
        throw new UnsupportedOperationException();
    }
}
