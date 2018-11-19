package com.tinder.loops.engine.creation.p277d;

import com.tinder.loops.engine.common.p273b.C9770a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tinder/loops/engine/creation/model/VideoCreationRequest;", "", "videoMeta", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "frames", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "cropRectangle", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "(Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;Ljava/util/List;Lcom/tinder/loops/engine/creation/model/CroppingRectangle;)V", "getCropRectangle", "()Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "getFrames", "()Ljava/util/List;", "getVideoMeta", "()Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.d.d */
public final class C9784d {
    @NotNull
    /* renamed from: a */
    private final C9782b f32432a;
    @NotNull
    /* renamed from: b */
    private final List<C9770a> f32433b;
    @NotNull
    /* renamed from: c */
    private final C9781a f32434c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9784d) {
                C9784d c9784d = (C9784d) obj;
                if (C2668g.a(this.f32432a, c9784d.f32432a) && C2668g.a(this.f32433b, c9784d.f32433b) && C2668g.a(this.f32434c, c9784d.f32434c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C9782b c9782b = this.f32432a;
        int i = 0;
        int hashCode = (c9782b != null ? c9782b.hashCode() : 0) * 31;
        List list = this.f32433b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C9781a c9781a = this.f32434c;
        if (c9781a != null) {
            i = c9781a.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VideoCreationRequest(videoMeta=");
        stringBuilder.append(this.f32432a);
        stringBuilder.append(", frames=");
        stringBuilder.append(this.f32433b);
        stringBuilder.append(", cropRectangle=");
        stringBuilder.append(this.f32434c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9784d(@NotNull C9782b c9782b, @NotNull List<C9770a> list, @NotNull C9781a c9781a) {
        C2668g.b(c9782b, "videoMeta");
        C2668g.b(list, "frames");
        C2668g.b(c9781a, "cropRectangle");
        this.f32432a = c9782b;
        this.f32433b = list;
        this.f32434c = c9781a;
    }

    @NotNull
    /* renamed from: a */
    public final C9782b m40350a() {
        return this.f32432a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C9770a> m40351b() {
        return this.f32433b;
    }

    @NotNull
    /* renamed from: c */
    public final C9781a m40352c() {
        return this.f32434c;
    }
}
