package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.C19447i;

/* renamed from: rx.internal.util.atomic.g */
public final class C19442g<T> implements Queue<T> {
    /* renamed from: a */
    static final int f60662a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    /* renamed from: j */
    private static final Object f60663j = new Object();
    /* renamed from: b */
    final AtomicLong f60664b = new AtomicLong();
    /* renamed from: c */
    int f60665c;
    /* renamed from: d */
    long f60666d;
    /* renamed from: e */
    int f60667e;
    /* renamed from: f */
    AtomicReferenceArray<Object> f60668f;
    /* renamed from: g */
    int f60669g;
    /* renamed from: h */
    AtomicReferenceArray<Object> f60670h;
    /* renamed from: i */
    final AtomicLong f60671i = new AtomicLong();

    /* renamed from: b */
    private static int m69965b(int i) {
        return i;
    }

    public C19442g(int i) {
        i = C19447i.m69985a(Math.max(8, i));
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.f60668f = atomicReferenceArray;
        this.f60667e = i2;
        m69959a(i);
        this.f60670h = atomicReferenceArray;
        this.f60669g = i2;
        this.f60666d = (long) (i2 - 1);
        m69960a(0);
    }

    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        AtomicReferenceArray atomicReferenceArray = this.f60668f;
        long c = m69969c();
        int i = this.f60667e;
        int a = C19442g.m69954a(c, i);
        if (c < this.f60666d) {
            return m69964a(atomicReferenceArray, t, c, a);
        }
        long j = c + ((long) this.f60665c);
        if (C19442g.m69956a(atomicReferenceArray, C19442g.m69954a(j, i)) == null) {
            this.f60666d = j - 1;
            return m69964a(atomicReferenceArray, t, c, a);
        } else if (C19442g.m69956a(atomicReferenceArray, C19442g.m69954a(c + 1, i)) != null) {
            return m69964a(atomicReferenceArray, t, c, a);
        } else {
            m69962a(atomicReferenceArray, c, a, t, (long) i);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m69964a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m69960a(j + 1);
        C19442g.m69961a((AtomicReferenceArray) atomicReferenceArray, i, (Object) t);
        return true;
    }

    /* renamed from: a */
    private void m69962a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f60668f = atomicReferenceArray2;
        this.f60666d = (j + j2) - 1;
        m69960a(j + 1);
        C19442g.m69961a(atomicReferenceArray2, i, (Object) t);
        m69963a((AtomicReferenceArray) atomicReferenceArray, atomicReferenceArray2);
        C19442g.m69961a((AtomicReferenceArray) atomicReferenceArray, i, f60663j);
    }

    /* renamed from: a */
    private void m69963a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        C19442g.m69961a((AtomicReferenceArray) atomicReferenceArray, C19442g.m69965b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m69958a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) C19442g.m69956a((AtomicReferenceArray) atomicReferenceArray, C19442g.m69965b(atomicReferenceArray.length() - 1));
    }

    public T poll() {
        AtomicReferenceArray atomicReferenceArray = this.f60670h;
        long d = m69970d();
        int i = this.f60669g;
        int a = C19442g.m69954a(d, i);
        T a2 = C19442g.m69956a(atomicReferenceArray, a);
        Object obj = a2 == f60663j ? 1 : null;
        if (a2 != null && obj == null) {
            m69968b(d + 1);
            C19442g.m69961a(atomicReferenceArray, a, null);
            return a2;
        } else if (obj != null) {
            return m69957a(m69958a(atomicReferenceArray), d, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private T m69957a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f60670h = atomicReferenceArray;
        i = C19442g.m69954a(j, i);
        T a = C19442g.m69956a((AtomicReferenceArray) atomicReferenceArray, i);
        if (a == null) {
            return null;
        }
        m69968b(j + 1);
        C19442g.m69961a((AtomicReferenceArray) atomicReferenceArray, i, null);
        return a;
    }

    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f60670h;
        long d = m69970d();
        int i = this.f60669g;
        T a = C19442g.m69956a(atomicReferenceArray, C19442g.m69954a(d, i));
        return a == f60663j ? m69967b(m69958a(atomicReferenceArray), d, i) : a;
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

    /* renamed from: b */
    private T m69967b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f60670h = atomicReferenceArray;
        return C19442g.m69956a((AtomicReferenceArray) atomicReferenceArray, C19442g.m69954a(j, i));
    }

    public int size() {
        long b = m69966b();
        while (true) {
            long a = m69955a();
            long b2 = m69966b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    public boolean isEmpty() {
        return m69955a() == m69966b();
    }

    /* renamed from: a */
    private void m69959a(int i) {
        this.f60665c = Math.min(i / 4, f60662a);
    }

    /* renamed from: a */
    private long m69955a() {
        return this.f60664b.get();
    }

    /* renamed from: b */
    private long m69966b() {
        return this.f60671i.get();
    }

    /* renamed from: c */
    private long m69969c() {
        return this.f60664b.get();
    }

    /* renamed from: d */
    private long m69970d() {
        return this.f60671i.get();
    }

    /* renamed from: a */
    private void m69960a(long j) {
        this.f60664b.lazySet(j);
    }

    /* renamed from: b */
    private void m69968b(long j) {
        this.f60671i.lazySet(j);
    }

    /* renamed from: a */
    private static int m69954a(long j, int i) {
        return C19442g.m69965b(((int) j) & i);
    }

    /* renamed from: a */
    private static void m69961a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m69956a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
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
