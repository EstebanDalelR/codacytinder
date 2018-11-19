package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.C19447i;

/* renamed from: rx.internal.util.atomic.e */
public final class C19441e<T> implements Queue<T> {
    /* renamed from: a */
    static final int f60652a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    /* renamed from: j */
    private static final Object f60653j = new Object();
    /* renamed from: b */
    final AtomicLong f60654b = new AtomicLong();
    /* renamed from: c */
    int f60655c;
    /* renamed from: d */
    long f60656d;
    /* renamed from: e */
    int f60657e;
    /* renamed from: f */
    AtomicReferenceArray<Object> f60658f;
    /* renamed from: g */
    int f60659g;
    /* renamed from: h */
    AtomicReferenceArray<Object> f60660h;
    /* renamed from: i */
    final AtomicLong f60661i = new AtomicLong();

    /* renamed from: b */
    private static int m69947b(int i) {
        return i;
    }

    public C19441e(int i) {
        i = C19447i.m69985a(i);
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.f60658f = atomicReferenceArray;
        this.f60657e = i2;
        m69941a(i);
        this.f60660h = atomicReferenceArray;
        this.f60659g = i2;
        this.f60656d = (long) (i2 - 1);
    }

    public boolean offer(T t) {
        AtomicReferenceArray atomicReferenceArray = this.f60658f;
        long c = m69951c();
        int i = this.f60657e;
        int a = C19441e.m69936a(c, i);
        if (c < this.f60656d) {
            return m69946a(atomicReferenceArray, t, c, a);
        }
        long j = c + ((long) this.f60655c);
        if (C19441e.m69938a(atomicReferenceArray, C19441e.m69936a(j, i)) == null) {
            this.f60656d = j - 1;
            return m69946a(atomicReferenceArray, t, c, a);
        } else if (C19441e.m69938a(atomicReferenceArray, C19441e.m69936a(c + 1, i)) == null) {
            return m69946a(atomicReferenceArray, t, c, a);
        } else {
            m69944a(atomicReferenceArray, c, a, t, (long) i);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m69946a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        C19441e.m69943a((AtomicReferenceArray) atomicReferenceArray, i, (Object) t);
        m69942a(j + 1);
        return true;
    }

    /* renamed from: a */
    private void m69944a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f60658f = atomicReferenceArray2;
        this.f60656d = (j + j2) - 1;
        C19441e.m69943a(atomicReferenceArray2, i, (Object) t);
        m69945a((AtomicReferenceArray) atomicReferenceArray, atomicReferenceArray2);
        C19441e.m69943a((AtomicReferenceArray) atomicReferenceArray, i, f60653j);
        m69942a(j + 1);
    }

    /* renamed from: a */
    private void m69945a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        C19441e.m69943a((AtomicReferenceArray) atomicReferenceArray, C19441e.m69947b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m69940a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) C19441e.m69938a((AtomicReferenceArray) atomicReferenceArray, C19441e.m69947b(atomicReferenceArray.length() - 1));
    }

    public T poll() {
        AtomicReferenceArray atomicReferenceArray = this.f60660h;
        long d = m69952d();
        int i = this.f60659g;
        int a = C19441e.m69936a(d, i);
        T a2 = C19441e.m69938a(atomicReferenceArray, a);
        Object obj = a2 == f60653j ? 1 : null;
        if (a2 != null && obj == null) {
            C19441e.m69943a(atomicReferenceArray, a, null);
            m69950b(d + 1);
            return a2;
        } else if (obj != null) {
            return m69939a(m69940a(atomicReferenceArray), d, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private T m69939a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f60660h = atomicReferenceArray;
        i = C19441e.m69936a(j, i);
        T a = C19441e.m69938a((AtomicReferenceArray) atomicReferenceArray, i);
        if (a == null) {
            return null;
        }
        C19441e.m69943a((AtomicReferenceArray) atomicReferenceArray, i, null);
        m69950b(j + 1);
        return a;
    }

    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f60660h;
        long d = m69952d();
        int i = this.f60659g;
        T a = C19441e.m69938a(atomicReferenceArray, C19441e.m69936a(d, i));
        return a == f60653j ? m69949b(m69940a(atomicReferenceArray), d, i) : a;
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
    private T m69949b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f60660h = atomicReferenceArray;
        return C19441e.m69938a((AtomicReferenceArray) atomicReferenceArray, C19441e.m69936a(j, i));
    }

    public int size() {
        long b = m69948b();
        while (true) {
            long a = m69937a();
            long b2 = m69948b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    public boolean isEmpty() {
        return m69937a() == m69948b();
    }

    /* renamed from: a */
    private void m69941a(int i) {
        this.f60655c = Math.min(i / 4, f60652a);
    }

    /* renamed from: a */
    private long m69937a() {
        return this.f60654b.get();
    }

    /* renamed from: b */
    private long m69948b() {
        return this.f60661i.get();
    }

    /* renamed from: c */
    private long m69951c() {
        return this.f60654b.get();
    }

    /* renamed from: d */
    private long m69952d() {
        return this.f60661i.get();
    }

    /* renamed from: a */
    private void m69942a(long j) {
        this.f60654b.lazySet(j);
    }

    /* renamed from: b */
    private void m69950b(long j) {
        this.f60661i.lazySet(j);
    }

    /* renamed from: a */
    private static int m69936a(long j, int i) {
        return C19441e.m69947b(((int) j) & i);
    }

    /* renamed from: a */
    private static void m69943a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m69938a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
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

    /* renamed from: a */
    public boolean m69953a(T t, T t2) {
        AtomicReferenceArray atomicReferenceArray = this.f60658f;
        long a = m69937a();
        int i = this.f60657e;
        long j = a + 2;
        int a2;
        if (C19441e.m69938a(atomicReferenceArray, C19441e.m69936a(j, i)) == null) {
            a2 = C19441e.m69936a(a, i);
            C19441e.m69943a(atomicReferenceArray, a2 + 1, (Object) t2);
            C19441e.m69943a(atomicReferenceArray, a2, (Object) t);
            m69942a(j);
        } else {
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f60658f = atomicReferenceArray2;
            a2 = C19441e.m69936a(a, i);
            C19441e.m69943a(atomicReferenceArray2, a2 + 1, (Object) t2);
            C19441e.m69943a(atomicReferenceArray2, a2, (Object) t);
            m69945a(atomicReferenceArray, atomicReferenceArray2);
            C19441e.m69943a(atomicReferenceArray, a2, f60653j);
            m69942a(j);
        }
        return true;
    }
}
