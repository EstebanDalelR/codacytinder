package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.resource.c */
public class C3097c<T> implements Resource<T> {
    /* renamed from: a */
    protected final T f9592a;

    public final int getSize() {
        return 1;
    }

    public void recycle() {
    }

    public C3097c(T t) {
        if (t == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f9592a = t;
    }

    public final T get() {
        return this.f9592a;
    }
}
