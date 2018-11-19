package com.tinder.loops.engine.extraction;

import com.tinder.loops.engine.extraction.p281c.C9792a;
import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "invoke"}, k = 3, mv = {1, 1, 10})
final class VideoFrameExtractionEngine$extractFramesObservable$2 extends Lambda implements Function0<C3957b<C9792a>> {
    /* renamed from: a */
    final /* synthetic */ C11939a f44513a;

    VideoFrameExtractionEngine$extractFramesObservable$2(C11939a c11939a) {
        this.f44513a = c11939a;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53748a();
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<C9792a> m53748a() {
        return this.f44513a.f38855c.startDecodingFrames();
    }
}
