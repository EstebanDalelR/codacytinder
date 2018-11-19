package com.tinder.loops.engine.extraction.p281c;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "", "sourceVideoUri", "", "frameResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "sourceVideoBitRate", "", "(Ljava/lang/String;Lcom/tinder/loops/engine/extraction/model/Resolution;I)V", "getFrameResolution", "()Lcom/tinder/loops/engine/extraction/model/Resolution;", "getSourceVideoBitRate", "()I", "getSourceVideoUri", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.c.c */
public final class C9795c {
    @NotNull
    /* renamed from: a */
    private final String f32458a;
    @NotNull
    /* renamed from: b */
    private final C9797e f32459b;
    /* renamed from: c */
    private final int f32460c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9795c) {
            C9795c c9795c = (C9795c) obj;
            if (C2668g.a(this.f32458a, c9795c.f32458a) && C2668g.a(this.f32459b, c9795c.f32459b)) {
                if ((this.f32460c == c9795c.f32460c ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f32458a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C9797e c9797e = this.f32459b;
        if (c9797e != null) {
            i = c9797e.hashCode();
        }
        return ((hashCode + i) * 31) + this.f32460c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtractedFrameInfo(sourceVideoUri=");
        stringBuilder.append(this.f32458a);
        stringBuilder.append(", frameResolution=");
        stringBuilder.append(this.f32459b);
        stringBuilder.append(", sourceVideoBitRate=");
        stringBuilder.append(this.f32460c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9795c(@NotNull String str, @NotNull C9797e c9797e, int i) {
        C2668g.b(str, "sourceVideoUri");
        C2668g.b(c9797e, "frameResolution");
        this.f32458a = str;
        this.f32459b = c9797e;
        this.f32460c = i;
    }

    @NotNull
    /* renamed from: a */
    public final C9797e m40382a() {
        return this.f32459b;
    }

    /* renamed from: b */
    public final int m40383b() {
        return this.f32460c;
    }
}
