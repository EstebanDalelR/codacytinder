package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.z */
public class C19916z<E> extends ab<E> implements QueueProgressIndicators {
    /* renamed from: a */
    static final int f62363a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    /* renamed from: h */
    private static final long f62364h;
    /* renamed from: i */
    private static final long f62365i;
    /* renamed from: j */
    private static final long f62366j = ((long) af.f60679a.arrayBaseOffset(Object[].class));
    /* renamed from: k */
    private static final int f62367k;
    /* renamed from: l */
    private static final Object f62368l = new Object();

    static {
        InternalError internalError;
        int arrayIndexScale = af.f60679a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f62367k = 2;
        } else if (8 == arrayIndexScale) {
            f62367k = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        try {
            f62364h = af.f60679a.objectFieldOffset(ae.class.getDeclaredField("producerIndex"));
            try {
                f62365i = af.f60679a.objectFieldOffset(ab.class.getDeclaredField("consumerIndex"));
            } catch (Throwable e) {
                internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (Throwable e2) {
            internalError = new InternalError();
            internalError.initCause(e2);
            throw internalError;
        }
    }

    public C19916z(int i) {
        i = C19447i.m69985a(i);
        long j = (long) (i - 1);
        Object[] objArr = new Object[(i + 1)];
        this.g = objArr;
        this.f = j;
        m71721a(i);
        this.c = objArr;
        this.b = j;
        this.e = j - 1;
        m71722a(0);
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        Object[] objArr = this.g;
        long j = this.producerIndex;
        long j2 = this.f;
        long a = C19916z.m71718a(j, j2);
        if (j < this.e) {
            return m71726a(objArr, e, j, a);
        }
        long j3 = j + ((long) this.d);
        if (C19916z.m71719a(objArr, C19916z.m71718a(j3, j2)) == null) {
            this.e = j3 - 1;
            return m71726a(objArr, e, j, a);
        } else if (C19916z.m71719a(objArr, C19916z.m71718a(j + 1, j2)) != null) {
            return m71726a(objArr, e, j, a);
        } else {
            m71723a(objArr, j, a, e, j2);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m71726a(E[] eArr, E e, long j, long j2) {
        C19916z.m71724a((Object[]) eArr, j2, (Object) e);
        m71722a(j + 1);
        return 1;
    }

    /* renamed from: a */
    private void m71723a(E[] eArr, long j, long j2, E e, long j3) {
        Object[] objArr = new Object[eArr.length];
        this.g = objArr;
        this.e = (j + j3) - 1;
        C19916z.m71724a(objArr, j2, (Object) e);
        m71725a((Object[]) eArr, objArr);
        C19916z.m71724a((Object[]) eArr, j2, f62368l);
        m71722a(j + 1);
    }

    /* renamed from: a */
    private void m71725a(E[] eArr, E[] eArr2) {
        C19916z.m71724a((Object[]) eArr, C19916z.m71731c((long) (eArr.length - 1)), (Object) eArr2);
    }

    /* renamed from: a */
    private E[] m71727a(E[] eArr) {
        return (Object[]) C19916z.m71719a((Object[]) eArr, C19916z.m71731c((long) (eArr.length - 1)));
    }

    public final E poll() {
        Object[] objArr = this.c;
        long j = this.consumerIndex;
        long j2 = this.b;
        long a = C19916z.m71718a(j, j2);
        E a2 = C19916z.m71719a(objArr, a);
        Object obj = a2 == f62368l ? 1 : null;
        if (a2 != null && obj == null) {
            C19916z.m71724a(objArr, a, null);
            m71730b(j + 1);
            return a2;
        } else if (obj != null) {
            return m71720a(m71727a(objArr), j, j2);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private E m71720a(E[] eArr, long j, long j2) {
        this.c = eArr;
        j2 = C19916z.m71718a(j, j2);
        E a = C19916z.m71719a((Object[]) eArr, j2);
        if (a == null) {
            return null;
        }
        C19916z.m71724a((Object[]) eArr, j2, null);
        m71730b(j + 1);
        return a;
    }

    public final E peek() {
        Object[] objArr = this.c;
        long j = this.consumerIndex;
        long j2 = this.b;
        E a = C19916z.m71719a(objArr, C19916z.m71718a(j, j2));
        return a == f62368l ? m71729b(m71727a(objArr), j, j2) : a;
    }

    /* renamed from: b */
    private E m71729b(E[] eArr, long j, long j2) {
        this.c = eArr;
        return C19916z.m71719a((Object[]) eArr, C19916z.m71718a(j, j2));
    }

    public final int size() {
        long b = m71728b();
        while (true) {
            long a = m71717a();
            long b2 = m71728b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    /* renamed from: a */
    private void m71721a(int i) {
        this.d = Math.min(i / 4, f62363a);
    }

    /* renamed from: a */
    private long m71717a() {
        return af.f60679a.getLongVolatile(this, f62364h);
    }

    /* renamed from: b */
    private long m71728b() {
        return af.f60679a.getLongVolatile(this, f62365i);
    }

    /* renamed from: a */
    private void m71722a(long j) {
        af.f60679a.putOrderedLong(this, f62364h, j);
    }

    /* renamed from: b */
    private void m71730b(long j) {
        af.f60679a.putOrderedLong(this, f62365i, j);
    }

    /* renamed from: a */
    private static long m71718a(long j, long j2) {
        return C19916z.m71731c(j & j2);
    }

    /* renamed from: c */
    private static long m71731c(long j) {
        return f62366j + (j << f62367k);
    }

    /* renamed from: a */
    private static void m71724a(Object[] objArr, long j, Object obj) {
        af.f60679a.putOrderedObject(objArr, j, obj);
    }

    /* renamed from: a */
    private static <E> Object m71719a(E[] eArr, long j) {
        return af.f60679a.getObjectVolatile(eArr, j);
    }

    public long currentProducerIndex() {
        return m71717a();
    }

    public long currentConsumerIndex() {
        return m71728b();
    }
}
