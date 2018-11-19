package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.k */
abstract class C19917k<E> extends C19913m<E> {
    /* renamed from: d */
    protected static final long f62369d = af.m69983a(C19917k.class, "consumerIndex");
    private volatile long consumerIndex;

    public C19917k(int i) {
        super(i);
    }

    /* renamed from: a */
    protected final long m71732a() {
        return this.consumerIndex;
    }

    /* renamed from: b */
    protected final boolean m71733b(long j, long j2) {
        return af.f60679a.compareAndSwapLong(this, f62369d, j, j2);
    }
}
