package com.tinder.boost.presenter;

import com.tinder.boost.model.BoostState;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p178a.C8337b;
import com.tinder.boost.p179b.C10403e;
import com.tinder.boost.p179b.C8338a;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.target.BoostButtonTarget;
import com.tinder.boost.view.BoostButtonView$AnalyticsSource;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.paywall.legacy.BoostPaywallSource;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.utils.RxUtils;
import io.reactivex.C3960g;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0007J\u0006\u0010$\u001a\u00020\"J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u000e\u00101\u001a\u00020\"2\u0006\u00101\u001a\u00020\u001aJ\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00064"}, d2 = {"Lcom/tinder/boost/presenter/BoostButtonPresenter;", "", "boostStateProvider", "Lcom/tinder/boost/provider/BoostStateProvider;", "activateBoost", "Lcom/tinder/boost/usecase/ActivateBoost;", "boostUpdateProvider", "Lcom/tinder/boost/provider/BoostUpdateProvider;", "boostAnalyticsInteractor", "Lcom/tinder/boost/interactor/BoostAnalyticsInteractor;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "checkBoostPaywallTutorial", "Lcom/tinder/boost/usecase/CheckBoostPaywallTutorial;", "(Lcom/tinder/boost/provider/BoostStateProvider;Lcom/tinder/boost/usecase/ActivateBoost;Lcom/tinder/boost/provider/BoostUpdateProvider;Lcom/tinder/boost/interactor/BoostAnalyticsInteractor;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/boost/usecase/CheckBoostPaywallTutorial;)V", "analyticsSource", "Lcom/tinder/boost/view/BoostButtonView$AnalyticsSource;", "getAnalyticsSource", "()Lcom/tinder/boost/view/BoostButtonView$AnalyticsSource;", "setAnalyticsSource", "(Lcom/tinder/boost/view/BoostButtonView$AnalyticsSource;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isShowingPaywall", "", "target", "Lcom/tinder/boost/target/BoostButtonTarget;", "getTarget$Tinder_release", "()Lcom/tinder/boost/target/BoostButtonTarget;", "setTarget$Tinder_release", "(Lcom/tinder/boost/target/BoostButtonTarget;)V", "attachBoostEmitterIfNecessary", "", "dropSubscriptions", "handleBoostButtonClicked", "handleBoostStatusChanged", "boostStatus", "Lcom/tinder/domain/boost/model/BoostStatus;", "onBoostMultiplierChange", "multiplier", "", "onBoostPercentChange", "percent", "", "onBoostStateChange", "boostState", "Lcom/tinder/boost/model/BoostState;", "showBoostEmptyLoadTooltip", "showPaywall", "subscribeToBoostChanges", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.boost.presenter.a */
public final class C8346a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public BoostButtonTarget f29640a;
    /* renamed from: b */
    private final C19573b f29641b = new C19573b();
    /* renamed from: c */
    private final C17356a f29642c = new C17356a();
    /* renamed from: d */
    private boolean f29643d;
    @NotNull
    /* renamed from: e */
    private BoostButtonView$AnalyticsSource f29644e = BoostButtonView$AnalyticsSource.UNKNOWN;
    /* renamed from: f */
    private final C2639c f29645f;
    /* renamed from: g */
    private final C8338a f29646g;
    /* renamed from: h */
    private final BoostUpdateProvider f29647h;
    /* renamed from: i */
    private final C8337b f29648i;
    /* renamed from: j */
    private final C10400d f29649j;
    /* renamed from: k */
    private final C10403e f29650k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "status", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$a */
    static final class C10429a<T> implements Consumer<TutorialViewStatus> {
        /* renamed from: a */
        final /* synthetic */ C8346a f34008a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.boost.presenter.a$a$1 */
        static final class C136421 implements Action0 {
            /* renamed from: a */
            public static final C136421 f43485a = new C136421();

            C136421() {
            }

            public final void call() {
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.boost.presenter.a$a$2 */
        static final class C136432<T> implements Action1<Throwable> {
            /* renamed from: a */
            public static final C136432 f43486a = new C136432();

            C136432() {
            }

            public /* synthetic */ void call(Object obj) {
                m53175a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m53175a(Throwable th) {
                C0001a.c(th, "Error activating boost.", new Object[0]);
            }
        }

        C10429a(C8346a c8346a) {
            this.f34008a = c8346a;
        }

        public /* synthetic */ void accept(Object obj) {
            m42306a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final void m42306a(TutorialViewStatus tutorialViewStatus) {
            if (tutorialViewStatus == TutorialViewStatus.UNSEEN) {
                this.f34008a.m35539f();
                this.f34008a.m35540a().enableBoostButton(true);
                return;
            }
            tutorialViewStatus = this.f34008a.f29645f.b();
            if (tutorialViewStatus == null) {
                C0001a.d("BoostState was null due to a race condition", new Object[0]);
                this.f34008a.m35540a().enableBoostButton(true);
            } else if (C8347b.f29651a[tutorialViewStatus.ordinal()] != 1) {
                this.f34008a.f29646g.m35509a().b(Schedulers.io()).a(C136421.f43485a, C136432.f43486a);
            } else {
                this.f34008a.m35540a().showBoostUpdateDialog(this.f34008a.f29647h.f());
                this.f34008a.m35540a().enableBoostButton(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/boost/presenter/BoostButtonPresenter$showPaywall$paywallFlow$1", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "(Lcom/tinder/boost/presenter/BoostButtonPresenter;)V", "handleSuccess", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$b */
    public static final class C10430b implements PaywallFlowSuccessListener {
        /* renamed from: a */
        final /* synthetic */ C8346a f34009a;

        C10430b(C8346a c8346a) {
            this.f34009a = c8346a;
        }

        public void handleSuccess() {
            this.f34009a.f29643d = false;
            this.f34009a.f29649j.m42286i();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/boost/presenter/BoostButtonPresenter$showPaywall$paywallFlow$2", "Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "(Lcom/tinder/boost/presenter/BoostButtonPresenter;)V", "handleFailure", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$c */
    public static final class C10431c implements PaywallFlowFailureListener {
        /* renamed from: a */
        final /* synthetic */ C8346a f34010a;

        C10431c(C8346a c8346a) {
            this.f34010a = c8346a;
        }

        public void handleFailure() {
            this.f34010a.f29643d = false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$d */
    static final class C13644d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13644d f43487a = new C13644d();

        C13644d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53176a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53176a(Throwable th) {
            C0001a.c(th, "Error on: boostUpdateProvider.multiplierObservable", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$e */
    static final class C13645e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13645e f43488a = new C13645e();

        C13645e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53177a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53177a(Throwable th) {
            C0001a.c(th, "Error on: boostUpdateProvider.percentObservable", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$f */
    static final class C13646f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13646f f43489a = new C13646f();

        C13646f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53178a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53178a(Throwable th) {
            C0001a.c(th, "Error on: boostStateProvider.observeBoostState", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.boost.presenter.a$g */
    static final class C13647g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13647g f43490a = new C13647g();

        C13647g() {
        }

        public /* synthetic */ void call(Object obj) {
            m53179a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53179a(Throwable th) {
            C0001a.c(th, "Error on: boostInteractor.observeCurrentBoostStatus", new Object[0]);
        }
    }

    @Inject
    public C8346a(@NotNull C2639c c2639c, @NotNull C8338a c8338a, @NotNull BoostUpdateProvider boostUpdateProvider, @NotNull C8337b c8337b, @NotNull C10400d c10400d, @NotNull C10403e c10403e) {
        C2668g.b(c2639c, "boostStateProvider");
        C2668g.b(c8338a, "activateBoost");
        C2668g.b(boostUpdateProvider, "boostUpdateProvider");
        C2668g.b(c8337b, "boostAnalyticsInteractor");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(c10403e, "checkBoostPaywallTutorial");
        this.f29645f = c2639c;
        this.f29646g = c8338a;
        this.f29647h = boostUpdateProvider;
        this.f29648i = c8337b;
        this.f29649j = c10400d;
        this.f29650k = c10403e;
    }

    @NotNull
    /* renamed from: a */
    public final BoostButtonTarget m35540a() {
        BoostButtonTarget boostButtonTarget = this.f29640a;
        if (boostButtonTarget == null) {
            C2668g.b("target");
        }
        return boostButtonTarget;
    }

    /* renamed from: a */
    public final void m35541a(@NotNull BoostButtonView$AnalyticsSource boostButtonView$AnalyticsSource) {
        C2668g.b(boostButtonView$AnalyticsSource, "<set-?>");
        this.f29644e = boostButtonView$AnalyticsSource;
    }

    @Take
    /* renamed from: b */
    public final void m35543b() {
        if (!this.f29641b.b()) {
            m35532a(null);
            C8346a c8346a = this;
            this.f29641b.a(this.f29647h.a().a(RxUtils.a()).a(new C13648d(new BoostButtonPresenter$subscribeToBoostChanges$1(c8346a)), C13644d.f43487a));
            this.f29641b.a(this.f29647h.c().a(RxUtils.a()).a(new C13648d(new BoostButtonPresenter$subscribeToBoostChanges$3(c8346a)), C13645e.f43488a));
            this.f29641b.a(this.f29645f.a().a(RxUtils.a()).a(new C13648d(new BoostButtonPresenter$subscribeToBoostChanges$5(c8346a)), C13646f.f43489a));
            this.f29641b.a(this.f29649j.m42283f().g().a(RxUtils.a()).a(new C13648d(new BoostButtonPresenter$subscribeToBoostChanges$7(c8346a)), C13647g.f43490a));
        }
    }

    @Drop
    /* renamed from: c */
    public final void m35544c() {
        this.f29641b.a();
        this.f29642c.a();
        BoostButtonTarget boostButtonTarget = this.f29640a;
        if (boostButtonTarget == null) {
            C2668g.b("target");
        }
        boostButtonTarget.removeBoostEmitterView();
    }

    /* renamed from: d */
    public final void m35545d() {
        if (this.f29644e == BoostButtonView$AnalyticsSource.UNKNOWN) {
            throw new IllegalStateException("Must set an valid analytics source!");
        }
        BoostButtonTarget boostButtonTarget = this.f29640a;
        if (boostButtonTarget == null) {
            C2668g.b("target");
        }
        boostButtonTarget.enableBoostButton(false);
        C3960g a = this.f29650k.execute().b(C15756a.b()).a(C15674a.a());
        Consumer c10429a = new C10429a(this);
        Function1 function1 = BoostButtonPresenter$handleBoostButtonClicked$2.f45101a;
        if (function1 != null) {
            function1 = new C10432c(function1);
        }
        this.f29642c.add(a.a(c10429a, (Consumer) function1));
    }

    /* renamed from: a */
    public final void m35542a(boolean z) {
        if (z && !this.f29649j.isUserBoosting()) {
            z = this.f29640a;
            if (!z) {
                C2668g.b("target");
            }
            z.showBoostYourProfileToolTip();
        }
    }

    /* renamed from: a */
    private final void m35524a(float f) {
        BoostButtonTarget boostButtonTarget = this.f29640a;
        if (boostButtonTarget == null) {
            C2668g.b("target");
        }
        boostButtonTarget.showBoostPercentFilled(f);
    }

    /* renamed from: a */
    private final void m35533a(String str) {
        BoostButtonTarget boostButtonTarget = this.f29640a;
        if (boostButtonTarget == null) {
            C2668g.b("target");
        }
        boostButtonTarget.showBoostMultiplierValue(str);
    }

    /* renamed from: e */
    private final void m35538e() {
        long c = this.f29649j.m42277c();
        if (c > 0) {
            BoostButtonTarget boostButtonTarget = this.f29640a;
            if (boostButtonTarget == null) {
                C2668g.b("target");
            }
            boostButtonTarget.attachBoostEmitterView(c);
        }
    }

    /* renamed from: a */
    private final void m35532a(BoostStatus boostStatus) {
        if (this.f29649j.isUserBoosting()) {
            this.f29647h.a(boostStatus, this.f29649j.m42285h());
            if (this.f29645f.b() != BoostState.ACTIVATED) {
                this.f29645f.a(BoostState.BOOSTING);
            }
        } else {
            this.f29645f.a(BoostState.INACTIVE);
        }
        if (boostStatus != null && this.f29649j.m42290m() != null) {
            this.f29649j.m42288k();
        }
    }

    /* renamed from: a */
    private final void m35525a(BoostState boostState) {
        BoostButtonTarget boostButtonTarget = this.f29640a;
        if (boostButtonTarget == null) {
            C2668g.b("target");
        }
        boostButtonTarget.enableBoostButton(true);
        if (boostState != null) {
            switch (C8347b.f29652b[boostState.ordinal()]) {
                case 1:
                    m35538e();
                    boostState = this.f29640a;
                    if (boostState == null) {
                        C2668g.b("target");
                    }
                    boostState.showBoostStartToolTip();
                    this.f29648i.m35503a(this.f29644e);
                    boostState = this.f29640a;
                    if (boostState == null) {
                        C2668g.b("target");
                    }
                    boostState.fadeMultiplierIn();
                    this.f29645f.a(BoostState.BOOSTING);
                    break;
                case 2:
                    m35539f();
                    break;
                case 3:
                case 4:
                    boostState = this.f29640a;
                    if (boostState == null) {
                        C2668g.b("target");
                    }
                    boostState.fadeMultiplierOut();
                    boostState = this.f29640a;
                    if (boostState == null) {
                        C2668g.b("target");
                    }
                    boostState.showEmptyGauge();
                    boostState = this.f29640a;
                    if (boostState == null) {
                        C2668g.b("target");
                    }
                    boostState.removeBoostEmitterView();
                    break;
                case 5:
                    m35538e();
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: f */
    private final void m35539f() {
        if (!this.f29643d) {
            this.f29643d = true;
            C10076o a = C10076o.m41167a((PaywallTypeSource) BoostPaywallSource.GAMEPAD_BOOST).m41170a((PaywallFlowSuccessListener) new C10430b(this)).m41169a((PaywallFlowFailureListener) new C10431c(this));
            BoostButtonTarget boostButtonTarget = this.f29640a;
            if (boostButtonTarget == null) {
                C2668g.b("target");
            }
            C2668g.a(a, "paywallFlow");
            boostButtonTarget.launchBoostPaywall(a);
        }
    }
}
