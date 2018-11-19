package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.C15741h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.reactivex.internal.queue.a */
public final class C18423a<T> implements SimplePlainQueue<T> {
    /* renamed from: a */
    static final int f57352a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    /* renamed from: j */
    private static final Object f57353j = new Object();
    /* renamed from: b */
    final AtomicLong f57354b = new AtomicLong();
    /* renamed from: c */
    int f57355c;
    /* renamed from: d */
    long f57356d;
    /* renamed from: e */
    final int f57357e;
    /* renamed from: f */
    AtomicReferenceArray<Object> f57358f;
    /* renamed from: g */
    final int f57359g;
    /* renamed from: h */
    AtomicReferenceArray<Object> f57360h;
    /* renamed from: i */
    final AtomicLong f57361i = new AtomicLong();

    /* renamed from: b */
    private static int m66570b(int i) {
        return i;
    }

    public C18423a(int i) {
        i = C15741h.m58994a(Math.max(8, i));
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.f57358f = atomicReferenceArray;
        this.f57357e = i2;
        m66564a(i);
        this.f57360h = atomicReferenceArray;
        this.f57359g = i2;
        this.f57356d = (long) (i2 - 1);
        m66565a(0);
    }

    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f57358f;
        long e = m66576e();
        int i = this.f57357e;
        int a = C18423a.m66561a(e, i);
        if (e < this.f57356d) {
            return m66569a(atomicReferenceArray, t, e, a);
        }
        long j = e + ((long) this.f57355c);
        if (C18423a.m66571b(atomicReferenceArray, C18423a.m66561a(j, i)) == null) {
            this.f57356d = j - 1;
            return m66569a(atomicReferenceArray, t, e, a);
        } else if (C18423a.m66571b(atomicReferenceArray, C18423a.m66561a(e + 1, i)) == null) {
            return m66569a(atomicReferenceArray, t, e, a);
        } else {
            m66567a(atomicReferenceArray, e, a, t, (long) i);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m66569a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        C18423a.m66566a((AtomicReferenceArray) atomicReferenceArray, i, (Object) t);
        m66565a(j + 1);
        return true;
    }

    /* renamed from: a */
    private void m66567a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f57358f = atomicReferenceArray2;
        this.f57356d = (j + j2) - 1;
        C18423a.m66566a(atomicReferenceArray2, i, (Object) t);
        m66568a((AtomicReferenceArray) atomicReferenceArray, atomicReferenceArray2);
        C18423a.m66566a((AtomicReferenceArray) atomicReferenceArray, i, f57353j);
        m66565a(j + 1);
    }

    /* renamed from: a */
    private void m66568a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        C18423a.m66566a((AtomicReferenceArray) atomicReferenceArray, C18423a.m66570b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m66563a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        i = C18423a.m66570b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) C18423a.m66571b(atomicReferenceArray, i);
        C18423a.m66566a((AtomicReferenceArray) atomicReferenceArray, i, null);
        return atomicReferenceArray2;
    }

    @Nullable
    public T poll() {
        AtomicReferenceArray atomicReferenceArray = this.f57360h;
        long f = m66577f();
        int i = this.f57359g;
        int a = C18423a.m66561a(f, i);
        T b = C18423a.m66571b(atomicReferenceArray, a);
        Object obj = b == f57353j ? 1 : null;
        if (b != null && obj == null) {
            C18423a.m66566a(atomicReferenceArray, a, null);
            m66573b(f + 1);
            return b;
        } else if (obj != null) {
            return m66562a(m66563a(atomicReferenceArray, i + 1), f, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private T m66562a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f57360h = atomicReferenceArray;
        i = C18423a.m66561a(j, i);
        T b = C18423a.m66571b(atomicReferenceArray, i);
        if (b != null) {
            C18423a.m66566a((AtomicReferenceArray) atomicReferenceArray, i, null);
            m66573b(j + 1);
        }
        return b;
    }

    /* renamed from: a */
    public T m66578a() {
        AtomicReferenceArray atomicReferenceArray = this.f57360h;
        long f = m66577f();
        int i = this.f57359g;
        T b = C18423a.m66571b(atomicReferenceArray, C18423a.m66561a(f, i));
        return b == f57353j ? m66572b(m66563a(atomicReferenceArray, i + 1), f, i) : b;
    }

    /* renamed from: b */
    private T m66572b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f57360h = atomicReferenceArray;
        return C18423a.m66571b(atomicReferenceArray, C18423a.m66561a(j, i));
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
    public int m66579b() {
        long d = m66575d();
        while (true) {
            long c = m66574c();
            long d2 = m66575d();
            if (d == d2) {
                return (int) (c - d2);
            }
            d = d2;
        }
    }

    public boolean isEmpty() {
        return m66574c() == m66575d();
    }

    /* renamed from: a */
    private void m66564a(int i) {
        this.f57355c = Math.min(i / 4, f57352a);
    }

    /* renamed from: c */
    private long m66574c() {
        return this.f57354b.get();
    }

    /* renamed from: d */
    private long m66575d() {
        return this.f57361i.get();
    }

    /* renamed from: e */
    private long m66576e() {
        return this.f57354b.get();
    }

    /* renamed from: f */
    private long m66577f() {
        return this.f57361i.get();
    }

    /* renamed from: a */
    private void m66565a(long j) {
        this.f57354b.lazySet(j);
    }

    /* renamed from: b */
    private void m66573b(long j) {
        this.f57361i.lazySet(j);
    }

    /* renamed from: a */
    private static int m66561a(long j, int i) {
        return C18423a.m66570b(((int) j) & i);
    }

    /* renamed from: a */
    private static void m66566a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: b */
    private static <E> Object m66571b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean offer(T t, T t2) {
        AtomicReferenceArray atomicReferenceArray = this.f57358f;
        long c = m66574c();
        int i = this.f57357e;
        long j = c + 2;
        int a;
        if (C18423a.m66571b(atomicReferenceArray, C18423a.m66561a(j, i)) == null) {
            a = C18423a.m66561a(c, i);
            C18423a.m66566a(atomicReferenceArray, a + 1, (Object) t2);
            C18423a.m66566a(atomicReferenceArray, a, (Object) t);
            m66565a(j);
        } else {
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f57358f = atomicReferenceArray2;
            a = C18423a.m66561a(c, i);
            C18423a.m66566a(atomicReferenceArray2, a + 1, (Object) t2);
            C18423a.m66566a(atomicReferenceArray2, a, (Object) t);
            m66568a(atomicReferenceArray, atomicReferenceArray2);
            C18423a.m66566a(atomicReferenceArray, a, f57353j);
            m66565a(j);
        }
        return true;
    }
}
