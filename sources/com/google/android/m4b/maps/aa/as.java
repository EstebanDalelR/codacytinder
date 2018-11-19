package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5572k;
import com.google.android.m4b.maps.p125y.C6849f;
import java.util.Collection;
import java.util.Iterator;

public final class as {
    /* renamed from: a */
    public static <T> T m20502a(Iterable<T> iterable) {
        return at.m20517c(iterable.iterator());
    }

    /* renamed from: a */
    public static <T> boolean m20503a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(C4584j.m20671a((Iterable) iterable));
        }
        return at.m20512a((Collection) collection, ((Iterable) C5571j.m24292a((Object) iterable)).iterator());
    }

    /* renamed from: a */
    public static <T> Iterable<T> m20501a(final Iterable<T> iterable, final C5572k<? super T> c5572k) {
        C5571j.m24292a((Object) iterable);
        C5571j.m24292a((Object) c5572k);
        return new C4585q<T>() {
            public final Iterator<T> iterator() {
                return at.m20508a(iterable.iterator(), c5572k);
            }
        };
    }

    /* renamed from: a */
    public static <F, T> Iterable<T> m20500a(final Iterable<F> iterable, final C6849f<? super F, ? extends T> c6849f) {
        C5571j.m24292a((Object) iterable);
        C5571j.m24292a((Object) c6849f);
        return new C4585q<T>() {
            public final Iterator<T> iterator() {
                return at.m20511a(iterable.iterator(), c6849f);
            }
        };
    }

    /* renamed from: b */
    static Object[] m20504b(Iterable<?> iterable) {
        return (iterable instanceof Collection ? (Collection) iterable : au.m20526a(iterable.iterator())).toArray();
    }
}
