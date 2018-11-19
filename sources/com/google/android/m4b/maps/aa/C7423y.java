package com.google.android.m4b.maps.aa;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: com.google.android.m4b.maps.aa.y */
abstract class C7423y<E> extends ae<E> {

    /* renamed from: com.google.android.m4b.maps.aa.y$a */
    static class C4589a implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private aa<?> f16992a;

        C4589a(aa<?> aaVar) {
            this.f16992a = aaVar;
        }

        final Object readResolve() {
            return this.f16992a.mo4786b();
        }
    }

    /* renamed from: h */
    abstract aa<E> mo7522h();

    C7423y() {
    }

    public boolean contains(Object obj) {
        return mo7522h().contains(obj);
    }

    public int size() {
        return mo7522h().size();
    }

    public boolean isEmpty() {
        return mo7522h().isEmpty();
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return mo7522h().mo4791d();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new C4589a(mo7522h());
    }
}
