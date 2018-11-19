package java8.util;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import sun.misc.Unsafe;

final class COWArraySetSpliterator {
    /* renamed from: a */
    private static final Unsafe f48706a = UnsafeAccess.f48790a;
    /* renamed from: b */
    private static final long f48707b;

    private COWArraySetSpliterator() {
    }

    /* renamed from: a */
    static <T> Spliterator<T> m59028a(CopyOnWriteArraySet<T> copyOnWriteArraySet) {
        return Spliterators.m59166a(COWArrayListSpliterator.m59027b(m59029b(copyOnWriteArraySet)), 1025);
    }

    /* renamed from: b */
    private static <T> CopyOnWriteArrayList<T> m59029b(CopyOnWriteArraySet<T> copyOnWriteArraySet) {
        return (CopyOnWriteArrayList) f48706a.getObject(copyOnWriteArraySet, f48707b);
    }

    static {
        try {
            f48707b = f48706a.objectFieldOffset(CopyOnWriteArraySet.class.getDeclaredField("al"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
