package com.google.android.m4b.maps.aa;

import java.util.Comparator;

final class an<E> extends be<E> implements bs<E> {
    an(aq<E> aqVar, ae<E> aeVar) {
        super((aa) aqVar, (ae) aeVar);
    }

    public final int lastIndexOf(Object obj) {
        return indexOf(obj);
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= null ? true : null;
    }

    /* renamed from: b */
    final ae<E> mo7004b(int i, int i2) {
        return new bk(super.mo7004b(i, i2), comparator()).mo4786b();
    }

    public final Comparator<? super E> comparator() {
        return ((aq) super.mo7522h()).comparator();
    }

    public final int indexOf(Object obj) {
        int b = ((aq) super.mo7522h()).mo7629b(obj);
        return (b < 0 || get(b).equals(obj) == null) ? -1 : b;
    }

    /* renamed from: h */
    final /* synthetic */ aa mo7522h() {
        return (aq) super.mo7522h();
    }
}
