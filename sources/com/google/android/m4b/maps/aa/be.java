package com.google.android.m4b.maps.aa;

import java.util.ListIterator;

class be<E> extends C7423y<E> {
    /* renamed from: a */
    private final aa<E> f28854a;
    /* renamed from: b */
    private final ae<? extends E> f28855b;

    public /* synthetic */ ListIterator listIterator(int i) {
        return mo7003a(i);
    }

    be(aa<E> aaVar, ae<? extends E> aeVar) {
        this.f28854a = aaVar;
        this.f28855b = aeVar;
    }

    be(aa<E> aaVar, Object[] objArr) {
        this((aa) aaVar, ae.m27683b(objArr));
    }

    /* renamed from: h */
    aa<E> mo7522h() {
        return this.f28854a;
    }

    /* renamed from: a */
    public final bx<E> mo7003a(int i) {
        return this.f28855b.mo7003a(i);
    }

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        return this.f28855b.mo4784a(objArr, i);
    }

    public E get(int i) {
        return this.f28855b.get(i);
    }
}
