package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.f */
public abstract class C19779f<E> extends C19617g<E> {
    /* renamed from: a */
    protected static final int f61854a = Integer.getInteger("sparse.shift", 0).intValue();
    /* renamed from: d */
    private static final long f61855d = ((long) (af.f60679a.arrayBaseOffset(Object[].class) + (32 << (f61856e - f61854a))));
    /* renamed from: e */
    private static final int f61856e;
    /* renamed from: b */
    protected final long f61857b;
    /* renamed from: c */
    protected final E[] f61858c;

    static {
        int arrayIndexScale = af.f60679a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f61856e = f61854a + 2;
        } else if (8 == arrayIndexScale) {
            f61856e = f61854a + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public C19779f(int i) {
        i = C19447i.m69985a(i);
        this.f61857b = (long) (i - 1);
        this.f61858c = (Object[]) new Object[((i << f61854a) + 64)];
    }

    /* renamed from: a */
    protected final long m71058a(long j) {
        return m71059a(j, this.f61857b);
    }

    /* renamed from: a */
    protected final long m71059a(long j, long j2) {
        return f61855d + ((j & j2) << f61856e);
    }

    /* renamed from: a */
    protected final void m71061a(E[] eArr, long j, E e) {
        af.f60679a.putObject(eArr, j, e);
    }

    /* renamed from: b */
    protected final void m71064b(E[] eArr, long j, E e) {
        af.f60679a.putOrderedObject(eArr, j, e);
    }

    /* renamed from: a */
    protected final E m71060a(E[] eArr, long j) {
        return af.f60679a.getObject(eArr, j);
    }

    /* renamed from: b */
    protected final E m71062b(long j) {
        return m71063b(this.f61858c, j);
    }

    /* renamed from: b */
    protected final E m71063b(E[] eArr, long j) {
        return af.f60679a.getObjectVolatile(eArr, j);
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
}
