package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.p */
abstract class C19909p<E> extends C19857l<E> {
    /* renamed from: e */
    protected static final long f62339e = af.m69983a(C19909p.class, "producerIndex");
    private volatile long producerIndex;

    /* renamed from: b */
    protected final long m71646b() {
        return this.producerIndex;
    }

    /* renamed from: c */
    protected final void m71647c(long j) {
        af.f60679a.putOrderedLong(this, f62339e, j);
    }

    public C19909p(int i) {
        super(i);
    }
}
