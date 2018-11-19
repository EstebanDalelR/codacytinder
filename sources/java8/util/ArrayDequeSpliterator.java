package java8.util;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class ArrayDequeSpliterator<E> implements Spliterator<E> {
    /* renamed from: d */
    private static final Unsafe f54202d = UnsafeAccess.f48790a;
    /* renamed from: e */
    private static final long f54203e;
    /* renamed from: f */
    private static final long f54204f;
    /* renamed from: g */
    private static final long f54205g;
    /* renamed from: a */
    private final ArrayDeque<E> f54206a;
    /* renamed from: b */
    private int f54207b;
    /* renamed from: c */
    private int f54208c;

    public int characteristics() {
        return 16720;
    }

    public /* synthetic */ Spliterator trySplit() {
        return m63808a();
    }

    private ArrayDequeSpliterator(ArrayDeque<E> arrayDeque, int i, int i2) {
        this.f54206a = arrayDeque;
        this.f54208c = i;
        this.f54207b = i2;
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63803a(ArrayDeque<T> arrayDeque) {
        return new ArrayDequeSpliterator(arrayDeque, -1, -1);
    }

    /* renamed from: b */
    private int m63804b() {
        int i = this.f54207b;
        if (i >= 0) {
            return i;
        }
        i = m63805b(this.f54206a);
        this.f54207b = i;
        this.f54208c = m63806c(this.f54206a);
        return i;
    }

    /* renamed from: a */
    public ArrayDequeSpliterator<E> m63808a() {
        int b = m63804b();
        int i = this.f54208c;
        int length = m63807d(this.f54206a).length;
        if (i != b) {
            int i2 = length - 1;
            if (((i + 1) & i2) != b) {
                if (i > b) {
                    b += length;
                }
                b = ((b + i) >>> 1) & i2;
                ArrayDeque arrayDeque = this.f54206a;
                this.f54208c = b;
                return new ArrayDequeSpliterator(arrayDeque, i, b);
            }
        }
        return null;
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        Object[] d = m63807d(this.f54206a);
        int length = d.length - 1;
        int b = m63804b();
        int i = this.f54208c;
        this.f54208c = b;
        while (i != b) {
            Object obj = d[i];
            i = (i + 1) & length;
            if (obj == null) {
                throw new ConcurrentModificationException();
            }
            consumer.accept(obj);
        }
    }

    public boolean tryAdvance(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        Object[] d = m63807d(this.f54206a);
        int length = d.length - 1;
        m63804b();
        int i = this.f54208c;
        if (i == this.f54207b) {
            return null;
        }
        Object obj = d[i];
        this.f54208c = length & (i + 1);
        if (obj == null) {
            throw new ConcurrentModificationException();
        }
        consumer.accept(obj);
        return true;
    }

    public long estimateSize() {
        int b = m63804b() - this.f54208c;
        if (b < 0) {
            b += m63807d(this.f54206a).length;
        }
        return (long) b;
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
    private static <T> int m63805b(ArrayDeque<T> arrayDeque) {
        return f54202d.getInt(arrayDeque, f54203e);
    }

    /* renamed from: c */
    private static <T> int m63806c(ArrayDeque<T> arrayDeque) {
        return f54202d.getInt(arrayDeque, f54204f);
    }

    /* renamed from: d */
    private static <T> Object[] m63807d(ArrayDeque<T> arrayDeque) {
        return (Object[]) f54202d.getObject(arrayDeque, f54205g);
    }

    static {
        try {
            f54203e = f54202d.objectFieldOffset(ArrayDeque.class.getDeclaredField("tail"));
            f54204f = f54202d.objectFieldOffset(ArrayDeque.class.getDeclaredField("head"));
            f54205g = f54202d.objectFieldOffset(ArrayDeque.class.getDeclaredField("elements"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
