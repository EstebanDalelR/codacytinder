package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C6849f;
import java.util.Arrays;
import java.util.Comparator;

public abstract class bc<T> implements Comparator<T> {
    public abstract int compare(T t, T t2);

    /* renamed from: b */
    public static <C extends Comparable> bc<C> m20643b() {
        return ba.f23677a;
    }

    /* renamed from: a */
    public static <T> bc<T> m20642a(Comparator<T> comparator) {
        return comparator instanceof bc ? (bc) comparator : new C6365k(comparator);
    }

    protected bc() {
    }

    /* renamed from: a */
    public <S extends T> bc<S> mo4827a() {
        return new bm(this);
    }

    /* renamed from: a */
    public final <F> bc<F> m20646a(C6849f<F, ? extends T> c6849f) {
        return new C6364h(c6849f, this);
    }

    /* renamed from: a */
    public final <E extends T> ae<E> m20644a(Iterable<E> iterable) {
        Object[] b = as.m20504b(iterable);
        for (Object a : b) {
            C5571j.m24292a(a);
        }
        Arrays.sort(b, this);
        return ae.m27683b(b);
    }
}
