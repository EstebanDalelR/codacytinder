package com.tinder.loops.ui.viewmodels;

import android.arch.lifecycle.C2686i;
import android.arch.paging.C0054f;
import com.tinder.loops.domain.repository.VideoFrameRepository;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.p258h.C9694a;
import com.tinder.rx.RxSchedulerProvider;
import com.tinder.viewmodel.TinderViewModel;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/tinder/loops/ui/viewmodels/VideoFrameViewModel;", "Lcom/tinder/viewmodel/TinderViewModel;", "videoFrameRepository", "Lcom/tinder/loops/domain/repository/VideoFrameRepository;", "schedulerProvider", "Lcom/tinder/rx/RxSchedulerProvider;", "(Lcom/tinder/loops/domain/repository/VideoFrameRepository;Lcom/tinder/rx/RxSchedulerProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "videoFrames", "Landroid/arch/lifecycle/MutableLiveData;", "Landroid/arch/paging/PagedList;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "getVideoFrames", "()Landroid/arch/lifecycle/MutableLiveData;", "release", "", "requestTimelineFrames", "url", "", "maxDimension", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public final class VideoFrameViewModel extends TinderViewModel {
    @NotNull
    /* renamed from: a */
    private final C2686i<C0054f<C9770a>> f42422a = new C2686i();
    /* renamed from: b */
    private final C17356a f42423b = new C17356a();
    /* renamed from: c */
    private final VideoFrameRepository f42424c;
    /* renamed from: d */
    private final RxSchedulerProvider f42425d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/arch/paging/PagedList;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoFrameViewModel$a */
    static final class C11980a<T> implements Consumer<C0054f<C9770a>> {
        /* renamed from: a */
        final /* synthetic */ VideoFrameViewModel f38917a;

        C11980a(VideoFrameViewModel videoFrameViewModel) {
            this.f38917a = videoFrameViewModel;
        }

        public /* synthetic */ void accept(Object obj) {
            m48011a((C0054f) obj);
        }

        /* renamed from: a */
        public final void m48011a(C0054f<C9770a> c0054f) {
            this.f38917a.m51765b().b(c0054f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoFrameViewModel$b */
    static final class C11981b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11981b f38918a = new C11981b();

        C11981b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48012a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48012a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Inject
    public VideoFrameViewModel(@NotNull VideoFrameRepository videoFrameRepository, @NotNull RxSchedulerProvider rxSchedulerProvider) {
        C2668g.b(videoFrameRepository, "videoFrameRepository");
        C2668g.b(rxSchedulerProvider, "schedulerProvider");
        this.f42424c = videoFrameRepository;
        this.f42425d = rxSchedulerProvider;
    }

    @NotNull
    /* renamed from: b */
    public final C2686i<C0054f<C9770a>> m51765b() {
        return this.f42422a;
    }

    /* renamed from: a */
    public final void m51764a(@NotNull String str, int i) {
        C2668g.b(str, "url");
        this.f42423b.add(this.f42424c.requestFrames(str, i).b(this.f42425d.io()).a(this.f42425d.ui()).a((Consumer) new C11980a(this), C11981b.f38918a));
    }

    /* renamed from: d */
    public void m51766d() {
        this.f42423b.a();
    }
}
