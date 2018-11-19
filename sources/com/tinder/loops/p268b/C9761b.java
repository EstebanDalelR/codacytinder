package com.tinder.loops.p268b;

import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.LoopsFilterVideoTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewedStatus;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewedStatus;
import com.tinder.loops.analytics.C11912a;
import com.tinder.loops.analytics.C11912a.C9759a;
import com.tinder.loops.analytics.TutorialAction;
import com.tinder.loops.analytics.TutorialContext;
import com.tinder.loops.analytics.TutorialName;
import com.tinder.loops.analytics.TutorialType;
import com.tinder.loops.p269c.C9763a;
import com.tinder.loops.target.C11950b;
import com.tinder.loops.target.MediaSelectorViewTarget;
import com.tinder.loops.views.MediaTabsView.MediaTab;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/loops/presenter/MediaSelectorViewPresenter;", "", "mediaTabSelectedProvider", "Lcom/tinder/loops/provider/MediaTabSelectedProvider;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewedStatus;", "addAppTutorialMediaSelectorEvent", "Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewedStatus;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "(Lcom/tinder/loops/provider/MediaTabSelectedProvider;Lcom/tinder/domain/profile/usecase/CheckTutorialViewedStatus;Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewedStatus;Lcom/tinder/common/reactivex/schedulers/Schedulers;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/loops/target/MediaSelectorViewTarget;", "tutorial", "Lcom/tinder/domain/profile/model/Tutorial;", "checkShowTooltip", "", "tooltipAction", "Lcom/tinder/loops/analytics/TutorialAction;", "drop", "observeTabSelections", "sendAppTutorialEvent", "action", "take", "loops_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.b.b */
public final class C9761b {
    /* renamed from: a */
    private MediaSelectorViewTarget f32385a = ((MediaSelectorViewTarget) new C11950b());
    /* renamed from: b */
    private final C17356a f32386b = new C17356a();
    /* renamed from: c */
    private final Tutorial f32387c = ((Tutorial) LoopsFilterVideoTooltip.INSTANCE);
    /* renamed from: d */
    private final C9763a f32388d;
    /* renamed from: e */
    private final CheckTutorialViewedStatus f32389e;
    /* renamed from: f */
    private final C11912a f32390f;
    /* renamed from: g */
    private final ConfirmTutorialsViewedStatus f32391g;
    /* renamed from: h */
    private final Schedulers f32392h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$a */
    static final class C11915a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11915a f38813a = new C11915a();

        C11915a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m47920a((TutorialViewStatus) obj));
        }

        /* renamed from: a */
        public final boolean m47920a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$b */
    static final class C11916b<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C11916b f38814a = new C11916b();

        C11916b() {
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m47921a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47921a((Boolean) obj).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$c */
    static final class C11917c<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9761b f38815a;

        C11917c(C9761b c9761b) {
            this.f38815a = c9761b;
        }

        public /* synthetic */ void accept(Object obj) {
            m47922a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m47922a(Boolean bool) {
            this.f38815a.f32385a.showMediaTooltip();
            this.f38815a.m40284b(TutorialAction.SHOW);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$d */
    static final class C11918d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11918d f38816a = new C11918d();

        C11918d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47923a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47923a(Throwable th) {
            C0001a.c(th, "Error observing check tutorial status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$e */
    static final class C11919e implements Action {
        /* renamed from: a */
        public static final C11919e f38817a = new C11919e();

        C11919e() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$f */
    static final class C11920f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11920f f38818a = new C11920f();

        C11920f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47924a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47924a(Throwable th) {
            C0001a.c(th, "Error confirming tutorial status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$g */
    static final class C11921g<T> implements Predicate<MediaTab> {
        /* renamed from: a */
        public static final C11921g f38819a = new C11921g();

        C11921g() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47925a((MediaTab) obj);
        }

        /* renamed from: a */
        public final boolean m47925a(@NotNull MediaTab mediaTab) {
            C2668g.b(mediaTab, "it");
            return mediaTab == MediaTab.VIDEOS ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/loops/views/MediaTabsView$MediaTab;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$h */
    static final class C11922h<T> implements Consumer<MediaTab> {
        /* renamed from: a */
        final /* synthetic */ C9761b f38820a;

        C11922h(C9761b c9761b) {
            this.f38820a = c9761b;
        }

        public /* synthetic */ void accept(Object obj) {
            m47926a((MediaTab) obj);
        }

        /* renamed from: a */
        public final void m47926a(MediaTab mediaTab) {
            this.f38820a.f32385a.dismissTooltip(TutorialAction.TAP_BUTTON);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.b.b$i */
    static final class C11923i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11923i f38821a = new C11923i();

        C11923i() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47927a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47927a(Throwable th) {
            C0001a.c(th, "Error observing tab selection events", new Object[0]);
        }
    }

    @Inject
    public C9761b(@NotNull C9763a c9763a, @NotNull CheckTutorialViewedStatus checkTutorialViewedStatus, @NotNull C11912a c11912a, @NotNull ConfirmTutorialsViewedStatus confirmTutorialsViewedStatus, @NotNull Schedulers schedulers) {
        C2668g.b(c9763a, "mediaTabSelectedProvider");
        C2668g.b(checkTutorialViewedStatus, "checkTutorialViewed");
        C2668g.b(c11912a, "addAppTutorialMediaSelectorEvent");
        C2668g.b(confirmTutorialsViewedStatus, "confirmTutorialsViewed");
        C2668g.b(schedulers, "schedulers");
        this.f32388d = c9763a;
        this.f32389e = checkTutorialViewedStatus;
        this.f32390f = c11912a;
        this.f32391g = confirmTutorialsViewedStatus;
        this.f32392h = schedulers;
    }

    /* renamed from: a */
    public final void m40288a(@NotNull MediaSelectorViewTarget mediaSelectorViewTarget) {
        C2668g.b(mediaSelectorViewTarget, "target");
        this.f32385a = mediaSelectorViewTarget;
        m40283b();
        m40285c();
    }

    /* renamed from: a */
    public final void m40286a() {
        this.f32385a = new C11950b();
        this.f32386b.a();
    }

    /* renamed from: a */
    public final void m40287a(@NotNull TutorialAction tutorialAction) {
        C2668g.b(tutorialAction, "tooltipAction");
        m40284b(tutorialAction);
        this.f32391g.execute(this.f32387c).b(this.f32392h.io()).a(C11919e.f38817a, C11920f.f38818a);
    }

    /* renamed from: b */
    private final void m40283b() {
        this.f32386b.add(this.f32389e.execute(this.f32387c).e(C11915a.f38813a).a(C11916b.f38814a).b(this.f32392h.io()).a(this.f32392h.mainThread()).a(new C11917c(this), C11918d.f38816a));
    }

    /* renamed from: c */
    private final void m40285c() {
        this.f32386b.add(this.f32388d.m40294a().filter(C11921g.f38819a).subscribeOn(this.f32392h.io()).observeOn(this.f32392h.mainThread()).subscribe(new C11922h(this), C11923i.f38821a));
    }

    /* renamed from: b */
    private final void m40284b(TutorialAction tutorialAction) {
        this.f32390f.m47917a(new C9759a(tutorialAction, TutorialContext.MEDIA_SELECTOR, TutorialName.LOOPS_FILTER_VIDEO_TOOLTIP, TutorialType.TOOLTIP));
    }
}
