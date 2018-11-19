package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@zzzv
public final class hc {
    /* renamed from: a */
    private Map<Integer, Bitmap> f16131a = new ConcurrentHashMap();
    /* renamed from: b */
    private AtomicInteger f16132b = new AtomicInteger(0);

    /* renamed from: a */
    public final int m19838a(Bitmap bitmap) {
        if (bitmap == null) {
            hx.m19911b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f16132b.getAndIncrement();
        this.f16131a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap m19839a(Integer num) {
        return (Bitmap) this.f16131a.get(num);
    }

    /* renamed from: b */
    public final void m19840b(Integer num) {
        this.f16131a.remove(num);
    }
}
