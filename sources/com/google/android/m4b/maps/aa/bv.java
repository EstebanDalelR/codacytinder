package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Iterator;

abstract class bv<F, T> implements Iterator<T> {
    /* renamed from: a */
    private Iterator<? extends F> f16973a;

    /* renamed from: a */
    abstract T mo4797a(F f);

    bv(Iterator<? extends F> it) {
        this.f16973a = (Iterator) C5571j.m24292a((Object) it);
    }

    public final boolean hasNext() {
        return this.f16973a.hasNext();
    }

    public final T next() {
        return mo4797a(this.f16973a.next());
    }

    public final void remove() {
        this.f16973a.remove();
    }
}
