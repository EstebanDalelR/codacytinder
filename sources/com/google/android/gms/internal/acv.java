package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

final class acv<E> extends abd<E> {
    /* renamed from: a */
    private static final acv<Object> f26537a;
    /* renamed from: b */
    private final List<E> f26538b;

    static {
        abd acv = new acv();
        f26537a = acv;
        acv.zzbiy();
    }

    acv() {
        this(new ArrayList(10));
    }

    private acv(List<E> list) {
        this.f26538b = list;
    }

    /* renamed from: b */
    public static <E> acv<E> m31337b() {
        return f26537a;
    }

    public final void add(int i, E e) {
        m26984a();
        this.f26538b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f26538b.get(i);
    }

    public final E remove(int i) {
        m26984a();
        E remove = this.f26538b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        m26984a();
        E e2 = this.f26538b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f26538b.size();
    }

    public final /* synthetic */ zzfgd zzly(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        List arrayList = new ArrayList(i);
        arrayList.addAll(this.f26538b);
        return new acv(arrayList);
    }
}
