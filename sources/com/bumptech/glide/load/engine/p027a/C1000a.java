package com.bumptech.glide.load.engine.p027a;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;

/* renamed from: com.bumptech.glide.load.engine.a.a */
public final class C1000a {
    /* renamed from: a */
    private final MemoryCache f2786a;
    /* renamed from: b */
    private final BitmapPool f2787b;
    /* renamed from: c */
    private final DecodeFormat f2788c;
    /* renamed from: d */
    private final Handler f2789d = new Handler(Looper.getMainLooper());

    public C1000a(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f2786a = memoryCache;
        this.f2787b = bitmapPool;
        this.f2788c = decodeFormat;
    }
}
