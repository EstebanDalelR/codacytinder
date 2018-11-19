package com.tinder.loops.engine.creation;

import com.tinder.loops.engine.creation.p277d.C9782b;
import com.tinder.loops.engine.creation.p277d.C9783c;
import com.tinder.loops.engine.creation.p277d.C9784d;
import com.tinder.loops.engine.creation.video.VideoCreator;
import com.tinder.loops.engine.extraction.p281c.C9795c;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import io.reactivex.C3960g;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/loops/engine/creation/LoopsCreatorEngine;", "Lcom/tinder/loops/engine/creation/LoopsCreator;", "videoCreator", "Lcom/tinder/loops/engine/creation/video/VideoCreator;", "loopsFileProvider", "Lcom/tinder/loops/engine/creation/LoopsFileProvider;", "(Lcom/tinder/loops/engine/creation/video/VideoCreator;Lcom/tinder/loops/engine/creation/LoopsFileProvider;)V", "createLoopFromFrames", "Lio/reactivex/Single;", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "loopCreationRequest", "Lcom/tinder/loops/engine/creation/model/LoopCreationRequest;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.a */
public final class C11933a implements LoopsCreator {
    /* renamed from: a */
    private final VideoCreator f38838a;
    /* renamed from: b */
    private final C9779c f38839b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.creation.a$a */
    static final class C9774a<V> implements Callable<C9782b> {
        /* renamed from: a */
        final /* synthetic */ C9782b f32412a;

        C9774a(C9782b c9782b) {
            this.f32412a = c9782b;
        }

        public /* synthetic */ Object call() {
            return m40328a();
        }

        @NotNull
        /* renamed from: a */
        public final C9782b m40328a() {
            return this.f32412a;
        }
    }

    @Inject
    public C11933a(@NotNull VideoCreator videoCreator, @NotNull C9779c c9779c) {
        C2668g.b(videoCreator, "videoCreator");
        C2668g.b(c9779c, "loopsFileProvider");
        this.f38838a = videoCreator;
        this.f38839b = c9779c;
    }

    @NotNull
    public C3960g<C9782b> createLoopFromFrames(@NotNull C9783c c9783c) {
        C2668g.b(c9783c, "loopCreationRequest");
        List a = c9783c.m40347a();
        C9795c b = c9783c.m40348b();
        File a2 = this.f38839b.m40336a();
        a = C19301m.b(a, C19301m.c(C19301m.i(a), 1));
        int min = Math.min(5242880, b.m40383b());
        C9797e a3 = c9783c.m40349c().m40339a(c9783c.m40348b().m40382a());
        String path = a2.getPath();
        C2668g.a(path, "loopOutputFile.path");
        C9782b c9782b = new C9782b(a3, min, 20, null, path, 0, 40, null);
        c9783c = this.f38838a.convertFramesIntoVideo(new C9784d(c9782b, a, c9783c.m40349c())).b(new C9774a(c9782b));
        C2668g.a(c9783c, "videoCreator.convertFram…   .toSingle { metaData }");
        return c9783c;
    }
}
