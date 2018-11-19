package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2305n;
import com.google.android.exoplayer2.util.C2314v;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CacheDataSink implements DataSink {
    /* renamed from: a */
    private final Cache f11683a;
    /* renamed from: b */
    private final long f11684b;
    /* renamed from: c */
    private final int f11685c;
    /* renamed from: d */
    private final boolean f11686d;
    /* renamed from: e */
    private DataSpec f11687e;
    /* renamed from: f */
    private File f11688f;
    /* renamed from: g */
    private OutputStream f11689g;
    /* renamed from: h */
    private FileOutputStream f11690h;
    /* renamed from: i */
    private long f11691i;
    /* renamed from: j */
    private long f11692j;
    /* renamed from: k */
    private C2305n f11693k;

    public static class CacheDataSinkException extends CacheException {
        public CacheDataSinkException(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    public CacheDataSink(Cache cache, long j) {
        this(cache, j, 20480, true);
    }

    public CacheDataSink(Cache cache, long j, int i, boolean z) {
        this.f11683a = (Cache) C2289a.m8309a((Object) cache);
        this.f11684b = j;
        this.f11685c = i;
        this.f11686d = z;
    }

    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        if (dataSpec.f6826e != -1 || dataSpec.m8236a(2)) {
            this.f11687e = dataSpec;
            this.f11692j = 0;
            try {
                m14092a();
                return;
            } catch (DataSpec dataSpec2) {
                throw new CacheDataSinkException(dataSpec2);
            }
        }
        this.f11687e = null;
    }

    public void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        if (this.f11687e != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f11691i == this.f11684b) {
                        m14093b();
                        m14092a();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f11684b - this.f11691i);
                    this.f11689g.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f11691i += j;
                    this.f11692j += j;
                } catch (byte[] bArr2) {
                    throw new CacheDataSinkException(bArr2);
                }
            }
        }
    }

    public void close() throws CacheDataSinkException {
        if (this.f11687e != null) {
            try {
                m14093b();
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    /* renamed from: a */
    private void m14092a() throws IOException {
        long j;
        if (this.f11687e.f6826e == -1) {
            j = this.f11684b;
        } else {
            j = Math.min(this.f11687e.f6826e - this.f11692j, this.f11684b);
        }
        this.f11688f = this.f11683a.startFile(this.f11687e.f6827f, this.f11687e.f6824c + this.f11692j, j);
        this.f11690h = new FileOutputStream(this.f11688f);
        if (this.f11685c > 0) {
            if (this.f11693k == null) {
                this.f11693k = new C2305n(this.f11690h, this.f11685c);
            } else {
                this.f11693k.m8429a(this.f11690h);
            }
            this.f11689g = this.f11693k;
        } else {
            this.f11689g = this.f11690h;
        }
        this.f11691i = 0;
    }

    /* renamed from: b */
    private void m14093b() throws IOException {
        if (this.f11689g != null) {
            try {
                this.f11689g.flush();
                if (this.f11686d) {
                    this.f11690h.getFD().sync();
                }
                C2314v.m8473a(this.f11689g);
                this.f11689g = null;
                File file = this.f11688f;
                this.f11688f = null;
                this.f11683a.commitFile(file);
            } catch (Throwable th) {
                C2314v.m8473a(this.f11689g);
                this.f11689g = null;
                File file2 = this.f11688f;
                this.f11688f = null;
                file2.delete();
            }
        }
    }
}
