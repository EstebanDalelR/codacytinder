package com.tinder.loops.engine.extraction.p283e;

import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import com.tinder.p260i.C9706a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.p459b.C18450a;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/loops/engine/extraction/resolution/VideoFrameResolutionSelector;", "", "()V", "selectFrameResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "videoResolution", "maxDimensionSize", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.e.a */
public final class C9803a {
    @NotNull
    /* renamed from: a */
    public final C9797e m40425a(@NotNull C9797e c9797e, int i) {
        C2668g.b(c9797e, "videoResolution");
        C9706a.m40168a(i > 0, (Exception) new LoopsEngineExtractionException("Error max dimension size must be greater than zero!"));
        if (c9797e.m40389a() <= i && c9797e.m40390b() <= i) {
            return c9797e;
        }
        float b = ((float) c9797e.m40390b()) / ((float) c9797e.m40389a());
        if (c9797e.m40389a() > c9797e.m40390b()) {
            return new C9797e(i, C18450a.a(((float) i) * b));
        }
        return new C9797e(C18450a.a(((float) i) / b), i);
    }
}
