package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.source.chunk.g */
public abstract class C4249g extends C3680c {
    /* renamed from: j */
    public final long f13679j;

    /* renamed from: d */
    public abstract boolean mo3732d();

    public C4249g(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3) {
        super(dataSource, dataSpec, 1, format, i, obj, j, j2);
        C2289a.m8309a((Object) format);
        this.f13679j = j3;
    }

    /* renamed from: c */
    public long m16951c() {
        return this.f13679j + 1;
    }
}
