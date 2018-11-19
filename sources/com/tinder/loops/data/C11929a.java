package com.tinder.loops.data;

import com.tinder.loops.domain.repository.ExtractedFrameRepository;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.p281c.C9794b;
import io.reactivex.C3960g;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/loops/data/ExtractedFrameInMemoryRepository;", "Lcom/tinder/loops/domain/repository/ExtractedFrameRepository;", "()V", "extractedFrameContextProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "kotlin.jvm.PlatformType", "threadSafeExtractedFramesProcessor", "Lio/reactivex/processors/FlowableProcessor;", "clear", "", "hasExtractedFrames", "", "observeExtractedFrames", "Lio/reactivex/Single;", "update", "extractedFrameContext", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.data.a */
public final class C11929a implements ExtractedFrameRepository {
    /* renamed from: a */
    private final BehaviorProcessor<C9794b> f38827a = BehaviorProcessor.d(C9794b.f32453a.m40378a());
    /* renamed from: b */
    private final C18430a<C9794b> f38828b = this.f38827a.u();

    @NotNull
    public C3960g<C9794b> observeExtractedFrames() {
        C3960g<C9794b> f = this.f38828b.g().f();
        C2668g.a(f, "threadSafeExtractedFrame…sor.hide().firstOrError()");
        return f;
    }

    public boolean hasExtractedFrames() {
        boolean z;
        synchronized (this) {
            z = true;
            if (this.f38827a.t()) {
                BehaviorProcessor behaviorProcessor = this.f38827a;
                C2668g.a(behaviorProcessor, "extractedFrameContextProcessor");
                if ((C2668g.a((C9794b) behaviorProcessor.s(), C9794b.f32453a.m40378a()) ^ 1) != 0) {
                }
            }
            z = false;
        }
        return z;
    }

    public void update(@NotNull C9794b c9794b) {
        C2668g.b(c9794b, "extractedFrameContext");
        this.f38828b.onNext(c9794b);
    }

    public void clear() {
        synchronized (this) {
            BehaviorProcessor behaviorProcessor = this.f38827a;
            C2668g.a(behaviorProcessor, "extractedFrameContextProcessor");
            for (C9770a a : ((C9794b) behaviorProcessor.s()).m40380a()) {
                a.m40314a().recycle();
            }
            C15813i c15813i = C15813i.f49016a;
        }
        this.f38828b.onNext(C9794b.f32453a.m40378a());
    }
}
