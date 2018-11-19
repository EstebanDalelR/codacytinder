package java8.util;

import java.lang.reflect.Array;
import java.util.Comparator;
import java8.util.Spliterator.OfDouble;
import java8.util.Spliterator.OfInt;
import java8.util.Spliterator.OfLong;
import java8.util.concurrent.ForkJoinPool;

public final class J8Arrays {

    static final class NaturalOrder implements Comparator<Object> {
        /* renamed from: a */
        static final NaturalOrder f48737a = new NaturalOrder();

        NaturalOrder() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: a */
    public static <T> Spliterator<T> m59085a(T[] tArr, int i, int i2) {
        return Spliterators.m59167a((Object[]) tArr, i, i2, 1040);
    }

    /* renamed from: a */
    public static OfInt m59083a(int[] iArr, int i, int i2) {
        return Spliterators.m59157a(iArr, i, i2, 1040);
    }

    /* renamed from: a */
    public static OfLong m59084a(long[] jArr, int i, int i2) {
        return Spliterators.m59158a(jArr, i, i2, 1040);
    }

    /* renamed from: a */
    public static OfDouble m59082a(double[] dArr, int i, int i2) {
        return Spliterators.m59156a(dArr, i, i2, 1040);
    }

    /* renamed from: a */
    public static void m59088a(int[] iArr) {
        int length = iArr.length;
        if (length > 8192) {
            int b = ForkJoinPool.m59246b();
            if (b != 1) {
                int i = length / (b << 2);
                new Sorter(null, iArr, new int[length], 0, length, 0, i <= 8192 ? 8192 : i).m59285k();
                return;
            }
        }
        DualPivotQuicksort.m59054a(iArr, 0, length - 1, null, 0, 0);
    }

    /* renamed from: a */
    public static void m59090a(long[] jArr) {
        int length = jArr.length;
        if (length > 8192) {
            int b = ForkJoinPool.m59246b();
            if (b != 1) {
                int i = length / (b << 2);
                new Sorter(null, jArr, new long[length], 0, length, 0, i <= 8192 ? 8192 : i).m59285k();
                return;
            }
        }
        DualPivotQuicksort.m59056a(jArr, 0, length - 1, null, 0, 0);
    }

    /* renamed from: a */
    public static void m59086a(double[] dArr) {
        int length = dArr.length;
        if (length > 8192) {
            int b = ForkJoinPool.m59246b();
            if (b != 1) {
                int i = length / (b << 2);
                new Sorter(null, dArr, new double[length], 0, length, 0, i <= 8192 ? 8192 : i).m59285k();
                return;
            }
        }
        DualPivotQuicksort.m59050a(dArr, 0, length - 1, null, 0, 0);
    }

    /* renamed from: a */
    public static <T> void m59092a(T[] tArr, Comparator<? super T> comparator) {
        if (comparator == null) {
            comparator = NaturalOrder.f48737a;
        }
        int length = tArr.length;
        if (length > 8192) {
            int b = ForkJoinPool.m59246b();
            if (b != 1) {
                b = length / (b << 2);
                new Sorter(null, tArr, (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length), 0, length, 0, b <= 8192 ? 8192 : b, comparator).m59285k();
                return;
            }
        }
        TimSort.m59207a(tArr, 0, length, comparator, null, 0, 0);
    }

    private J8Arrays() {
    }
}
