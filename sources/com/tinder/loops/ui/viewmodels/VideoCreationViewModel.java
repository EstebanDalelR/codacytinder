package com.tinder.loops.ui.viewmodels;

import android.arch.lifecycle.C2686i;
import com.tinder.exception.LoopsEngineCreationException;
import com.tinder.loops.data.CroppingRectangleRepository;
import com.tinder.loops.domain.repository.ExtractedFrameRepository;
import com.tinder.loops.engine.creation.LoopsCreator;
import com.tinder.loops.engine.creation.p277d.C9781a;
import com.tinder.loops.engine.creation.p277d.C9782b;
import com.tinder.loops.engine.creation.p277d.C9783c;
import com.tinder.loops.engine.extraction.p281c.C9794b;
import com.tinder.p258h.C9694a;
import com.tinder.p260i.C9706a;
import com.tinder.rx.RxSchedulerProvider;
import com.tinder.viewmodel.TinderViewModel;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/tinder/loops/ui/viewmodels/VideoCreationViewModel;", "Lcom/tinder/viewmodel/TinderViewModel;", "loopsCreator", "Lcom/tinder/loops/engine/creation/LoopsCreator;", "extractedFrameRepository", "Lcom/tinder/loops/domain/repository/ExtractedFrameRepository;", "schedulerProvider", "Lcom/tinder/rx/RxSchedulerProvider;", "croppingRectangleRepository", "Lcom/tinder/loops/data/CroppingRectangleRepository;", "(Lcom/tinder/loops/engine/creation/LoopsCreator;Lcom/tinder/loops/domain/repository/ExtractedFrameRepository;Lcom/tinder/rx/RxSchedulerProvider;Lcom/tinder/loops/data/CroppingRectangleRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "video", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "getVideo", "()Landroid/arch/lifecycle/MutableLiveData;", "create", "", "release", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public final class VideoCreationViewModel extends TinderViewModel {
    @NotNull
    /* renamed from: a */
    private final C2686i<C9782b> f42402a = new C2686i();
    /* renamed from: b */
    private final C17356a f42403b = new C17356a();
    /* renamed from: c */
    private final LoopsCreator f42404c;
    /* renamed from: d */
    private final ExtractedFrameRepository f42405d;
    /* renamed from: e */
    private final RxSchedulerProvider f42406e;
    /* renamed from: f */
    private final CroppingRectangleRepository f42407f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/loops/engine/creation/model/LoopCreationRequest;", "extractedFramesAndInfo", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "croppingRectangle", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoCreationViewModel$a */
    static final class C11967a<T1, T2, R> implements BiFunction<C9794b, C9781a, C9783c> {
        /* renamed from: a */
        public static final C11967a f38901a = new C11967a();

        C11967a() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47999a((C9794b) obj, (C9781a) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C9783c m47999a(@NotNull C9794b c9794b, @NotNull C9781a c9781a) {
            C2668g.b(c9794b, "extractedFramesAndInfo");
            C2668g.b(c9781a, "croppingRectangle");
            return new C9783c(c9794b.m40380a(), c9794b.m40381b(), c9781a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "it", "Lcom/tinder/loops/engine/creation/model/LoopCreationRequest;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoCreationViewModel$b */
    static final class C11968b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ VideoCreationViewModel f38902a;

        C11968b(VideoCreationViewModel videoCreationViewModel) {
            this.f38902a = videoCreationViewModel;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48000a((C9783c) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<C9782b> m48000a(@NotNull C9783c c9783c) {
            C2668g.b(c9783c, "it");
            return this.f38902a.f42404c.createLoopFromFrames(c9783c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/engine/creation/model/EncoderVideoMeta;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoCreationViewModel$c */
    static final class C11969c<T> implements Consumer<C9782b> {
        /* renamed from: a */
        final /* synthetic */ VideoCreationViewModel f38903a;

        C11969c(VideoCreationViewModel videoCreationViewModel) {
            this.f38903a = videoCreationViewModel;
        }

        public /* synthetic */ void accept(Object obj) {
            m48001a((C9782b) obj);
        }

        /* renamed from: a */
        public final void m48001a(C9782b c9782b) {
            this.f38903a.m51743b().b(c9782b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoCreationViewModel$d */
    static final class C11970d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11970d f38904a = new C11970d();

        C11970d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48002a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48002a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Inject
    public VideoCreationViewModel(@NotNull LoopsCreator loopsCreator, @NotNull ExtractedFrameRepository extractedFrameRepository, @NotNull RxSchedulerProvider rxSchedulerProvider, @NotNull CroppingRectangleRepository croppingRectangleRepository) {
        C2668g.b(loopsCreator, "loopsCreator");
        C2668g.b(extractedFrameRepository, "extractedFrameRepository");
        C2668g.b(rxSchedulerProvider, "schedulerProvider");
        C2668g.b(croppingRectangleRepository, "croppingRectangleRepository");
        this.f42404c = loopsCreator;
        this.f42405d = extractedFrameRepository;
        this.f42406e = rxSchedulerProvider;
        this.f42407f = croppingRectangleRepository;
    }

    @NotNull
    /* renamed from: b */
    public final C2686i<C9782b> m51743b() {
        return this.f42402a;
    }

    /* renamed from: c */
    public final void m51744c() {
        C9706a.m40168a(this.f42405d.hasExtractedFrames(), (Exception) new LoopsEngineCreationException("There is no valid frames to create Loop videos"));
        this.f42403b.add(this.f42405d.observeExtractedFrames().a(this.f42407f.observeCroppingRectangle().f(), C11967a.f38901a).a(new C11968b(this)).b(this.f42406e.computation()).a(this.f42406e.ui()).a(new C11969c(this), C11970d.f38904a));
    }

    /* renamed from: d */
    public void m51745d() {
        this.f42403b.a();
    }
}
