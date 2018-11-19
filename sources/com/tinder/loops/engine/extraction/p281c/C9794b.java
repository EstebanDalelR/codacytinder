package com.tinder.loops.engine.extraction.p281c;

import com.tinder.loops.engine.common.p273b.C9770a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "", "videoFrames", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "extractedFrameInfo", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "(Ljava/util/List;Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;)V", "getExtractedFrameInfo", "()Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "getVideoFrames", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.c.b */
public final class C9794b {
    /* renamed from: a */
    public static final C9793a f32453a = new C9793a();
    /* renamed from: d */
    private static final C9795c f32454d = new C9795c("", new C9797e(1, 1), 1);
    @NotNull
    /* renamed from: e */
    private static final C9794b f32455e = new C9794b(C19301m.a(), f32454d);
    @NotNull
    /* renamed from: b */
    private final List<C9770a> f32456b;
    @NotNull
    /* renamed from: c */
    private final C9795c f32457c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext$Companion;", "", "()V", "EMPTY_FRAME_INFO", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "getEMPTY_FRAME_INFO", "()Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "EMPTY_INFO", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.extraction.c.b$a */
    public static final class C9793a {
        private C9793a() {
        }

        @NotNull
        /* renamed from: a */
        public final C9794b m40378a() {
            return C9794b.f32455e;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9794b) {
                C9794b c9794b = (C9794b) obj;
                if (C2668g.a(this.f32456b, c9794b.f32456b) && C2668g.a(this.f32457c, c9794b.f32457c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.f32456b;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C9795c c9795c = this.f32457c;
        if (c9795c != null) {
            i = c9795c.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtractedFrameContext(videoFrames=");
        stringBuilder.append(this.f32456b);
        stringBuilder.append(", extractedFrameInfo=");
        stringBuilder.append(this.f32457c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9794b(@NotNull List<C9770a> list, @NotNull C9795c c9795c) {
        C2668g.b(list, "videoFrames");
        C2668g.b(c9795c, "extractedFrameInfo");
        this.f32456b = list;
        this.f32457c = c9795c;
    }

    @NotNull
    /* renamed from: a */
    public final List<C9770a> m40380a() {
        return this.f32456b;
    }

    @NotNull
    /* renamed from: b */
    public final C9795c m40381b() {
        return this.f32457c;
    }
}
