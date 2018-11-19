package java8.util;

import com.tinder.api.ManagerWebServices;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class ArrayListSpliterator<E> implements Spliterator<E> {
    /* renamed from: e */
    private static final Unsafe f54209e = UnsafeAccess.f48790a;
    /* renamed from: f */
    private static final long f54210f;
    /* renamed from: g */
    private static final long f54211g;
    /* renamed from: h */
    private static final long f54212h;
    /* renamed from: a */
    private final ArrayList<E> f54213a;
    /* renamed from: b */
    private int f54214b;
    /* renamed from: c */
    private int f54215c;
    /* renamed from: d */
    private int f54216d;

    public int characteristics() {
        return 16464;
    }

    public /* synthetic */ Spliterator trySplit() {
        return m63814a();
    }

    private ArrayListSpliterator(ArrayList<E> arrayList, int i, int i2, int i3) {
        this.f54213a = arrayList;
        this.f54214b = i;
        this.f54215c = i2;
        this.f54216d = i3;
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63809a(ArrayList<T> arrayList) {
        return new ArrayListSpliterator(arrayList, 0, -1, 0);
    }

    /* renamed from: b */
    private int m63810b() {
        int i = this.f54215c;
        if (i >= 0) {
            return i;
        }
        ArrayList arrayList = this.f54213a;
        this.f54216d = m63812c(arrayList);
        i = m63811b(arrayList);
        this.f54215c = i;
        return i;
    }

    /* renamed from: a */
    public ArrayListSpliterator<E> m63814a() {
        int b = m63810b();
        int i = this.f54214b;
        b = (b + i) >>> 1;
        if (i >= b) {
            return null;
        }
        ArrayList arrayList = this.f54213a;
        this.f54214b = b;
        return new ArrayListSpliterator(arrayList, i, b, this.f54216d);
    }

    public boolean tryAdvance(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        int b = m63810b();
        int i = this.f54214b;
        if (i >= b) {
            return null;
        }
        this.f54214b = i + 1;
        consumer.accept(m63813d(this.f54213a)[i]);
        if (this.f54216d == m63812c(this.f54213a)) {
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        ArrayList arrayList = this.f54213a;
        Object[] d = m63813d(arrayList);
        if (d != null) {
            int i;
            int i2 = this.f54215c;
            if (i2 < 0) {
                i2 = m63812c(arrayList);
                i = i2;
                i2 = m63811b(arrayList);
            } else {
                i = this.f54216d;
            }
            int i3 = this.f54214b;
            if (i3 >= 0) {
                this.f54214b = i2;
                if (i2 <= d.length) {
                    while (i3 < i2) {
                        consumer.accept(d[i3]);
                        i3++;
                    }
                    if (i == m63812c(arrayList)) {
                        return;
                    }
                }
            }
        }
        throw new ConcurrentModificationException();
    }

    public long estimateSize() {
        return (long) (m63810b() - this.f54214b);
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
    private static <T> int m63811b(ArrayList<T> arrayList) {
        return f54209e.getInt(arrayList, f54210f);
    }

    /* renamed from: c */
    private static <T> int m63812c(ArrayList<T> arrayList) {
        return f54209e.getInt(arrayList, f54211g);
    }

    /* renamed from: d */
    private static <T> Object[] m63813d(ArrayList<T> arrayList) {
        return (Object[]) f54209e.getObject(arrayList, f54212h);
    }

    static {
        try {
            f54211g = f54209e.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
            f54210f = f54209e.objectFieldOffset(ArrayList.class.getDeclaredField(ManagerWebServices.PARAM_SIZE));
            f54212h = f54209e.objectFieldOffset(ArrayList.class.getDeclaredField(Spliterators.f48760d ? "array" : "elementData"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
