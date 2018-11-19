package com.google.android.exoplayer2.source.chunk;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.source.chunk.c */
public abstract class C3680c implements Loadable {
    /* renamed from: b */
    public final DataSpec f11415b;
    /* renamed from: c */
    public final int f11416c;
    /* renamed from: d */
    public final Format f11417d;
    /* renamed from: e */
    public final int f11418e;
    @Nullable
    /* renamed from: f */
    public final Object f11419f;
    /* renamed from: g */
    public final long f11420g;
    /* renamed from: h */
    public final long f11421h;
    /* renamed from: i */
    protected final DataSource f11422i;

    /* renamed from: b */
    public abstract long mo3499b();

    public C3680c(DataSource dataSource, DataSpec dataSpec, int i, Format format, int i2, @Nullable Object obj, long j, long j2) {
        this.f11422i = (DataSource) C2289a.m8309a((Object) dataSource);
        this.f11415b = (DataSpec) C2289a.m8309a((Object) dataSpec);
        this.f11416c = i;
        this.f11417d = format;
        this.f11418e = i2;
        this.f11419f = obj;
        this.f11420g = j;
        this.f11421h = j2;
    }

    /* renamed from: a */
    public final long m13944a() {
        return this.f11421h - this.f11420g;
    }
}
