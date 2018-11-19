package com.tinder.toppicks.presenter;

import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10693l;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.TopPicksIntro;
import com.tinder.domain.profile.model.Tutorial.TopPicksTooltip;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.ClearAll;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import com.tinder.domain.toppicks.TopPicksScreenState;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.usecase.DeleteExpireTopPickTeasersUseCase;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksScreenState;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession;
import com.tinder.domain.toppicks.usecase.ResetScreenState;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.RecsExpired;
import com.tinder.toppicks.C15272i;
import com.tinder.toppicks.domain.p432a.C15252a;
import com.tinder.toppicks.p433e.C15254a;
import com.tinder.toppicks.target.TopPicksTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19297v;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\b\u0010!\u001a\u00020\"H\u0007J\b\u0010#\u001a\u00020\"H\u0007J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020\"H\u0007J\b\u0010(\u001a\u00020\"H\u0007J\b\u0010)\u001a\u00020\"H\u0007J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\"H\u0007J\u0006\u00101\u001a\u00020\"J\b\u00102\u001a\u00020\"H\u0007R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/toppicks/presenter/TopPicksPresenter;", "", "observeTopPicksScreenState", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;", "topPicksRefreshTimer", "Lcom/tinder/toppicks/TopPicksRefreshTimer;", "deleteExpireTopPickTeasersUseCase", "Lcom/tinder/domain/toppicks/usecase/DeleteExpireTopPickTeasersUseCase;", "observeTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "topPicksWorkerRegistryCoordinator", "Lcom/tinder/toppicks/usecase/TopPicksWorkerRegistryCoordinator;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "resetScreenState", "Lcom/tinder/domain/toppicks/usecase/ResetScreenState;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "getTopPicksIntroTutorial", "Lcom/tinder/toppicks/domain/usecase/GetTopPicksIntroTutorial;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;Lcom/tinder/toppicks/TopPicksRefreshTimer;Lcom/tinder/domain/toppicks/usecase/DeleteExpireTopPickTeasersUseCase;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/toppicks/usecase/TopPicksWorkerRegistryCoordinator;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/domain/toppicks/usecase/ResetScreenState;Lcom/tinder/common/navigation/CurrentScreenNotifier;Lcom/tinder/toppicks/domain/usecase/GetTopPicksIntroTutorial;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/toppicks/target/TopPicksTarget;", "getTarget", "()Lcom/tinder/toppicks/target/TopPicksTarget;", "setTarget", "(Lcom/tinder/toppicks/target/TopPicksTarget;)V", "checkTopPicksTooltipTutorialAsComplete", "", "clearSubscriptions", "confirmIntroModalViewed", "tutorial", "Lcom/tinder/domain/profile/model/Tutorial;", "notifyTopPicksAsCurrentScreen", "observeScreenState", "observeTopPicksSessionRefreshTimerChanges", "resolveScreenState", "screenState", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "scheduleTimerOrDeleteExpiredTeasers", "refreshTime", "Lorg/joda/time/DateTime;", "showIntroModalIfNecessary", "showTopPicksExhaustedGrid", "startTopPicksWorkerRegistryCoordinator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.m */
public final class C15292m {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TopPicksTarget f47435a;
    /* renamed from: b */
    private final C17356a f47436b = new C17356a();
    /* renamed from: c */
    private final ObserveTopPicksScreenState f47437c;
    /* renamed from: d */
    private final C15272i f47438d;
    /* renamed from: e */
    private final DeleteExpireTopPickTeasersUseCase f47439e;
    /* renamed from: f */
    private final ObserveTopPicksSession f47440f;
    /* renamed from: g */
    private final RecsEngineRegistry f47441g;
    /* renamed from: h */
    private final C15254a f47442h;
    /* renamed from: i */
    private final ConfirmTutorialsViewed f47443i;
    /* renamed from: j */
    private final ResetScreenState f47444j;
    /* renamed from: k */
    private final CurrentScreenNotifier f47445k;
    /* renamed from: l */
    private final C15252a f47446l;
    /* renamed from: m */
    private final SubscriptionProvider f47447m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$a */
    static final class C17091a implements Action {
        /* renamed from: a */
        public static final C17091a f52600a = new C17091a();

        C17091a() {
        }

