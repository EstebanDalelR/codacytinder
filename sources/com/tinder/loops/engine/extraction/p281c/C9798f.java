package com.tinder.loops.engine.extraction.p281c;

import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/tinder/loops/engine/extraction/model/VideoMeta;", "", "resolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "bitRate", "", "duration", "", "unappliedRotation", "fileSizeInBytes", "(Lcom/tinder/loops/engine/extraction/model/Resolution;IJIJ)V", "getBitRate", "()I", "getDuration", "()J", "getFileSizeInBytes", "resolutionAfterRotation", "getResolutionAfterRotation", "()Lcom/tinder/loops/engine/extraction/model/Resolution;", "getUnappliedRotation", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.c.f */
public final class C9798f {
    @NotNull
    /* renamed from: a */
    private final C9797e f32470a;
    /* renamed from: b */
    private final C9797e f32471b;
    /* renamed from: c */
    private final int f32472c;
    /* renamed from: d */
    private final long f32473d;
    /* renamed from: e */
    private final int f32474e;
    /* renamed from: f */
    private final long f32475f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9798f) {
            C9798f c9798f = (C9798f) obj;
            if (C2668g.a(this.f32471b, c9798f.f32471b)) {
                if ((this.f32472c == c9798f.f32472c ? 1 : null) != null) {
                    if ((this.f32473d == c9798f.f32473d ? 1 : null) != null) {
                        if ((this.f32474e == c9798f.f32474e ? 1 : null) != null) {
                            if ((this.f32475f == c9798f.f32475f ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        C9797e c9797e = this.f32471b;
        int hashCode = (((c9797e != null ? c9797e.hashCode() : 0) * 31) + this.f32472c) * 31;
        long j = this.f32473d;
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f32474e) * 31;
        j = this.f32475f;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoMeta(resolution=");
        stringBuilder.append(this.f32471b);
        stringBuilder.append(", bitRate=");
        stringBuilder.append(this.f32472c);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.f32473d);
        stringBuilder.append(", unappliedRotation=");
        stringBuilder.append(this.f32474e);
        stringBuilder.append(", fileSizeInBytes=");
        stringBuilder.append(this.f32475f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9798f(@NotNull C9797e c9797e, int i, long j, int i2, long j2) {
        C2668g.b(c9797e, "resolution");
        this.f32471b = c9797e;
        this.f32472c = i;
        this.f32473d = j;
        this.f32474e = i2;
        this.f32475f = j2;
        c9797e = this.f32471b;
        i = Math.min(c9797e.m40389a(), c9797e.m40390b());
        j = Math.max(c9797e.m40389a(), c9797e.m40390b());
        if ((c9797e.m40390b() > c9797e.m40389a() ? true : null) != null) {
            c9797e = ak.a(new Integer[]{Integer.valueOf(0), Integer.valueOf(180)}).contains(Integer.valueOf(this.f32474e));
        } else {
            c9797e = ak.a(new Integer[]{Integer.valueOf(90), Integer.valueOf(270)}).contains(Integer.valueOf(this.f32474e));
        }
        if (c9797e != null) {
            c9797e = new C9797e(i, j);
        } else {
            c9797e = new C9797e(j, i);
        }
        this.f32470a = c9797e;
    }

    /* renamed from: b */
    public final int m40392b() {
        return this.f32472c;
    }

    /* renamed from: c */
    public final long m40393c() {
        return this.f32473d;
    }

    /* renamed from: d */
    public final int m40394d() {
        return this.f32474e;
    }

    @NotNull
    /* renamed from: a */
    public final C9797e m40391a() {
        return this.f32470a;
    }
}
