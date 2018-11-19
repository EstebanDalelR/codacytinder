package com.bumptech.glide;

import android.content.Context;
import android.os.Build.VERSION;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.C3030b;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.C3034c;
import com.bumptech.glide.load.engine.bitmap_recycle.C3036e;
import com.bumptech.glide.load.engine.cache.C1022f;
import com.bumptech.glide.load.engine.cache.C3043e;
import com.bumptech.glide.load.engine.cache.C4088d;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.FifoPriorityThreadPoolExecutor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bumptech.glide.j */
public class C0995j {
    /* renamed from: a */
    private final Context f2778a;
    /* renamed from: b */
    private C3030b f2779b;
    /* renamed from: c */
    private BitmapPool f2780c;
    /* renamed from: d */
    private MemoryCache f2781d;
    /* renamed from: e */
    private ExecutorService f2782e;
    /* renamed from: f */
    private ExecutorService f2783f;
    /* renamed from: g */
    private DecodeFormat f2784g;
    /* renamed from: h */
    private Factory f2785h;

    public C0995j(Context context) {
        this.f2778a = context.getApplicationContext();
    }

    /* renamed from: a */
    C0994i m3504a() {
        if (this.f2782e == null) {
            this.f2782e = new FifoPriorityThreadPoolExecutor(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f2783f == null) {
            this.f2783f = new FifoPriorityThreadPoolExecutor(1);
        }
        C1022f c1022f = new C1022f(this.f2778a);
        if (this.f2780c == null) {
            if (VERSION.SDK_INT >= 11) {
                this.f2780c = new C3036e(c1022f.m3560b());
            } else {
                this.f2780c = new C3034c();
            }
        }
        if (this.f2781d == null) {
            this.f2781d = new C3043e(c1022f.m3559a());
        }
        if (this.f2785h == null) {
            this.f2785h = new C4088d(this.f2778a);
        }
        if (this.f2779b == null) {
            this.f2779b = new C3030b(this.f2781d, this.f2785h, this.f2783f, this.f2782e);
        }
        if (this.f2784g == null) {
            this.f2784g = DecodeFormat.DEFAULT;
        }
        return new C0994i(this.f2779b, this.f2781d, this.f2780c, this.f2778a, this.f2784g);
    }
}
