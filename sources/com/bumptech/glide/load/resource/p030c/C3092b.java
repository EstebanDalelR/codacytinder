package com.bumptech.glide.load.resource.p030c;

import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.resource.c.b */
public class C3092b implements Resource<C1049a> {
    /* renamed from: a */
    private final C1049a f9576a;

    public /* synthetic */ Object get() {
        return m12046a();
    }

    public C3092b(C1049a c1049a) {
        if (c1049a == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f9576a = c1049a;
    }

    /* renamed from: a */
    public C1049a m12046a() {
        return this.f9576a;
    }

    public int getSize() {
        return this.f9576a.m3623a();
    }

    public void recycle() {
        Resource b = this.f9576a.m3624b();
        if (b != null) {
            b.recycle();
        }
        b = this.f9576a.m3625c();
        if (b != null) {
            b.recycle();
        }
    }
}
