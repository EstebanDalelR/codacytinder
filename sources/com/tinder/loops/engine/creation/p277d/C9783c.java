package com.tinder.loops.engine.creation.p277d;

import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.p281c.C9795c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tinder/loops/engine/creation/model/LoopCreationRequest;", "", "videoFrames", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "extractedFrameInfo", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "croppingRectangle", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "(Ljava/util/List;Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;Lcom/tinder/loops/engine/creation/model/CroppingRectangle;)V", "getCroppingRectangle", "()Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "getExtractedFrameInfo", "()Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "getVideoFrames", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.d.c */
public final class C9783c {
    @NotNull
    /* renamed from: a */
    private final List<C9770a> f32429a;
    @NotNull
    /* renamed from: b */
    private final C9795c f32430b;
    @NotNull
    /* renamed from: c */
    private final C9781a f32431c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9783c) {
                C9783c c9783c = (C9783c) obj;
                if (C2668g.a(this.f32429a, c9783c.f32429a) && C2668g.a(this.f32430b, c9783c.f32430b) && C2668g.a(this.f32431c, c9783c.f32431c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.f32429a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C9795c c9795c = this.f32430b;
        hashCode = (hashCode + (c9795c != null ? c9795c.hashCode() : 0)) * 31;
        C9781a c9781a = this.f32431c;
        if (c9781a != null) {
            i = c9781a.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LoopCreationRequest(videoFrames=");
        stringBuilder.append(this.f32429a);
        stringBuilder.append(", extractedFrameInfo=");
        stringBuilder.append(this.f32430b);
        stringBuilder.append(", croppingRectangle=");
        stringBuilder.append(this.f32431c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9783c(@NotNull List<C9770a> list, @NotNull C9795c c9795c, @NotNull C9781a c9781a) {
        C2668g.b(list, "videoFrames");
        C2668g.b(c9795c, "extractedFrameInfo");
        C2668g.b(c9781a, "croppingRectangle");
        this.f32429a = list;
        this.f32430b = c9795c;
        this.f32431c = c9781a;
    }

    @NotNull
    /* renamed from: a */
    public final List<C9770a> m40347a() {
        return this.f32429a;
    }

    @NotNull
    /* renamed from: b */
    public final C9795c m40348b() {
        return this.f32430b;
    }

    @NotNull
    /* renamed from: c */
    public final C9781a m40349c() {
        return this.f32431c;
    }
}
