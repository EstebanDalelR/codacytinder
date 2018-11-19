package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: rx.internal.util.atomic.d */
public final class C19611d<E> extends C19439a<E> {
    /* renamed from: g */
    private static final Integer f61287g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    /* renamed from: c */
    final AtomicLong f61288c = new AtomicLong();
    /* renamed from: d */
    long f61289d;
    /* renamed from: e */
    final AtomicLong f61290e = new AtomicLong();
    /* renamed from: f */
    final int f61291f;

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public C19611d(int i) {
        super(i);
        this.f61291f = Math.min(i / 4, f61287g.intValue());
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.a;
        int i = this.b;
        long j = this.f61288c.get();
        int a = m69925a(j, i);
        if (j >= this.f61289d) {
            long j2 = j + ((long) this.f61291f);
            if (m69927a(atomicReferenceArray, m69925a(j2, i)) == null) {
                this.f61289d = j2;
            } else if (m69927a(atomicReferenceArray, a) != null) {
                return null;
            }
        }
        m69928a(atomicReferenceArray, a, e);
        m70631b(j + 1);
        return true;
    }

    public E poll() {
        long j = this.f61290e.get();
        int a = m69924a(j);
        AtomicReferenceArray atomicReferenceArray = this.a;
        E a2 = m69927a(atomicReferenceArray, a);
        if (a2 == null) {
            return null;
        }
        m69928a(atomicReferenceArray, a, null);
        m70632c(j + 1);
        return a2;
    }

    public E peek() {
        return m69926a(m69924a(this.f61290e.get()));
    }

    public int size() {
        long a = m70629a();
        while (true) {
            long b = m70630b();
            long a2 = m70629a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    public boolean isEmpty() {
        return m70630b() == m70629a();
    }

    /* renamed from: b */
    private void m70631b(long j) {
        this.f61288c.lazySet(j);
    }

    /* renamed from: c */
    private void m70632c(long j) {
        this.f61290e.lazySet(j);
    }

    /* renamed from: a */
    private long m70629a() {
        return this.f61290e.get();
    }

    /* renamed from: b */
    private long m70630b() {
        return this.f61288c.get();
    }
}
