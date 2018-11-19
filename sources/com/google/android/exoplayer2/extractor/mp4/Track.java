package com.google.android.exoplayer2.extractor.mp4;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Track {
    /* renamed from: a */
    public final int f5803a;
    /* renamed from: b */
    public final int f5804b;
    /* renamed from: c */
    public final long f5805c;
    /* renamed from: d */
    public final long f5806d;
    /* renamed from: e */
    public final long f5807e;
    /* renamed from: f */
    public final Format f5808f;
    /* renamed from: g */
    public final int f5809g;
    @Nullable
    /* renamed from: h */
    public final long[] f5810h;
    @Nullable
    /* renamed from: i */
    public final long[] f5811i;
    /* renamed from: j */
    public final int f5812j;
    @Nullable
    /* renamed from: k */
    private final C2101h[] f5813k;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, Format format, int i3, @Nullable C2101h[] c2101hArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f5803a = i;
        this.f5804b = i2;
        this.f5805c = j;
        this.f5806d = j2;
        this.f5807e = j3;
        this.f5808f = format;
        this.f5809g = i3;
        this.f5813k = c2101hArr;
        this.f5812j = i4;
        this.f5810h = jArr;
        this.f5811i = jArr2;
    }

    /* renamed from: a */
    public C2101h m7469a(int i) {
        return this.f5813k == null ? 0 : this.f5813k[i];
    }
}