        public final void run() {
            C0001a.b("Top picks tooltip marked as seen :)", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$b */
    static final class C17092b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17092b f52601a = new C17092b();

        C17092b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62968a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62968a(Throwable th) {
            C0001a.c(th, "Top picks tooltip failed to be marked as seen :(", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$c */
    static final class C17093c implements Action {
        /* renamed from: a */
        final /* synthetic */ C15292m f52602a;

        C17093c(C15292m c15292m) {
            this.f52602a = c15292m;
        }

        public final void run() {
            this.f52602a.m57414a().showTutorial();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$d */
    static final class C17094d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ Tutorial f52603a;

        C17094d(Tutorial tutorial) {
            this.f52603a = tutorial;
        }

        public /* synthetic */ void accept(Object obj) {
            m62969a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62969a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error confirming ");
            stringBuilder.append(this.f52603a);
            stringBuilder.append(" viewed");
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$e */
    static final class C17095e<T> implements Consumer<TopPicksScreenState> {
        /* renamed from: a */
        final /* synthetic */ C15292m f52604a;

        C17095e(C15292m c15292m) {
            this.f52604a = c15292m;
        }

        public /* synthetic */ void accept(Object obj) {
            m62970a((TopPicksScreenState) obj);
        }

        /* renamed from: a */
        public final void m62970a(TopPicksScreenState topPicksScreenState) {
            C15292m c15292m = this.f52604a;
            C2668g.a(topPicksScreenState, "it");
            c15292m.m57410a(topPicksScreenState);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$f */
    static final class C17096f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17096f f52605a = new C17096f();

        C17096f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62971a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62971a(Throwable th) {
            C0001a.c(th, "Error observing screen state.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$g */
    static final class C17097g<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17097g f52606a = new C17097g();

        C17097g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62972a((TopPicksSession) obj);
        }

        @NotNull
        /* renamed from: a */
        public final DateTime m62972a(@NotNull TopPicksSession topPicksSession) {
            C2668g.b(topPicksSession, "it");
            return topPicksSession.getRefreshTime();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$h */
    static final class C17098h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17098h f52607a = new C17098h();

        C17098h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62973a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62973a(Throwable th) {
            C0001a.c(th, "Error on topPicksRefreshTimer", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$i */
    static final class C17099i implements Action {
        /* renamed from: a */
        public static final C17099i f52608a = new C17099i();

        C17099i() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$j */
    static final class C17100j<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17100j f52609a = new C17100j();

        C17100j() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62974a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62974a(Throwable th) {
            C0001a.c(th, "Error deleting teasers", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/Tutorial$TopPicksIntro;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$k */
    static final class C17101k<T> implements Consumer<TopPicksIntro> {
        /* renamed from: a */
        final /* synthetic */ C15292m f52610a;

        C17101k(C15292m c15292m) {
            this.f52610a = c15292m;
        }

        public /* synthetic */ void accept(Object obj) {
            m62975a((TopPicksIntro) obj);
        }

        /* renamed from: a */
        public final void m62975a(TopPicksIntro topPicksIntro) {
            this.f52610a.m57414a().showIntroModal(topPicksIntro.getUrl());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$l */
    static final class C17102l<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17102l f52611a = new C17102l();

        C17102l() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62976a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62976a(Throwable th) {
            C0001a.c(th, "Error getting top picks intro tutorial", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "accept", "com/tinder/toppicks/presenter/TopPicksPresenter$showTopPicksExhaustedGrid$1$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$m */
    static final class C17103m<T> implements Consumer<RecsUpdate> {
        /* renamed from: a */
        final /* synthetic */ C15292m f52612a;

        C17103m(C15292m c15292m) {
            this.f52612a = c15292m;
        }

        public /* synthetic */ void accept(Object obj) {
            m62977a((RecsUpdate) obj);
        }

        /* renamed from: a */
        public final void m62977a(RecsUpdate recsUpdate) {
            List a = C19297v.m68737a(recsUpdate.getCurrentRecs(), TopPickTeaserRec.class);
            if ((recsUpdate.getCurrentRecs().size() >= 3 ? true : null) == null) {
                throw new IllegalStateException("Needs at least 3 teasers to show exhausted grid!".toString());
            }
            this.f52612a.m57414a().showGoldExhausted(C19299w.m68820d((Iterable) a, 3));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$n */
    static final class C17104n<T> implements Predicate<RecsUpdate> {
        /* renamed from: a */
        public static final C17104n f52613a = new C17104n();

        C17104n() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62978a((RecsUpdate) obj);
        }

        /* renamed from: a */
        public final boolean m62978a(@NotNull RecsUpdate recsUpdate) {
            C2668g.b(recsUpdate, "it");
            return (recsUpdate instanceof ClearAll) == null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.m$o */
    static final class C17105o<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17105o f52614a = new C17105o();

        C17105o() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62979a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62979a(Throwable th) {
            C0001a.c(th, "Error observing engine updates", new Object[0]);
        }
    }

    @Inject
    public C15292m(@NotNull ObserveTopPicksScreenState observeTopPicksScreenState, @NotNull C15272i c15272i, @NotNull DeleteExpireTopPickTeasersUseCase deleteExpireTopPickTeasersUseCase, @NotNull ObserveTopPicksSession observeTopPicksSession, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull C15254a c15254a, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull ResetScreenState resetScreenState, @NotNull CurrentScreenNotifier currentScreenNotifier, @NotNull C15252a c15252a, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(observeTopPicksScreenState, "observeTopPicksScreenState");
        C2668g.b(c15272i, "topPicksRefreshTimer");
        C2668g.b(deleteExpireTopPickTeasersUseCase, "deleteExpireTopPickTeasersUseCase");
        C2668g.b(observeTopPicksSession, "observeTopPicksSession");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(c15254a, "topPicksWorkerRegistryCoordinator");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(resetScreenState, "resetScreenState");
        C2668g.b(currentScreenNotifier, "currentScreenNotifier");
        C2668g.b(c15252a, "getTopPicksIntroTutorial");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f47437c = observeTopPicksScreenState;
        this.f47438d = c15272i;
        this.f47439e = deleteExpireTopPickTeasersUseCase;
        this.f47440f = observeTopPicksSession;
        this.f47441g = recsEngineRegistry;
        this.f47442h = c15254a;
        this.f47443i = confirmTutorialsViewed;
        this.f47444j = resetScreenState;
        this.f47445k = currentScreenNotifier;
        this.f47446l = c15252a;
        this.f47447m = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksTarget m57414a() {
        TopPicksTarget topPicksTarget = this.f47435a;
        if (topPicksTarget == null) {
            C2668g.b("target");
        }
        return topPicksTarget;
    }

    @Take
    /* renamed from: b */
    public final void m57416b() {
        this.f47442h.m57342a();
    }

    @Take
    /* renamed from: c */
    public final void m57417c() {
        this.f47436b.add(this.f47437c.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).d().a(new C17095e(this), C17096f.f52605a));
    }

    @Take
    /* renamed from: d */
    public final void m57418d() {
        this.f47436b.add(this.f47440f.execute().f(C17097g.f52606a).d().b(C15756a.m59010b()).a(new C17106o(new TopPicksPresenter$observeTopPicksSessionRefreshTimerChanges$2(this)), C17098h.f52607a));
    }

    @Take
    /* renamed from: e */
    public final void m57419e() {
        this.f47443i.execute(TopPicksTooltip.INSTANCE).b(C15756a.m59010b()).a(C17091a.f52600a, C17092b.f52601a);
    }

    @Take
    /* renamed from: f */
    public final void m57420f() {
        this.f47445k.notify(C10693l.f35034a);
    }

    @Take
    /* renamed from: g */
    public final void m57421g() {
        this.f47436b.add(this.f47446l.m57338a().b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C17101k(this), C17102l.f52611a));
    }

    @Drop
    /* renamed from: h */
    public final void m57422h() {
        this.f47436b.m63446a();
    }

    /* renamed from: i */
    public final void m57423i() {
        RecsEngine engine = this.f47441g.getEngine(TopPicks.INSTANCE);
        if (engine != null) {
            this.f47436b.add(RxJavaInteropExtKt.toV2Flowable(engine.observeRecsUpdates()).a(C17104n.f52613a).e().b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C17103m(this), C17105o.f52614a));
        }
    }

    /* renamed from: a */
    public final void m57415a(@NotNull Tutorial tutorial) {
        C2668g.b(tutorial, "tutorial");
        this.f47443i.execute(tutorial).b(C15756a.m59010b()).a(new C17093c(this), new C17094d(tutorial));
    }

    /* renamed from: a */
    private final void m57413a(DateTime dateTime) {
        if (dateTime.h() != null) {
            this.f47438d.m57381b();
            this.f47438d.m57380a();
            return;
        }
        this.f47444j.execute(RecsExpired.INSTANCE);
        this.f47436b.add(this.f47439e.execute().b(C15756a.m59010b()).a(C17099i.f52608a, C17100j.f52609a));
    }

    /* renamed from: a */
    private final void m57410a(TopPicksScreenState topPicksScreenState) {
        switch (C15293n.f47448a[topPicksScreenState.ordinal()]) {
            case 1:
                topPicksScreenState = this.f47435a;
                if (topPicksScreenState == null) {
                    C2668g.b("target");
                }
                topPicksScreenState.showGoldGrid();
                return;
            case 2:
                topPicksScreenState = this.f47435a;
                if (topPicksScreenState == null) {
                    C2668g.b("target");
                }
                topPicksScreenState.showRecsNotLoaded();
                return;
            case 3:
                topPicksScreenState = this.f47435a;
                if (topPicksScreenState == null) {
                    C2668g.b("target");
                }
                topPicksScreenState.showTeasersNotLoaded();
                return;
            case 4:
                topPicksScreenState = this.f47435a;
                if (topPicksScreenState == null) {
                    C2668g.b("target");
                }
                topPicksScreenState.showNonGoldGrid();
                return;
            case 5:
                topPicksScreenState = this.f47435a;
                if (topPicksScreenState == null) {
                    C2668g.b("target");
                }
                topPicksScreenState.showGoldExhausted();
                return;
            case 6:
                topPicksScreenState = this.f47435a;
                if (topPicksScreenState == null) {
                    C2668g.b("target");
                }
                topPicksScreenState.showEmpty();
                return;
            default:
                return;
        }
    }
}
