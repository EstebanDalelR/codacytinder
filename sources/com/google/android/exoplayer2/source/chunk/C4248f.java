package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.chunk.f */
public abstract class C4248f extends C3680c {
    /* renamed from: a */
    private byte[] f13676a;
    /* renamed from: j */
    private int f13677j;
    /* renamed from: k */
    private volatile boolean f13678k;

    /* renamed from: a */
    protected abstract void mo3730a(byte[] bArr, int i) throws IOException;

    public C4248f(DataSource dataSource, DataSpec dataSpec, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f13676a = bArr;
    }

    /* renamed from: c */
    public byte[] m16950c() {
        return this.f13676a;
    }

    /* renamed from: b */
    public long mo3499b() {
        return (long) this.f13677j;
    }

    public final void cancelLoad() {
        this.f13678k = true;
    }

    public final boolean isLoadCanceled() {
        return this.f13678k;
    }

    public final void load() throws IOException, InterruptedException {
        try {
            this.i.open(this.b);
            int i = 0;
            this.f13677j = 0;
            while (i != -1 && !this.f13678k) {
                mo3731d();
                i = this.i.read(this.f13676a, this.f13677j, 16384);
                if (i != -1) {
                    this.f13677j += i;
                }
            }
            if (!this.f13678k) {
                mo3730a(this.f13676a, this.f13677j);
            }
            C2314v.m8472a(this.i);
        } catch (Throwable th) {
            C2314v.m8472a(this.i);
        }
    }

    /* renamed from: d */
    private void mo3731d() {
        if (this.f13676a == null) {
            this.f13676a = new byte[16384];
        } else if (this.f13676a.length < this.f13677j + 16384) {
            this.f13676a = Arrays.copyOf(this.f13676a, this.f13676a.length + 16384);
        }
    }
}
