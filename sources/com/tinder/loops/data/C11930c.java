package com.tinder.loops.data;

import android.arch.paging.C0054f;
import android.arch.paging.C0064k;
import com.tinder.loops.domain.repository.VideoFrameRepository;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.VideoFrameExtractor;
import com.tinder.loops.engine.extraction.retriever.VideoMetaExtractor;
import com.tinder.loops.ui.p286c.C11961b;
import com.tinder.rx.RxSchedulerProvider;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/loops/data/InMemoryVideoFrameRepository;", "Lcom/tinder/loops/domain/repository/VideoFrameRepository;", "videoFrameExtractor", "Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;", "videoMetaExtractor", "Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;", "rxSchedulerProvider", "Lcom/tinder/rx/RxSchedulerProvider;", "(Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;Lcom/tinder/rx/RxSchedulerProvider;)V", "requestFrames", "Lio/reactivex/Flowable;", "Landroid/arch/paging/PagedList;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "url", "", "maxDimension", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.data.c */
public final class C11930c implements VideoFrameRepository {
    /* renamed from: a */
    private final VideoFrameExtractor f38829a;
    /* renamed from: b */
    private final VideoMetaExtractor f38830b;
    /* renamed from: c */
    private final RxSchedulerProvider f38831c;

    @Inject
    public C11930c(@NotNull VideoFrameExtractor videoFrameExtractor, @NotNull VideoMetaExtractor videoMetaExtractor, @NotNull RxSchedulerProvider rxSchedulerProvider) {
        C2668g.b(videoFrameExtractor, "videoFrameExtractor");
        C2668g.b(videoMetaExtractor, "videoMetaExtractor");
        C2668g.b(rxSchedulerProvider, "rxSchedulerProvider");
        this.f38829a = videoFrameExtractor;
        this.f38830b = videoMetaExtractor;
        this.f38831c = rxSchedulerProvider;
    }

    @NotNull
    public C3957b<C0054f<C9770a>> requestFrames(@NotNull String str, int i) {
        C2668g.b(str, "url");
        str = new C0064k(new C11961b(this.f38829a, this.f38830b, str, i), 3).a(this.f38831c.computation()).a(BackpressureStrategy.LATEST);
        C2668g.a(str, "RxPagedListBuilder(sourc…kpressureStrategy.LATEST)");
        return str;
    }
}
