package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aa.v */
public abstract class C7422v<E> extends C6367r<E> implements Set<E> {
    /* renamed from: b */
    protected abstract Set<E> mo7537b();

    /* renamed from: a */
    protected /* synthetic */ Collection mo7018a() {
        return mo7537b();
    }

    /* renamed from: c */
    protected /* synthetic */ Object mo4837c() {
        return mo7537b();
    }

    protected C7422v() {
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (mo7537b().equals(obj) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        return mo7537b().hashCode();
    }
}
