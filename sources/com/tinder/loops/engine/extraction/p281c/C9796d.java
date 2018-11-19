package com.tinder.loops.engine.extraction.p281c;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "", "startExtractionTimeMs", "", "frameExtractionIntervalMs", "", "totalVideoFramesToExtract", "frameExtractionMaxDimensionSize", "videoUriString", "", "(JIJILjava/lang/String;)V", "frameExtractionIntervalUs", "getFrameExtractionIntervalUs", "()J", "getFrameExtractionMaxDimensionSize", "()I", "startExtractionTimeUs", "getStartExtractionTimeUs", "getTotalVideoFramesToExtract", "getVideoUriString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.c.d */
public final class C9796d {
    /* renamed from: a */
    private final long f32461a;
    /* renamed from: b */
    private final long f32462b;
    /* renamed from: c */
    private final long f32463c;
    /* renamed from: d */
    private final int f32464d;
    /* renamed from: e */
    private final long f32465e;
    /* renamed from: f */
    private final int f32466f;
    @NotNull
    /* renamed from: g */
    private final String f32467g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9796d) {
            C9796d c9796d = (C9796d) obj;
            if ((this.f32463c == c9796d.f32463c ? 1 : null) != null) {
                if ((this.f32464d == c9796d.f32464d ? 1 : null) != null) {
                    if ((this.f32465e == c9796d.f32465e ? 1 : null) != null) {
                        return (this.f32466f == c9796d.f32466f ? 1 : null) != null && C2668g.a(this.f32467g, c9796d.f32467g);
                    }
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f32463c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.f32464d) * 31;
        long j2 = this.f32465e;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f32466f) * 31;
        String str = this.f32467g;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FrameExtractionRequest(startExtractionTimeMs=");
        stringBuilder.append(this.f32463c);
        stringBuilder.append(", frameExtractionIntervalMs=");
        stringBuilder.append(this.f32464d);
        stringBuilder.append(", totalVideoFramesToExtract=");
        stringBuilder.append(this.f32465e);
        stringBuilder.append(", frameExtractionMaxDimensionSize=");
        stringBuilder.append(this.f32466f);
        stringBuilder.append(", videoUriString=");
        stringBuilder.append(this.f32467g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9796d(long j, int i, long j2, int i2, @NotNull String str) {
        C2668g.b(str, "videoUriString");
        this.f32463c = j;
        this.f32464d = i;
        this.f32465e = j2;
        this.f32466f = i2;
        this.f32467g = str;
        this.f32461a = TimeUnit.MICROSECONDS.convert(this.f32463c, TimeUnit.MILLISECONDS);
        this.f32462b = TimeUnit.MICROSECONDS.convert((long) this.f32464d, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final long m40386c() {
        return this.f32465e;
    }

    public /* synthetic */ C9796d(long j, int i, long j2, int i2, String str, int i3, C15823e c15823e) {
        this(j, i, j2, (i3 & 8) != 0 ? 1280 : i2, str);
    }

    /* renamed from: d */
    public final int m40387d() {
        return this.f32466f;
    }

    @NotNull
    /* renamed from: e */
    public final String m40388e() {
        return this.f32467g;
    }

    /* renamed from: a */
    public final long m40384a() {
        return this.f32461a;
    }

    /* renamed from: b */
    public final long m40385b() {
        return this.f32462b;
    }
}
