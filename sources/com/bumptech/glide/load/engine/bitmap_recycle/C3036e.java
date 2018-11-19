package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.e */
public class C3036e implements BitmapPool {
    /* renamed from: a */
    private static final Config f9457a = Config.ARGB_8888;
    /* renamed from: b */
    private final C1011f f9458b;
    /* renamed from: c */
    private final Set<Config> f9459c;
    /* renamed from: d */
    private final int f9460d;
    /* renamed from: e */
    private final C1010a f9461e;
    /* renamed from: f */
    private int f9462f;
    /* renamed from: g */
    private int f9463g;
    /* renamed from: h */
    private int f9464h;
    /* renamed from: i */
    private int f9465i;
    /* renamed from: j */
    private int f9466j;
    /* renamed from: k */
    private int f9467k;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.e$a */
    private interface C1010a {
        /* renamed from: a */
        void mo1295a(Bitmap bitmap);

        /* renamed from: b */
        void mo1296b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.e$b */
    private static class C3035b implements C1010a {
        /* renamed from: a */
        public void mo1295a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo1296b(Bitmap bitmap) {
        }

        private C3035b() {
        }
    }

    C3036e(int i, C1011f c1011f, Set<Config> set) {
        this.f9460d = i;
        this.f9462f = i;
        this.f9458b = c1011f;
        this.f9459c = set;
        this.f9461e = new C3035b();
    }

    public C3036e(int i) {
        this(i, C3036e.m11970d(), C3036e.m11971e());
    }

    public int getMaxSize() {
        return this.f9462f;
    }

    public synchronized void setSizeMultiplier(float f) {
        this.f9462f = Math.round(((float) this.f9460d) * f);
        m11966a();
    }

    public synchronized boolean put(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isMutable() && this.f9458b.mo1287c(bitmap) <= this.f9462f) {
            if (this.f9459c.contains(bitmap.getConfig())) {
                int c = this.f9458b.mo1287c(bitmap);
                this.f9458b.mo1284a(bitmap);
                this.f9461e.mo1295a(bitmap);
                this.f9466j++;
                this.f9463g += c;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Put bitmap in pool=");
                    stringBuilder.append(this.f9458b.mo1286b(bitmap));
                    Log.v("LruBitmapPool", stringBuilder.toString());
                }
                m11968b();
                m11966a();
                return true;
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Reject bitmap from pool, bitmap: ");
            stringBuilder.append(this.f9458b.mo1286b(bitmap));
            stringBuilder.append(", is mutable: ");
            stringBuilder.append(bitmap.isMutable());
            stringBuilder.append(", is allowed config: ");
            stringBuilder.append(this.f9459c.contains(bitmap.getConfig()));
            Log.v("LruBitmapPool", stringBuilder.toString());
        }
        return null;
    }

    /* renamed from: a */
    private void m11966a() {
        m11967a(this.f9462f);
    }

    public synchronized Bitmap get(int i, int i2, Config config) {
        i = getDirty(i, i2, config);
        if (i != 0) {
            i.eraseColor(0);
        }
        return i;
    }

    @TargetApi(12)
    public synchronized Bitmap getDirty(int i, int i2, Config config) {
        Bitmap a;
        a = this.f9458b.mo1283a(i, i2, config != null ? config : f9457a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Missing bitmap=");
                stringBuilder.append(this.f9458b.mo1285b(i, i2, config));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            this.f9465i++;
        } else {
            this.f9464h++;
            this.f9463g -= this.f9458b.mo1287c(a);
            this.f9461e.mo1296b(a);
            if (VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Get bitmap=");
            stringBuilder2.append(this.f9458b.mo1285b(i, i2, config));
            Log.v("LruBitmapPool", stringBuilder2.toString());
        }
        m11968b();
        return a;
    }

    public void clearMemory() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m11967a(0);
    }

    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("trimMemory, level=");
            stringBuilder.append(i);
            Log.d("LruBitmapPool", stringBuilder.toString());
        }
        if (i >= 60) {
            clearMemory();
        } else if (i >= 40) {
            m11967a(this.f9462f / 2);
        }
    }

    /* renamed from: a */
    private synchronized void m11967a(int i) {
        while (this.f9463g > i) {
            Bitmap a = this.f9458b.mo1282a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5) != 0) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m11969c();
                }
                this.f9463g = 0;
                return;
            }
            this.f9461e.mo1296b(a);
            this.f9463g -= this.f9458b.mo1287c(a);
            a.recycle();
            this.f9467k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Evicting bitmap=");
                stringBuilder.append(this.f9458b.mo1286b(a));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            m11968b();
        }
    }

    /* renamed from: b */
    private void m11968b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m11969c();
        }
    }

    /* renamed from: c */
    private void m11969c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hits=");
        stringBuilder.append(this.f9464h);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.f9465i);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.f9466j);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.f9467k);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.f9463g);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.f9462f);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.f9458b);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    /* renamed from: d */
    private static C1011f m11970d() {
        if (VERSION.SDK_INT >= 19) {
            return new C3039h();
        }
        return new C3033a();
    }

    /* renamed from: e */
    private static Set<Config> m11971e() {
        Set hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
