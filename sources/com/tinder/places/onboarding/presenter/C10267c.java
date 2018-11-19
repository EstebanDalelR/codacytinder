package com.tinder.places.onboarding.presenter;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.places.model.PlacesOnboardingConfig;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider.OnboardingProgress;
import com.tinder.domain.profile.model.Tutorial.PlacesOnboarding;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent.Source;
import com.tinder.places.analytics.AddPlacesOnboardingEvent;
import com.tinder.places.analytics.AddPlacesOnboardingEvent.Step;
import com.tinder.places.onboarding.PlacesOnboardingViewPager.C10251a;
import com.tinder.places.onboarding.p316b.C12396a;
import com.tinder.places.onboarding.target.PlacesOnboardingTarget;
import com.tinder.places.p311f.C12345i;
import com.tinder.places.p311f.C12345i.C10208b;
import com.tinder.places.provider.PlacesEnabledProvider;
import io.reactivex.C3957b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u001e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0'H\u0002J\u0014\u0010(\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\b\u0010,\u001a\u00020\u001cH\u0007J\b\u0010-\u001a\u00020\u001cH\u0007R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006."}, d2 = {"Lcom/tinder/places/onboarding/presenter/PlacesOnboardingPresenter;", "", "getOnboardingConfig", "Lcom/tinder/places/onboarding/usecase/GetOnboardingConfig;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "placesEnabledProvider", "Lcom/tinder/places/provider/PlacesEnabledProvider;", "addPlacesOnboardingEvent", "Lcom/tinder/places/analytics/AddPlacesOnboardingEvent;", "showPlacesErrorIfNeeded", "Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded;", "addPlacesManageEnabledEvent", "Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;", "placesOnboardingProgressProvider", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/places/onboarding/usecase/GetOnboardingConfig;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/places/provider/PlacesEnabledProvider;Lcom/tinder/places/analytics/AddPlacesOnboardingEvent;Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded;Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider;Lcom/tinder/core/experiment/AbTestUtility;)V", "pageChangeSubcsription", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/places/onboarding/target/PlacesOnboardingTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/onboarding/target/PlacesOnboardingTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/onboarding/target/PlacesOnboardingTarget;)V", "bindOnboardingConfig", "", "doNotEnablePlaces", "enablePlaces", "fireOnboardingAnalytics", "index", "", "learnMore", "showErrorIfNeeded", "throwable", "", "retryAction", "Lkotlin/Function0;", "subscribePageEntering", "enteringViews", "Lio/reactivex/Flowable;", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$ViewPagerProgress;", "subscribePagesChanges", "unsubscribePageChanges", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.presenter.c */
public final class C10267c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesOnboardingTarget f33387a;
    /* renamed from: b */
    private Disposable f33388b;
    /* renamed from: c */
    private final C12396a f33389c;
    /* renamed from: d */
    private final ConfirmTutorialsViewed f33390d;
    /* renamed from: e */
    private final PlacesEnabledProvider f33391e;
    /* renamed from: f */
    private final AddPlacesOnboardingEvent f33392f;
    /* renamed from: g */
    private final C12345i f33393g;
    /* renamed from: h */
    private final AddPlacesManageEnabledEvent f33394h;
    /* renamed from: i */
    private final PlacesOnboardingProgressProvider f33395i;
    /* renamed from: j */
    private final AbTestUtility f33396j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$c */
    static final class C12405c implements Action {
        /* renamed from: a */
        final /* synthetic */ C10267c f40051a;

        C12405c(C10267c c10267c) {
            this.f40051a = c10267c;
        }

        public final void run() {
            this.f40051a.f33395i.updateOnboardingProgress(OnboardingProgress.COMPLETE);
            this.f40051a.m41646a().completeOnboarding();
            this.f40051a.f33394h.m41308a(true, Source.ONBOARDING);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$d */
    static final class C12406d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10267c f40052a;

        C12406d(C10267c c10267c) {
            this.f40052a = c10267c;
        }

        public /* synthetic */ void accept(Object obj) {
            m48838a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48838a(Throwable th) {
            Integer num = null;
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                num = placesApiException.m37235a();
            }
            this.f40052a.f33394h.m41306a(num, Source.ONBOARDING);
            C10267c c10267c = this.f40052a;
            C2668g.a(th, "it");
            c10267c.m41643a(th, (Function0) new PlacesOnboardingPresenter$enablePlaces$2$1(this));
            C0001a.c(th, "Error confirming places tutorial", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$ViewPagerProgress;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$e */
    static final class C12407e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12407e f40053a = new C12407e();

        C12407e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(m48839a((C10251a) obj));
        }

        /* renamed from: a */
        public final int m48839a(@NotNull C10251a c10251a) {
            C2668g.b(c10251a, "it");
            return c10251a.m41634a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "page", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$f */
    static final class C12408f<T> implements Consumer<Integer> {
        /* renamed from: a */
        final /* synthetic */ C10267c f40054a;

        C12408f(C10267c c10267c) {
            this.f40054a = c10267c;
        }

        public /* synthetic */ void accept(Object obj) {
            m48840a((Integer) obj);
        }

        /* renamed from: a */
        public final void m48840a(Integer num) {
            C10267c c10267c = this.f40054a;
            C2668g.a(num, "page");
            c10267c.m41640a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$g */
    static final class C12409g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12409g f40055a = new C12409g();

        C12409g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48841a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48841a(Throwable th) {
            C0001a.c(th, "failed subscribePageEntering", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$a */
    static final class C14218a<T> implements Action1<PlacesOnboardingConfig> {
        /* renamed from: a */
        final /* synthetic */ C10267c f45067a;

        C14218a(C10267c c10267c) {
            this.f45067a = c10267c;
        }

        public /* synthetic */ void call(Object obj) {
            m53977a((PlacesOnboardingConfig) obj);
        }

        /* renamed from: a */
        public final void m53977a(PlacesOnboardingConfig placesOnboardingConfig) {
            if (this.f45067a.f33396j.isPlacesShortOnboardingEnabled()) {
                PlacesOnboardingTarget a = this.f45067a.m41646a();
                C2668g.a(placesOnboardingConfig, "it");
                a.bindShortOnboarding(placesOnboardingConfig);
                return;
            }
            a = this.f45067a.m41646a();
            C2668g.a(placesOnboardingConfig, "it");
            a.bind(placesOnboardingConfig);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.presenter.c$b */
    static final class C14219b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14219b f45068a = new C14219b();

        C14219b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53978a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53978a(Throwable th) {
            C0001a.c(th, "Places onboarding config error", new Object[0]);
        }
    }

    @Inject
    public C10267c(@NotNull C12396a c12396a, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull PlacesEnabledProvider placesEnabledProvider, @NotNull AddPlacesOnboardingEvent addPlacesOnboardingEvent, @NotNull C12345i c12345i, @NotNull AddPlacesManageEnabledEvent addPlacesManageEnabledEvent, @NotNull PlacesOnboardingProgressProvider placesOnboardingProgressProvider, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(c12396a, "getOnboardingConfig");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(placesEnabledProvider, "placesEnabledProvider");
        C2668g.b(addPlacesOnboardingEvent, "addPlacesOnboardingEvent");
        C2668g.b(c12345i, "showPlacesErrorIfNeeded");
        C2668g.b(addPlacesManageEnabledEvent, "addPlacesManageEnabledEvent");
        C2668g.b(placesOnboardingProgressProvider, "placesOnboardingProgressProvider");
        C2668g.b(abTestUtility, "abTestUtility");
        this.f33389c = c12396a;
        this.f33390d = confirmTutorialsViewed;
        this.f33391e = placesEnabledProvider;
        this.f33392f = addPlacesOnboardingEvent;
        this.f33393g = c12345i;
        this.f33394h = addPlacesManageEnabledEvent;
        this.f33395i = placesOnboardingProgressProvider;
        this.f33396j = abTestUtility;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesOnboardingTarget m41646a() {
        PlacesOnboardingTarget placesOnboardingTarget = this.f33387a;
        if (placesOnboardingTarget == null) {
            C2668g.b("target");
        }
        return placesOnboardingTarget;
    }

    @Take
    /* renamed from: b */
    public final void m41648b() {
        this.f33389c.m48818a("test").a(new C14218a(this), C14219b.f45068a);
    }

    @Take
    /* renamed from: c */
    public final void m41649c() {
        PlacesOnboardingTarget placesOnboardingTarget = this.f33387a;
        if (placesOnboardingTarget == null) {
            C2668g.b("target");
        }
        placesOnboardingTarget.setupPageEnteringObserver();
    }

    @Drop
    /* renamed from: d */
    public final void m41650d() {
        Disposable disposable = this.f33388b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: e */
    public final void m41651e() {
        this.f33391e.setPlacesEnabled(true).b(this.f33390d.execute(PlacesOnboarding.INSTANCE)).b(C15756a.b()).a(C15674a.a()).a(new C12405c(this), new C12406d(this));
        this.f33392f.m41310a(Step.LOCATION);
    }

    /* renamed from: f */
    public final void m41652f() {
        this.f33392f.m41310a(Step.SKIP);
        PlacesOnboardingTarget placesOnboardingTarget = this.f33387a;
        if (placesOnboardingTarget == null) {
            C2668g.b("target");
        }
        placesOnboardingTarget.cancelOnboarding();
    }

    /* renamed from: a */
    public final void m41647a(@NotNull C3957b<C10251a> c3957b) {
        C2668g.b(c3957b, "enteringViews");
        this.f33388b = c3957b.a(C15756a.b()).f(C12407e.f40053a).d().a(new C12408f(this), C12409g.f40055a);
    }

    /* renamed from: a */
    private final void m41640a(int i) {
        if (this.f33396j.isPlacesShortOnboardingEnabled()) {
            this.f33392f.m41310a(Step.INTRO_SHORT);
            return;
        }
        Step step;
        switch (i) {
            case 0:
                step = Step.INTRO_1;
                break;
            case 1:
                step = Step.INTRO_2;
                break;
            case 2:
                step = Step.INTRO_3;
                break;
            case 3:
                step = Step.INTRO_FINAL;
                break;
            default:
                step = 0;
                break;
        }
        if (step != 0) {
            this.f33392f.m41310a(step);
        }
    }

    /* renamed from: a */
    private final void m41643a(Throwable th, Function0<C15813i> function0) {
        this.f33393g.m48726a(new C10208b(th, new PlacesOnboardingPresenter$showErrorIfNeeded$request$1(this, function0)));
    }
}
