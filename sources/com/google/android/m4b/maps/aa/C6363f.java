package com.google.android.m4b.maps.aa;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.m4b.maps.aa.f */
public abstract class C6363f<T> extends bw<T> {
    /* renamed from: a */
    private T f23691a;

    /* renamed from: a */
    protected abstract T mo7001a(T t);

    protected C6363f(T t) {
        this.f23691a = t;
    }

    public final boolean hasNext() {
        return this.f23691a != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                T t = this.f23691a;
                return t;
            } finally {
                this.f23691a = mo7001a(this.f23691a);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
