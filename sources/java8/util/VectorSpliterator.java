package java8.util;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Vector;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class VectorSpliterator<E> implements Spliterator<E> {
    /* renamed from: f */
    private static final Unsafe f54325f = UnsafeAccess.f48790a;
    /* renamed from: g */
    private static final long f54326g;
    /* renamed from: h */
    private static final long f54327h;
    /* renamed from: i */
    private static final long f54328i;
    /* renamed from: a */
    private final Vector<E> f54329a;
    /* renamed from: b */
    private Object[] f54330b;
    /* renamed from: c */
    private int f54331c;
    /* renamed from: d */
    private int f54332d;
    /* renamed from: e */
    private int f54333e;

    public int characteristics() {
        return 16464;
    }

    private VectorSpliterator(Vector<E> vector, Object[] objArr, int i, int i2, int i3) {
        this.f54329a = vector;
        this.f54330b = objArr;
        this.f54331c = i;
        this.f54332d = i2;
        this.f54333e = i3;
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63882a(Vector<T> vector) {
        return new VectorSpliterator(vector, null, 0, -1, 0);
    }

    /* renamed from: a */
    private int m63881a() {
        int i = this.f54332d;
        if (i < 0) {
            synchronized (this.f54329a) {
                this.f54330b = m63885d(this.f54329a);
                this.f54333e = m63884c(this.f54329a);
                i = m63883b(this.f54329a);
                this.f54332d = i;
            }
        }
        return i;
    }

    public Spliterator<E> trySplit() {
        int a = m63881a();
        int i = this.f54331c;
        int i2 = (a + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        Vector vector = this.f54329a;
        Object[] objArr = this.f54330b;
        this.f54331c = i2;
        return new VectorSpliterator(vector, objArr, i, i2, this.f54333e);
    }

    public boolean tryAdvance(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        int a = m63881a();
        int i = this.f54331c;
        if (a <= i) {
            return null;
        }
        this.f54331c = i + 1;
        consumer.accept(this.f54330b[i]);
        if (this.f54333e == m63884c(this.f54329a)) {
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        int a = m63881a();
        Object[] objArr = this.f54330b;
        this.f54331c = a;
        for (int i = this.f54331c; i < a; i++) {
            consumer.accept(objArr[i]);
        }
        if (m63884c(this.f54329a) != this.f54333e) {
            throw new ConcurrentModificationException();
        }
    }

    public long estimateSize() {
        return (long) (m63881a() - this.f54331c);
    }

    public Comparator<? super E> getComparator() {
        return Spliterators.m59174b((Spliterator) this);
    }

    public long getExactSizeIfKnown() {
        return Spliterators.m59152a((Spliterator) this);
    }

    public boolean hasCharacteristics(int i) {
        return Spliterators.m59173a((Spliterator) this, i);
    }

    /* renamed from: b */
    private static <T> int m63883b(Vector<T> vector) {
        return f54325f.getInt(vector, f54326g);
    }

    /* renamed from: c */
    private static <T> int m63884c(Vector<T> vector) {
        return f54325f.getInt(vector, f54327h);
    }

    /* renamed from: d */
    private static <T> Object[] m63885d(Vector<T> vector) {
        return (Object[]) f54325f.getObject(vector, f54328i);
    }

    static {
        try {
            f54327h = f54325f.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
            f54326g = f54325f.objectFieldOffset(Vector.class.getDeclaredField("elementCount"));
            f54328i = f54325f.objectFieldOffset(Vector.class.getDeclaredField("elementData"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
