package com.tinder.fastmatch.presenter;

import android.support.annotation.UiThread;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10688g;
import com.tinder.data.fastmatch.usecase.C10770b;
import com.tinder.data.fastmatch.usecase.C10771d;
import com.tinder.data.fastmatch.usecase.C8651f;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.fastmatch.RefreshNotifier;
import com.tinder.domain.fastmatch.RefreshNotifier.SourceType;
import com.tinder.domain.fastmatch.newCount.usecase.ObserveNewCountUpdate;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.fastmatch.analytics.C11614b;
import com.tinder.fastmatch.analytics.C11615c;
import com.tinder.fastmatch.analytics.C11616d;
import com.tinder.fastmatch.analytics.C11618f;
import com.tinder.fastmatch.analytics.C9372g;
import com.tinder.fastmatch.analytics.LikesYouListEtlEventsFactory.PillResetSource;
import com.tinder.fastmatch.newcount.C9380a;
import com.tinder.fastmatch.newcount.C9383e;
import com.tinder.fastmatch.target.FastMatchRecsActivityTarget;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.gamepadcounters.C9671a;
import com.tinder.gamepadcounters.C9673c;
import com.tinder.managers.bk;
import com.tinder.module.FastMatchModule$FastMatchRecsEngine;
import com.tinder.utils.RxUtils;
import com.tinder.views.grid.presenter.C15460a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0002\u0010&J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00103\u001a\u000204H\u0002J\b\u00109\u001a\u000202H\u0007J\u0006\u0010:\u001a\u000202J\u0018\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0017J\b\u0010@\u001a\u000202H\u0007J\u0006\u0010A\u001a\u000202J\u0006\u0010B\u001a\u000202J\u0010\u0010C\u001a\u0002022\b\u0010D\u001a\u0004\u0018\u00010EJ\b\u0010F\u001a\u000202H\u0007J\u0010\u0010G\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\b\u0010H\u001a\u000202H\u0007J\b\u0010I\u001a\u000202H\u0007J\b\u0010J\u001a\u000202H\u0002J\b\u0010K\u001a\u000202H\u0007J\b\u0010L\u001a\u000202H\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchRecsActivityPresenter;", "Lcom/tinder/views/grid/presenter/RecsGridContainerPresenter;", "fastMatchRecsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "fetchFastMatchCount", "Lcom/tinder/data/fastmatch/usecase/FetchFastMatchCount;", "fetchFastMatchPreview", "Lcom/tinder/data/fastmatch/usecase/FetchFastMatchPreview;", "updateFastMatchCount", "Lcom/tinder/data/fastmatch/usecase/UpdateFastMatchCount;", "fastMatchSessionManager", "Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;", "addLikesYouListEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouListEvent;", "addLikesYouListExitEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouListExitEvent;", "addLikesYouPillChangeEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouPillChangeEvent;", "addLikesYouPillResetEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouPillResetEvent;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "observeNewCountUpdate", "Lcom/tinder/domain/fastmatch/newCount/usecase/ObserveNewCountUpdate;", "newCountUpdateScheduler", "Lcom/tinder/fastmatch/newcount/NewCountUpdateScheduler;", "refreshNotifier", "Lcom/tinder/domain/fastmatch/RefreshNotifier;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "fastMatchNewCountAbTestResolver", "Lcom/tinder/fastmatch/newcount/FastMatchNewCountAbTestResolver;", "gamepadCounterSessionController", "Lcom/tinder/gamepadcounters/GamepadCounterSessionController;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "(Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/data/fastmatch/usecase/FetchFastMatchCount;Lcom/tinder/data/fastmatch/usecase/FetchFastMatchPreview;Lcom/tinder/data/fastmatch/usecase/UpdateFastMatchCount;Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;Lcom/tinder/fastmatch/analytics/AddLikesYouListEvent;Lcom/tinder/fastmatch/analytics/AddLikesYouListExitEvent;Lcom/tinder/fastmatch/analytics/AddLikesYouPillChangeEvent;Lcom/tinder/fastmatch/analytics/AddLikesYouPillResetEvent;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/domain/fastmatch/newCount/usecase/ObserveNewCountUpdate;Lcom/tinder/fastmatch/newcount/NewCountUpdateScheduler;Lcom/tinder/domain/fastmatch/RefreshNotifier;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/fastmatch/newcount/FastMatchNewCountAbTestResolver;Lcom/tinder/gamepadcounters/GamepadCounterSessionController;Lcom/tinder/common/navigation/CurrentScreenNotifier;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "newCountSubscription", "Lrx/Subscription;", "target", "Lcom/tinder/fastmatch/target/FastMatchRecsActivityTarget;", "getTarget$Tinder_release", "()Lcom/tinder/fastmatch/target/FastMatchRecsActivityTarget;", "setTarget$Tinder_release", "(Lcom/tinder/fastmatch/target/FastMatchRecsActivityTarget;)V", "cacheAndLogCountForAnalytics", "", "count", "", "fetchPreviewIfNeeded", "Lrx/Completable;", "getNewCountValue", "", "handleOnBackPress", "handleOnCreate", "handleRecsEngineUpdate", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "notifyFastMatchAsCurrentScreen", "onPillTapped", "removeEngine", "showBoostButtonTooltipIfNecessary", "source", "Lcom/tinder/fastmatch/view/FastMatchRecsActivity$Source;", "startNewCountUpdateSubscriptionIfNecessary", "stopNewCountPollingIfNecessary", "subscribe", "subscribeToGamepadCounter", "subscribeToNewCountUpdate", "subscribeToRefresh", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.g */
public final class C11629g extends C15460a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FastMatchRecsActivityTarget f38054a;
    /* renamed from: b */
    private final C19573b f38055b = new C19573b();
    /* renamed from: c */
    private Subscription f38056c;
    /* renamed from: d */
    private final RecsEngine f38057d;
    /* renamed from: e */
    private final RecsEngineRegistry f38058e;
    /* renamed from: f */
    private final C10770b f38059f;
    /* renamed from: g */
    private final C10771d f38060g;
    /* renamed from: h */
    private final C8651f f38061h;
    /* renamed from: i */
    private final C9372g f38062i;
    /* renamed from: j */
    private final C11614b f38063j;
    /* renamed from: k */
    private final C11615c f38064k;
    /* renamed from: l */
    private final C11616d f38065l;
    /* renamed from: m */
    private final C11618f f38066m;
    /* renamed from: n */
    private final bk f38067n;
    /* renamed from: o */
    private final ObserveNewCountUpdate f38068o;
    /* renamed from: p */
    private final C9383e f38069p;
    /* renamed from: q */
    private final RefreshNotifier f38070q;
    /* renamed from: r */
    private final FastMatchConfigProvider f38071r;
    /* renamed from: s */
    private final C9380a f38072s;
    /* renamed from: t */
    private final C9673c f38073t;
    /* renamed from: u */
    private final CurrentScreenNotifier f38074u;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$a */
    static final class C13933a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C11629g f44058a;

        C13933a(C11629g c11629g) {
            this.f44058a = c11629g;
        }

        public final void call() {
            this.f44058a.f38062i.m39258j();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$b */
    static final class C13934b<T> implements Action1<C9671a> {
        /* renamed from: a */
        final /* synthetic */ C11629g f44059a;

        C13934b(C11629g c11629g) {
            this.f44059a = c11629g;
        }

        public /* synthetic */ void call(Object obj) {
            m53460a((C9671a) obj);
        }

        /* renamed from: a */
        public final void m53460a(C9671a c9671a) {
            if (c9671a.m40093d()) {
                this.f44059a.m47386a().animateBoostButtonCounter(c9671a.m40091b());
                this.f44059a.f38073t.m40116c();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$c */
    static final class C13935c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13935c f44060a = new C13935c();

        C13935c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53461a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53461a(Throwable th) {
            C0001a.c(th, "Error subscriping to gamepad counter info", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$d */
    static final class C13936d<T> implements Action1<Integer> {
        /* renamed from: a */
        final /* synthetic */ C11629g f44061a;

        C13936d(C11629g c11629g) {
            this.f44061a = c11629g;
        }

        public /* synthetic */ void call(Object obj) {
            m53462a((Integer) obj);
        }

        /* renamed from: a */
        public final void m53462a(Integer num) {
            this.f44061a.m47386a().popPillIfNeeded();
            FastMatchRecsActivityTarget a = this.f44061a.m47386a();
            C2668g.a(num, ManagerWebServices.FB_PARAM_FIELD_COUNT);
            a.showNewLikesCount(num.intValue(), this.f44061a.m47379c(num.intValue()));
            this.f44061a.m47377b(num.intValue());
            this.f44061a.m47375a((int) num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$e */
    static final class C13937e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13937e f44062a = new C13937e();

        C13937e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53463a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53463a(Throwable th) {
            C0001a.c(th, "Error observing fastmatch new count updates", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/fastmatch/RefreshNotifier$SourceType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$f */
    static final class C13938f<T> implements Action1<SourceType> {
        /* renamed from: a */
        final /* synthetic */ C11629g f44063a;

        C13938f(C11629g c11629g) {
            this.f44063a = c11629g;
        }

        public /* synthetic */ void call(Object obj) {
            m53464a((SourceType) obj);
        }

        /* renamed from: a */
        public final void m53464a(SourceType sourceType) {
            if (this.f44063a.f38072s.m39280a() != null) {
                if (RxUtils.a(this.f44063a.f38056c) == null) {
                    this.f44063a.m47384l();
                } else {
                    this.f44063a.m47386a().dismissPill();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.g$g */
    static final class C13939g<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13939g f44064a = new C13939g();

        C13939g() {
        }

        public /* synthetic */ void call(Object obj) {
            m53465a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53465a(Throwable th) {
            C0001a.c(th, "Error observing fastmatch new count pill refresh.", new Object[0]);
        }
    }

    @Inject
    public C11629g(@NotNull @FastMatchModule$FastMatchRecsEngine RecsEngine recsEngine, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull C10770b c10770b, @NotNull C10771d c10771d, @NotNull C8651f c8651f, @NotNull C9372g c9372g, @NotNull C11614b c11614b, @NotNull C11615c c11615c, @NotNull C11616d c11616d, @NotNull C11618f c11618f, @NotNull bk bkVar, @NotNull ObserveNewCountUpdate observeNewCountUpdate, @NotNull C9383e c9383e, @NotNull RefreshNotifier refreshNotifier, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull C9380a c9380a, @NotNull C9673c c9673c, @NotNull CurrentScreenNotifier currentScreenNotifier) {
        C11629g c11629g = this;
        RecsEngine recsEngine2 = recsEngine;
        RecsEngineRegistry recsEngineRegistry2 = recsEngineRegistry;
        C10770b c10770b2 = c10770b;
        C10771d c10771d2 = c10771d;
        C8651f c8651f2 = c8651f;
        C9372g c9372g2 = c9372g;
        C11614b c11614b2 = c11614b;
        C11615c c11615c2 = c11615c;
        C11616d c11616d2 = c11616d;
        C11618f c11618f2 = c11618f;
        bk bkVar2 = bkVar;
        ObserveNewCountUpdate observeNewCountUpdate2 = observeNewCountUpdate;
        C9383e c9383e2 = c9383e;
        RefreshNotifier refreshNotifier2 = refreshNotifier;
        FastMatchConfigProvider fastMatchConfigProvider2 = fastMatchConfigProvider;
        C9380a c9380a2 = c9380a;
        C2668g.b(recsEngine2, "fastMatchRecsEngine");
        C2668g.b(recsEngineRegistry2, "recsEngineRegistry");
        C2668g.b(c10770b2, "fetchFastMatchCount");
        C2668g.b(c10771d2, "fetchFastMatchPreview");
        C2668g.b(c8651f2, "updateFastMatchCount");
        C2668g.b(c9372g2, "fastMatchSessionManager");
        C2668g.b(c11614b2, "addLikesYouListEvent");
        C2668g.b(c11615c2, "addLikesYouListExitEvent");
        C2668g.b(c11616d2, "addLikesYouPillChangeEvent");
        C2668g.b(c11618f2, "addLikesYouPillResetEvent");
        C2668g.b(bkVar2, "managerSharedPreferences");
        C2668g.b(observeNewCountUpdate2, "observeNewCountUpdate");
        C2668g.b(c9383e2, "newCountUpdateScheduler");
        C2668g.b(refreshNotifier2, "refreshNotifier");
        C2668g.b(fastMatchConfigProvider2, "fastMatchConfigProvider");
        C2668g.b(c9380a, "fastMatchNewCountAbTestResolver");
        C2668g.b(c9673c, "gamepadCounterSessionController");
        C2668g.b(currentScreenNotifier, "currentScreenNotifier");
        C9380a c9380a3 = c9380a;
        this.f38057d = recsEngine2;
        this.f38058e = recsEngineRegistry2;
        this.f38059f = c10770b2;
        this.f38060g = c10771d2;
        this.f38061h = c8651f2;
        this.f38062i = c9372g2;
        this.f38063j = c11614b2;
        this.f38064k = c11615c2;
        this.f38065l = c11616d2;
        this.f38066m = c11618f2;
        this.f38067n = bkVar2;
        this.f38068o = observeNewCountUpdate2;
        this.f38069p = c9383e2;
        this.f38070q = refreshNotifier2;
        this.f38071r = fastMatchConfigProvider;
        this.f38072s = c9380a3;
        CurrentScreenNotifier currentScreenNotifier2 = currentScreenNotifier;
        this.f38073t = c9673c;
        this.f38074u = currentScreenNotifier2;
    }

    @NotNull
    /* renamed from: a */
    public final FastMatchRecsActivityTarget m47386a() {
        FastMatchRecsActivityTarget fastMatchRecsActivityTarget = this.f38054a;
        if (fastMatchRecsActivityTarget == null) {
            C2668g.b("target");
        }
        return fastMatchRecsActivityTarget;
    }

    /* renamed from: b */
    public final void m47389b() {
        this.f38062i.m39257i();
        this.f38059f.execute().a(RxUtils.a().b()).b(RxUtils.b());
        this.f38063j.execute().b(Schedulers.io()).b(RxUtils.b());
    }

    @Take
    /* renamed from: c */
    public final void m47390c() {
        this.f38055b.a(a(this.f38057d));
    }

    @Take
    /* renamed from: d */
    public final void m47391d() {
        if (this.f38072s.m39281b()) {
            this.f38055b.a(this.f38070q.observeRefresh().a(new C13938f(this), C13939g.f44064a));
        }
    }

    @Take
    /* renamed from: e */
    public final void m47392e() {
        if (this.f38072s.m39280a()) {
            m47384l();
        }
    }

    @Take
    /* renamed from: f */
    public final void m47393f() {
        this.f38073t.m40114a();
        this.f38055b.a(this.f38073t.m40118e().h().b(Schedulers.io()).a(C19397a.a()).a(new C13934b(this), C13935c.f44060a));
    }

    @Take
    /* renamed from: g */
    public final void m47394g() {
        this.f38074u.notify(C10688g.f35029a);
    }

    /* renamed from: l */
    private final void m47384l() {
        this.f38069p.m39290a();
        this.f38056c = this.f38068o.execute().a(C19397a.a()).a(new C13936d(this), C13937e.f44062a);
        this.f38055b.a(this.f38056c);
    }

    @Drop
    /* renamed from: h */
    public final void m47395h() {
        if (this.f38072s.m39280a()) {
            this.f38069p.m39292b();
        }
        this.f38055b.a();
    }

    /* renamed from: i */
    public final void m47396i() {
        this.f38058e.removeEngine(FastMatch.INSTANCE);
    }

    @UiThread
    /* renamed from: j */
    public final void m47397j() {
        this.f38062i.m39261m();
        Completable.c(new Completable[]{this.f38064k.execute(), m47385m()}).b(Schedulers.io()).d(new C13933a(this)).b(RxUtils.b());
        FastMatchRecsActivityTarget fastMatchRecsActivityTarget = this.f38054a;
        if (fastMatchRecsActivityTarget == null) {
            C2668g.b("target");
        }
        fastMatchRecsActivityTarget.dismiss();
    }

    /* renamed from: k */
    public final void m47398k() {
        this.f38069p.m39290a();
        this.f38070q.refresh(SourceType.TAP);
        this.f38066m.m47354a(PillResetSource.TAP);
    }

    /* renamed from: a */
    public final void m47388a(@Nullable Source source) {
        if (source == Source.MATCH_LIST_EMPTY || this.f38067n.X() == null) {
            this.f38067n.B(true);
            source = this.f38054a;
            if (source == null) {
                C2668g.b("target");
            }
            source.showBoostButtonTooltip();
        }
    }

    @UiThread
    /* renamed from: a */
    public void m47387a(@NotNull RecsLoadingStatus recsLoadingStatus, @NotNull RecsUpdate recsUpdate) {
        C2668g.b(recsLoadingStatus, "loadingStatus");
        C2668g.b(recsUpdate, "recsUpdate");
        if ((C2668g.a(recsLoadingStatus, NoMoreRecs.INSTANCE) ^ 1) == null) {
            this.f38061h.m36886a(recsUpdate.getCurrentRecs().size());
        }
    }

    /* renamed from: m */
    private final Completable m47385m() {
        if (this.f38062i.m39256h().m39273a() != 0) {
            return this.f38060g.execute();
        }
        Completable a = Completable.a();
        C2668g.a(a, "Completable.complete()");
        return a;
    }

    /* renamed from: a */
    private final void m47375a(int i) {
        FastMatchRecsActivityTarget fastMatchRecsActivityTarget = this.f38054a;
        if (fastMatchRecsActivityTarget == null) {
            C2668g.b("target");
        }
        fastMatchRecsActivityTarget.setNewLikesCount(i);
        this.f38062i.m39248a(i);
        this.f38065l.execute();
    }

    /* renamed from: b */
    private final void m47377b(int i) {
        if (i > this.f38071r.get().getNewCountRangeThreshold()) {
            this.f38069p.m39292b();
        }
    }

    /* renamed from: c */
    private final String m47379c(int i) {
        int newCountRangeThreshold = this.f38071r.get().getNewCountRangeThreshold();
        if (i > newCountRangeThreshold) {
            i = new StringBuilder();
            i.append("");
            i.append(newCountRangeThreshold);
            i.append('+');
            return i.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
