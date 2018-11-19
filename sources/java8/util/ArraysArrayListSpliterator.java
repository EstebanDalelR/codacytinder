package java8.util;

import java.util.List;
import sun.misc.Unsafe;

final class ArraysArrayListSpliterator {
    /* renamed from: a */
    private static final Unsafe f48702a = UnsafeAccess.f48790a;
    /* renamed from: b */
    private static final long f48703b;

    private ArraysArrayListSpliterator() {
    }

    /* renamed from: a */
    static <T> Spliterator<T> m59023a(List<T> list) {
        return Spliterators.m59166a(m59024b(list), 16);
    }

    /* renamed from: b */
    private static <T> Object[] m59024b(List<T> list) {
        return (Object[]) f48702a.getObject(list, f48703b);
    }

    static {
        try {
            f48703b = f48702a.objectFieldOffset(Class.forName("java.util.Arrays$ArrayList").getDeclaredField("a"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
