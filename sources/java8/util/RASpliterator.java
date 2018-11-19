package java8.util;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class RASpliterator<E> implements Spliterator<E> {
    /* renamed from: f */
    private static final Unsafe f54293f = UnsafeAccess.f48790a;
    /* renamed from: g */
    private static final long f54294g;
    /* renamed from: a */
    private final List<E> f54295a;
    /* renamed from: b */
    private int f54296b;
    /* renamed from: c */
    private int f54297c;
    /* renamed from: d */
    private final AbstractList<E> f54298d;
    /* renamed from: e */
    private int f54299e;

    public int characteristics() {
        return 16464;
    }

    private RASpliterator(List<E> list, int i, int i2, int i3) {
        this.f54295a = list;
        this.f54296b = i;
        this.f54297c = i2;
        this.f54298d = (list instanceof AbstractList) != 0 ? (AbstractList) list : null;
        this.f54299e = i3;
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63872a(List<T> list) {
        return new RASpliterator(list, 0, -1, 0);
    }

    /* renamed from: a */
    private int m63871a() {
        List list = this.f54295a;
        int i = this.f54297c;
        if (i >= 0) {
            return i;
        }
        if (this.f54298d != null) {
            this.f54299e = m63874b(this.f54298d);
        }
        i = list.size();
        this.f54297c = i;
        return i;
    }

    public Spliterator<E> trySplit() {
        int a = m63871a();
        int i = this.f54296b;
        a = (a + i) >>> 1;
        if (i >= a) {
            return null;
        }
        List list = this.f54295a;
        this.f54296b = a;
        return new RASpliterator(list, i, a, this.f54299e);
    }

    public boolean tryAdvance(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        int a = m63871a();
        int i = this.f54296b;
        if (i >= a) {
            return null;
        }
        this.f54296b = i + 1;
        consumer.accept(this.f54295a.get(i));
        m63873a(this.f54298d, this.f54299e);
        return true;
    }

    public void forEachRemaining(java8.util.function.Consumer<? super E> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        java8.util.Objects.m59115b(r5);
        r0 = r4.f54295a;
        r1 = r4.m63871a();
        r2 = r4.f54296b;
        r4.f54296b = r1;
    L_0x000d:
        if (r2 >= r1) goto L_0x001f;
    L_0x000f:
        r3 = r0.get(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0019 }
        r5.accept(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0019 }
        r2 = r2 + 1;
        goto L_0x000d;
    L_0x0019:
        r5 = new java.util.ConcurrentModificationException;
        r5.<init>();
        throw r5;
    L_0x001f:
        r5 = r4.f54298d;
        r0 = r4.f54299e;
        m63873a(r5, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.RASpliterator.forEachRemaining(java8.util.function.Consumer):void");
    }

    public long estimateSize() {
        return (long) (m63871a() - this.f54296b);
    }

    public long getExactSizeIfKnown() {
        return Spliterators.m59152a((Spliterator) this);
    }

    public boolean hasCharacteristics(int i) {
        return Spliterators.m59173a((Spliterator) this, i);
    }

    public Comparator<? super E> getComparator() {
        return Spliterators.m59174b((Spliterator) this);
    }

    /* renamed from: a */
    private static void m63873a(AbstractList<?> abstractList, int i) {
        if (abstractList != null && m63874b(abstractList) != i) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    private static <T> int m63874b(List<T> list) {
        return f54293f.getInt(list, f54294g);
    }

    static {
        try {
            f54294g = f54293f.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
