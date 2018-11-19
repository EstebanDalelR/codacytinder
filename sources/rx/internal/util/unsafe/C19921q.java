package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.q */
abstract class C19921q<E> extends C19919o<E> {
    /* renamed from: f */
    private volatile long f62371f;

    public C19921q(int i) {
        super(i);
    }

    /* renamed from: c */
    protected final long m71734c() {
        return this.f62371f;
    }

    /* renamed from: d */
    protected final void m71735d(long j) {
        this.f62371f = j;
    }
}
