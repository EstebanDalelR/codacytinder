package com.tinder.loops.engine.creation.p277d;

import com.tinder.loops.engine.extraction.p281c.C9797e;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "", "videoResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "bitRate", "", "framesPerSecond", "mimeType", "", "outputFilePath", "keyFrameInterval", "(Lcom/tinder/loops/engine/extraction/model/Resolution;IILjava/lang/String;Ljava/lang/String;I)V", "getBitRate", "()I", "getFramesPerSecond", "getKeyFrameInterval", "getMimeType", "()Ljava/lang/String;", "getOutputFilePath", "getVideoResolution", "()Lcom/tinder/loops/engine/extraction/model/Resolution;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.d.b */
public final class C9782b {
    @NotNull
    /* renamed from: a */
    private final C9797e f32423a;
    /* renamed from: b */
    private final int f32424b;
    /* renamed from: c */
    private final int f32425c;
    @NotNull
    /* renamed from: d */
    private final String f32426d;
    @NotNull
    /* renamed from: e */
    private final String f32427e;
    /* renamed from: f */
    private final int f32428f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9782b) {
            C9782b c9782b = (C9782b) obj;
            if (C2668g.a(this.f32423a, c9782b.f32423a)) {
                if ((this.f32424b == c9782b.f32424b ? 1 : null) != null) {
                    if ((this.f32425c == c9782b.f32425c ? 1 : null) != null && C2668g.a(this.f32426d, c9782b.f32426d) && C2668g.a(this.f32427e, c9782b.f32427e)) {
                        if ((this.f32428f == c9782b.f32428f ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        C9797e c9797e = this.f32423a;
        int i = 0;
        int hashCode = (((((c9797e != null ? c9797e.hashCode() : 0) * 31) + this.f32424b) * 31) + this.f32425c) * 31;
        String str = this.f32426d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f32427e;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.f32428f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EncoderVideoMeta(videoResolution=");
        stringBuilder.append(this.f32423a);
        stringBuilder.append(", bitRate=");
        stringBuilder.append(this.f32424b);
        stringBuilder.append(", framesPerSecond=");
        stringBuilder.append(this.f32425c);
        stringBuilder.append(", mimeType=");
        stringBuilder.append(this.f32426d);
        stringBuilder.append(", outputFilePath=");
        stringBuilder.append(this.f32427e);
        stringBuilder.append(", keyFrameInterval=");
        stringBuilder.append(this.f32428f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9782b(@NotNull C9797e c9797e, int i, int i2, @NotNull String str, @NotNull String str2, int i3) {
        C2668g.b(c9797e, "videoResolution");
        C2668g.b(str, "mimeType");
        C2668g.b(str2, "outputFilePath");
        this.f32423a = c9797e;
        this.f32424b = i;
        this.f32425c = i2;
        this.f32426d = str;
        this.f32427e = str2;
        this.f32428f = i3;
    }

    @NotNull
    /* renamed from: a */
    public final C9797e m40341a() {
        return this.f32423a;
    }

    /* renamed from: b */
    public final int m40342b() {
        return this.f32424b;
    }

    /* renamed from: c */
    public final int m40343c() {
        return this.f32425c;
    }

    @NotNull
    /* renamed from: d */
    public final String m40344d() {
        return this.f32426d;
    }

    @NotNull
    /* renamed from: e */
    public final String m40345e() {
        return this.f32427e;
    }

    public /* synthetic */ C9782b(C9797e c9797e, int i, int i2, String str, String str2, int i3, int i4, C15823e c15823e) {
        if ((i4 & 8) != null) {
            str = "video/avc";
        }
        this(c9797e, i, i2, str, str2, (i4 & 32) != null ? 5 : i3);
    }

    /* renamed from: f */
    public final int m40346f() {
        return this.f32428f;
    }
}
