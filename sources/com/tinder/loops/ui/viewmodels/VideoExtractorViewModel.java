package com.tinder.loops.ui.viewmodels;

import android.arch.lifecycle.C2686i;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.tinder.loops.domain.repository.ExtractedFrameRepository;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.VideoFrameExtractor;
import com.tinder.loops.engine.extraction.p281c.C9794b;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import com.tinder.p258h.C9694a;
import com.tinder.rx.RxSchedulerProvider;
import com.tinder.viewmodel.TinderViewModel;
import io.reactivex.C3957b;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.processors.BehaviorProcessor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001-B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\"J \u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001dH\u0002J \u0010'\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001dH\u0002J\u0016\u0010(\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001bJ\u0006\u0010)\u001a\u00020\u0011J\u0006\u0010*\u001a\u00020\u0011J\b\u0010+\u001a\u00020\"H\u0016J\u0006\u0010,\u001a\u00020\"R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000f¨\u0006."}, d2 = {"Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel;", "Lcom/tinder/viewmodel/TinderViewModel;", "videoFrameExtractor", "Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;", "extractedFrameRepository", "Lcom/tinder/loops/domain/repository/ExtractedFrameRepository;", "schedulerProvider", "Lcom/tinder/rx/RxSchedulerProvider;", "(Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;Lcom/tinder/loops/domain/repository/ExtractedFrameRepository;Lcom/tinder/rx/RxSchedulerProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "extractedFrameContext", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "getExtractedFrameContext", "()Landroid/arch/lifecycle/MutableLiveData;", "isExtracting", "", "loopSpeed", "Landroid/arch/lifecycle/LiveData;", "Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel$LoopSpeed;", "kotlin.jvm.PlatformType", "getLoopSpeed", "()Landroid/arch/lifecycle/LiveData;", "speedProcessor", "Lio/reactivex/processors/BehaviorProcessor;", "startTimeProcessor", "", "urlProcessor", "", "videoFrames", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "getVideoFrames", "clearFrames", "", "compareAndExecuteLastRequestValues", "startTimeMs", "speed", "videoUrl", "executeExtraction", "extract", "hasExtractedFrames", "isExtractingFrame", "release", "toggleSpeed", "LoopSpeed", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public final class VideoExtractorViewModel extends TinderViewModel {
    @NotNull
    /* renamed from: a */
    private final C2686i<C9770a> f42411a = new C2686i();
    @NotNull
    /* renamed from: b */
    private final C2686i<C9794b> f42412b = new C2686i();
    /* renamed from: c */
    private final BehaviorProcessor<LoopSpeed> f42413c;
    /* renamed from: d */
    private final BehaviorProcessor<Long> f42414d;
    /* renamed from: e */
    private final BehaviorProcessor<String> f42415e;
    /* renamed from: f */
    private final C17356a f42416f;
    @NotNull
    /* renamed from: g */
    private final LiveData<LoopSpeed> f42417g;
    /* renamed from: h */
    private volatile boolean f42418h;
    /* renamed from: i */
    private final VideoFrameExtractor f42419i;
    /* renamed from: j */
    private final ExtractedFrameRepository f42420j;
    /* renamed from: k */
    private final RxSchedulerProvider f42421k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel$LoopSpeed;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SPEED_1X", "SPEED_2X", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    public enum LoopSpeed {
        ;
        
        private final int value;

        protected LoopSpeed(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Lcom/tinder/loops/ui/viewmodels/VideoExtractorViewModel$LoopSpeed;", "", "startTime", "speed", "url", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel$1 */
    static final class C119731<T1, T2, T3, R> implements Function3<Long, LoopSpeed, String, Triple<? extends Long, ? extends LoopSpeed, ? extends String>> {
        /* renamed from: a */
        public static final C119731 f38907a = new C119731();

        C119731() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            return m48005a(((Number) obj).longValue(), (LoopSpeed) obj2, (String) obj3);
        }

        @NotNull
        /* renamed from: a */
        public final Triple<Long, LoopSpeed, String> m48005a(long j, @NotNull LoopSpeed loopSpeed, @NotNull String str) {
            C2668g.b(loopSpeed, "speed");
            C2668g.b(str, "url");
            return new Triple(Long.valueOf(j), loopSpeed, str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel$3 */
    static final class C119753<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C119753 f38909a = new C119753();

        C119753() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48007a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48007a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel$a */
    static final class C11976a<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ VideoExtractorViewModel f38910a;

        C11976a(VideoExtractorViewModel videoExtractorViewModel) {
            this.f38910a = videoExtractorViewModel;
        }

        public /* synthetic */ void accept(Object obj) {
            m48008a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m48008a(Disposable disposable) {
            this.f38910a.f42418h = true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel$b */
    static final class C11977b implements Action {
        /* renamed from: a */
        final /* synthetic */ VideoExtractorViewModel f38911a;

        C11977b(VideoExtractorViewModel videoExtractorViewModel) {
            this.f38911a = videoExtractorViewModel;
        }

        public final void run() {
            this.f38911a.f42419i.release();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel$c */
    static final class C11978c<T> implements Consumer<C9794b> {
        /* renamed from: a */
        final /* synthetic */ VideoExtractorViewModel f38912a;
        /* renamed from: b */
        final /* synthetic */ long f38913b;
        /* renamed from: c */
        final /* synthetic */ LoopSpeed f38914c;
        /* renamed from: d */
        final /* synthetic */ String f38915d;

        C11978c(VideoExtractorViewModel videoExtractorViewModel, long j, LoopSpeed loopSpeed, String str) {
            this.f38912a = videoExtractorViewModel;
            this.f38913b = j;
            this.f38914c = loopSpeed;
            this.f38915d = str;
        }

        public /* synthetic */ void accept(Object obj) {
            m48009a((C9794b) obj);
        }

        /* renamed from: a */
        public final void m48009a(C9794b c9794b) {
            for (C9770a b : c9794b.m40380a()) {
                this.f38912a.m51758b().b(b);
            }
            this.f38912a.m51759c().b(c9794b);
            ExtractedFrameRepository b2 = this.f38912a.f42420j;
            C2668g.a(c9794b, "it");
            b2.update(c9794b);
            this.f38912a.f42418h = false;
            this.f38912a.m51755b(this.f38913b, this.f38914c, this.f38915d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel$d */
    static final class C11979d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ VideoExtractorViewModel f38916a;

        C11979d(VideoExtractorViewModel videoExtractorViewModel) {
            this.f38916a = videoExtractorViewModel;
        }

        public /* synthetic */ void accept(Object obj) {
            m48010a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48010a(Throwable th) {
            this.f38916a.f42418h = false;
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    /* renamed from: d */
    public void m51760d() {
    }

    @Inject
    public VideoExtractorViewModel(@NotNull VideoFrameExtractor videoFrameExtractor, @NotNull ExtractedFrameRepository extractedFrameRepository, @NotNull RxSchedulerProvider rxSchedulerProvider) {
        C2668g.b(videoFrameExtractor, "videoFrameExtractor");
        C2668g.b(extractedFrameRepository, "extractedFrameRepository");
        C2668g.b(rxSchedulerProvider, "schedulerProvider");
        this.f42419i = videoFrameExtractor;
        this.f42420j = extractedFrameRepository;
        this.f42421k = rxSchedulerProvider;
        videoFrameExtractor = BehaviorProcessor.d(LoopSpeed.SPEED_1X);
        C2668g.a(videoFrameExtractor, "BehaviorProcessor.create…fault(LoopSpeed.SPEED_1X)");
        this.f42413c = videoFrameExtractor;
        videoFrameExtractor = BehaviorProcessor.d(Long.valueOf(null));
        C2668g.a(videoFrameExtractor, "BehaviorProcessor.createDefault(0)");
        this.f42414d = videoFrameExtractor;
        videoFrameExtractor = BehaviorProcessor.d("");
        C2668g.a(videoFrameExtractor, "BehaviorProcessor.createDefault(\"\")");
        this.f42415e = videoFrameExtractor;
        this.f42416f = new C17356a();
        this.f42417g = LiveDataReactiveStreams.a(this.f42413c.g());
        C3957b.a(this.f42414d.g(), this.f42413c.g(), this.f42415e.g(), C119731.f38907a).d().a((Consumer) new Consumer<Triple<? extends Long, ? extends LoopSpeed, ? extends String>>() {
            public /* synthetic */ void accept(Object obj) {
                m48006a((Triple) obj);
            }

            /* renamed from: a */
            public final void m48006a(Triple<Long, ? extends LoopSpeed, String> triple) {
                this.m51751a(((Number) triple.a()).longValue(), (LoopSpeed) triple.b(), (String) triple.c());
            }
        }, (Consumer) C119753.f38909a);
    }

    @NotNull
    /* renamed from: b */
    public final C2686i<C9770a> m51758b() {
        return this.f42411a;
    }

    @NotNull
    /* renamed from: c */
    public final C2686i<C9794b> m51759c() {
        return this.f42412b;
    }

    @NotNull
    /* renamed from: e */
    public final LiveData<LoopSpeed> m51761e() {
        return this.f42417g;
    }

    /* renamed from: a */
    public final void m51757a(@NotNull String str, long j) {
        C2668g.b(str, "videoUrl");
        this.f42414d.onNext(Long.valueOf(j));
        this.f42415e.onNext(str);
    }

    /* renamed from: f */
    public final boolean m51762f() {
        return this.f42418h;
    }

    /* renamed from: a */
    private final void m51751a(long j, LoopSpeed loopSpeed, String str) {
        if ((((CharSequence) str).length() == 0 ? 1 : null) == null && !this.f42418h) {
            C9796d c9796d = new C9796d(j, loopSpeed.getValue(), 20, 0, str, 8, null);
            this.f42416f.a();
            this.f42416f.add(this.f42419i.observeExtractedFrameContext(c9796d).a(new C11976a(this)).b(this.f42421k.computation()).b(new C11977b(this)).a(this.f42421k.ui()).a(new C11978c(this, j, loopSpeed, str), (Consumer) new C11979d(this)));
        }
    }

    /* renamed from: b */
    private final void m51755b(long j, LoopSpeed loopSpeed, String str) {
        Long l = (Long) this.f42414d.s();
        LoopSpeed loopSpeed2 = (LoopSpeed) this.f42413c.s();
        String str2 = (String) this.f42415e.s();
        if (l != null) {
            if (l.longValue() == j && loopSpeed2 == loopSpeed && (C2668g.a(str2, str) ^ 1) == null) {
                return;
            }
        }
        j = this.f42414d.s();
        C2668g.a(j, "startTimeProcessor.value");
        j = ((Number) j).longValue();
        loopSpeed = this.f42413c.s();
        C2668g.a(loopSpeed, "speedProcessor.value");
        loopSpeed = loopSpeed;
        str = this.f42415e.s();
        C2668g.a(str, "urlProcessor.value");
        m51751a(j, loopSpeed, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    public final void m51763g() {
        /*
        r4 = this;
        r0 = r4.f42413c;
        r0 = r0.s();
        r0 = (com.tinder.loops.ui.viewmodels.VideoExtractorViewModel.LoopSpeed) r0;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0022;
    L_0x000b:
        r1 = com.tinder.loops.ui.viewmodels.C9812d.f32508a;
        r2 = r0.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x001a;
            case 2: goto L_0x0017;
            default: goto L_0x0016;
        };
    L_0x0016:
        goto L_0x0022;
    L_0x0017:
        r0 = com.tinder.loops.ui.viewmodels.VideoExtractorViewModel.LoopSpeed.SPEED_1X;
        goto L_0x001c;
    L_0x001a:
        r0 = com.tinder.loops.ui.viewmodels.VideoExtractorViewModel.LoopSpeed.SPEED_2X;
    L_0x001c:
        r1 = r4.f42413c;
        r1.onNext(r0);
        return;
    L_0x0022:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "currentSpeed has unknown value: ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        r1 = (java.lang.Throwable) r1;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.loops.ui.viewmodels.VideoExtractorViewModel.g():void");
    }
}
