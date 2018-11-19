package java8.util;

import java.util.concurrent.CopyOnWriteArrayList;
import sun.misc.Unsafe;

final class COWArrayListSpliterator {
    /* renamed from: a */
    private static final Unsafe f48704a = UnsafeAccess.f48790a;
    /* renamed from: b */
    private static final long f48705b = m59025a(Spliterators.f48759c ? "elements" : "array", true);

    private COWArrayListSpliterator() {
    }

    /* renamed from: a */
    static <T> Spliterator<T> m59026a(CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        return Spliterators.m59166a(m59027b(copyOnWriteArrayList), 1040);
    }

    /* renamed from: b */
    static <T> Object[] m59027b(CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        return (Object[]) f48704a.getObject(copyOnWriteArrayList, f48705b);
    }

    /* renamed from: a */
    static long m59025a(String str, boolean z) {
        try {
            return f48704a.objectFieldOffset(CopyOnWriteArrayList.class.getDeclaredField(str));
        } catch (String str2) {
            if (z && (str2 instanceof NoSuchFieldException) && Spliterators.f48759c && !Spliterators.f48760d) {
                return m59025a("array", false);
            }
            throw new Error(str2);
        }
    }
}
