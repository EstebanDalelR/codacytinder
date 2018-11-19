package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.C19447i;

/* renamed from: rx.internal.util.atomic.a */
abstract class C19439a<E> extends AbstractQueue<E> {
    /* renamed from: a */
    protected final AtomicReferenceArray<E> f60648a;
    /* renamed from: b */
    protected final int f60649b;

    /* renamed from: a */
    protected final int m69925a(long j, int i) {
        return ((int) j) & i;
    }

    public C19439a(int i) {
        i = C19447i.m69985a(i);
        this.f60649b = i - 1;
        this.f60648a = new AtomicReferenceArray(i);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
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

    /* renamed from: a */
    protected final int m69924a(long j) {
        return ((int) j) & this.f60649b;
    }

    /* renamed from: a */
    protected final E m69927a(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    protected final void m69928a(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    /* renamed from: a */
    protected final E m69926a(int i) {
        return m69927a(this.f60648a, i);
    }
}
