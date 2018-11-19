package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.r */
public final class C19924r<E> extends C19922w<E> {
    public C19924r(int i) {
        super(i);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        Object[] objArr = this.c;
        long j = this.producerIndex;
        long a = m71058a(j);
        if (m71063b(objArr, a) != null) {
            return null;
        }
        m71064b(objArr, a, e);
        m71738c(j + 1);
        return true;
    }

    public E poll() {
        long j = this.consumerIndex;
        long a = m71058a(j);
        Object[] objArr = this.c;
        E b = m71063b(objArr, a);
        if (b == null) {
            return null;
        }
        m71064b(objArr, a, null);
        m71739d(j + 1);
        return b;
    }

    public E peek() {
        return m71062b(m71058a(this.consumerIndex));
    }

    public int size() {
        long b = m71737b();
        while (true) {
            long a = m71736a();
            long b2 = m71737b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    public boolean isEmpty() {
        return m71736a() == m71737b();
    }

    /* renamed from: c */
    private void m71738c(long j) {
        af.f60679a.putOrderedLong(this, f, j);
    }

    /* renamed from: d */
    private void m71739d(long j) {
        af.f60679a.putOrderedLong(this, e, j);
    }

    /* renamed from: a */
    private long m71736a() {
        return af.f60679a.getLongVolatile(this, f);
    }

    /* renamed from: b */
    private long m71737b() {
        return af.f60679a.getLongVolatile(this, e);
    }
}
