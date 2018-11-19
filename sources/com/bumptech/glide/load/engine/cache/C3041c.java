package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import com.bumptech.glide.p023a.C0971a;
import com.bumptech.glide.p023a.C0971a.C0968a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.cache.c */
public class C3041c implements DiskCache {
    /* renamed from: a */
    private static C3041c f9480a;
    /* renamed from: b */
    private final C1020b f9481b = new C1020b();
    /* renamed from: c */
    private final C1023g f9482c;
    /* renamed from: d */
    private final File f9483d;
    /* renamed from: e */
    private final int f9484e;
    /* renamed from: f */
    private C0971a f9485f;

    /* renamed from: a */
    public static synchronized DiskCache m11991a(File file, int i) {
        synchronized (C3041c.class) {
            if (f9480a == null) {
                f9480a = new C3041c(file, i);
            }
            file = f9480a;
        }
        return file;
    }

    protected C3041c(File file, int i) {
        this.f9483d = file;
        this.f9484e = i;
        this.f9482c = new C1023g();
    }

    /* renamed from: a */
    private synchronized C0971a m11990a() throws IOException {
        if (this.f9485f == null) {
            this.f9485f = C0971a.m3319a(this.f9483d, 1, 1, (long) this.f9484e);
        }
        return this.f9485f;
    }

    /* renamed from: b */
    private synchronized void m11992b() {
        this.f9485f = null;
    }

    public File get(Key key) {
        try {
            key = m11990a().m3337a(this.f9482c.m3561a(key));
            if (key != null) {
                return key.m3316a(0);
            }
            return null;
        } catch (Key key2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", key2);
            return null;
        }
    }

    public void put(Key key, Writer writer) {
        C0968a b;
        String a = this.f9482c.m3561a(key);
        this.f9481b.m3552a(key);
        try {
            b = m11990a().m3339b(a);
            if (b != null) {
                if (writer.write(b.m3298a(0)) != null) {
                    b.m3299a();
                }
                b.m3301c();
            }
        } catch (Writer writer2) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", writer2);
                }
            } catch (Throwable th) {
                this.f9481b.m3553b(key);
            }
        } catch (Throwable th2) {
            b.m3301c();
        }
        this.f9481b.m3553b(key);
    }

    public void delete(Key key) {
        try {
            m11990a().m3340c(this.f9482c.m3561a(key));
        } catch (Key key2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", key2);
            }
        }
    }

    public synchronized void clear() {
        try {
            m11990a().m3338a();
            m11992b();
        } catch (Throwable e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to clear disk cache", e);
            }
        }
    }
}
