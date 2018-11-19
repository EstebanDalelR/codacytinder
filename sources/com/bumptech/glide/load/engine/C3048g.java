package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.bumptech.glide.load.Key;

/* renamed from: com.bumptech.glide.load.engine.g */
class C3048g<Z> implements Resource<Z> {
    /* renamed from: a */
    private final Resource<Z> f9503a;
    /* renamed from: b */
    private final boolean f9504b;
    /* renamed from: c */
    private C1030a f9505c;
    /* renamed from: d */
    private Key f9506d;
    /* renamed from: e */
    private int f9507e;
    /* renamed from: f */
    private boolean f9508f;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    interface C1030a {
        /* renamed from: b */
        void mo1278b(Key key, C3048g<?> c3048g);
    }

    C3048g(Resource<Z> resource, boolean z) {
        if (resource == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.f9503a = resource;
        this.f9504b = z;
    }

    /* renamed from: a */
    void m12000a(Key key, C1030a c1030a) {
        this.f9506d = key;
        this.f9505c = c1030a;
    }

    /* renamed from: a */
    boolean m12001a() {
        return this.f9504b;
    }

    public Z get() {
        return this.f9503a.get();
    }

    public int getSize() {
        return this.f9503a.getSize();
    }

    public void recycle() {
        if (this.f9507e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f9508f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f9508f = true;
            this.f9503a.recycle();
        }
    }

    /* renamed from: b */
    void m12002b() {
        if (this.f9508f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f9507e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* renamed from: c */
    void m12003c() {
        if (this.f9507e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f9507e - 1;
            this.f9507e = i;
            if (i == 0) {
                this.f9505c.mo1278b(this.f9506d, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }
}
