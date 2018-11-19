package com.tinder.toppicks.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProvider;
import com.tinder.domain.toppicks.TopPicksScreenState;
import com.tinder.domain.toppicks.usecase.GetTopPicksSession;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksScreenState;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.toppicks.view.TopPicksGoldTarget;
import com.tinder.toppicks.view.TopPicksGoldView$Page;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0007J\b\u0010\u001a\u001a\u00020\u0012H\u0007J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/toppicks/presenter/TopPicksGoldPresenter;", "", "observeTopPicksScreenState", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;", "getTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/GetTopPicksSession;", "topPicksLoadingStatusProvider", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;", "(Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;Lcom/tinder/domain/toppicks/usecase/GetTopPicksSession;Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/toppicks/view/TopPicksGoldTarget;", "getTarget", "()Lcom/tinder/toppicks/view/TopPicksGoldTarget;", "setTarget", "(Lcom/tinder/toppicks/view/TopPicksGoldTarget;)V", "bindStatus", "", "status", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;", "dispose", "handleScreenStateChanged", "topPicksScreenState", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "observeLoadingStatus", "observeScreenState", "processPaywallLanuch", "source", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.a */
public final class C15284a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TopPicksGoldTarget f47418a;
    /* renamed from: b */
    private final C17356a f47419b = new C17356a();
    /* renamed from: c */
    private final ObserveTopPicksScreenState f47420c;
    /* renamed from: d */
    private final GetTopPicksSession f47421d;
    /* renamed from: e */
    private final TopPicksLoadingStatusProvider f47422e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.a$a */
    static final class C17053a<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17053a f52522a = new C17053a();

        C17053a() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62862a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62862a(Throwable th) {
            C0001a.c(th, "Error observing loading status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.a$b */
    static final class C17054b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17054b f52523a = new C17054b();

        C17054b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62863a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62863a(Throwable th) {
            C0001a.c(th, "Error observing screen state.", new Object[0]);
        }
    }

    @Inject
    public C15284a(@NotNull ObserveTopPicksScreenState observeTopPicksScreenState, @NotNull GetTopPicksSession getTopPicksSession, @NotNull TopPicksLoadingStatusProvider topPicksLoadingStatusProvider) {
        C2668g.b(observeTopPicksScreenState, "observeTopPicksScreenState");
        C2668g.b(getTopPicksSession, "getTopPicksSession");
        C2668g.b(topPicksLoadingStatusProvider, "topPicksLoadingStatusProvider");
        this.f47420c = observeTopPicksScreenState;
        this.f47421d = getTopPicksSession;
        this.f47422e = topPicksLoadingStatusProvider;
    }

    @Take
    /* renamed from: a */
    public final void m57398a() {
        this.f47419b.add(this.f47420c.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).d().a(new C17055c(new TopPicksGoldPresenter$observeScreenState$1(this)), C17054b.f52523a));
    }

    @Take
    /* renamed from: b */
    public final void m57400b() {
        this.f47419b.add(this.f47422e.observeLoadingStatus().distinctUntilChanged().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C17055c(new TopPicksGoldPresenter$observeLoadingStatus$1(this)), C17053a.f52522a));
    }

    /* renamed from: a */
    public final void m57399a(@NotNull TopPicksPaywallSource topPicksPaywallSource) {
        C2668g.b(topPicksPaywallSource, "source");
        if (this.f47421d.execute().getHasTpsAvailableForPurchase()) {
            TopPicksGoldTarget topPicksGoldTarget = this.f47418a;
            if (topPicksGoldTarget == null) {
                C2668g.b("target");
            }
            topPicksGoldTarget.showPaywall(topPicksPaywallSource);
            return;
        }
        topPicksPaywallSource = this.f47418a;
        if (topPicksPaywallSource == null) {
            C2668g.b("target");
        }
        topPicksPaywallSource.showPaywall(TopPicksPaywallSource.TOP_PICKS_NOT_AVAILABLE);
    }

    @Drop
    /* renamed from: c */
    public final void m57401c() {
        this.f47419b.m63446a();
    }

    /* renamed from: a */
    private final void m57395a(TopPicksScreenState topPicksScreenState) {
        if (C15285b.f47423a[topPicksScreenState.ordinal()] != 1) {
            topPicksScreenState = this.f47418a;
            if (topPicksScreenState == null) {
                C2668g.b("target");
            }
            topPicksScreenState.dismissBottomBar();
            return;
        }
        topPicksScreenState = this.f47418a;
        if (topPicksScreenState == null) {
            C2668g.b("target");
        }
        topPicksScreenState.showBottomBar();
    }

    /* renamed from: a */
    private final void m57394a(TopPicksLoadingStatus topPicksLoadingStatus) {
        switch (C15285b.f47424b[topPicksLoadingStatus.ordinal()]) {
            case 1:
            case 2:
                topPicksLoadingStatus = this.f47418a;
                if (topPicksLoadingStatus == null) {
                    C2668g.b("target");
                }
                topPicksLoadingStatus.showPage(TopPicksGoldView$Page.GRID);
                return;
            case 3:
            case 4:
                topPicksLoadingStatus = this.f47418a;
                if (topPicksLoadingStatus == null) {
                    C2668g.b("target");
                }
                topPicksLoadingStatus.showPage(TopPicksGoldView$Page.LOADING);
                return;
            case 5:
                topPicksLoadingStatus = this.f47418a;
                if (topPicksLoadingStatus == null) {
                    C2668g.b("target");
                }
                topPicksLoadingStatus.showPaginatedError();
                return;
            case 6:
                topPicksLoadingStatus = this.f47418a;
                if (topPicksLoadingStatus == null) {
                    C2668g.b("target");
                }
                topPicksLoadingStatus.showPage(TopPicksGoldView$Page.ERROR);
                return;
            default:
                return;
        }
    }
}
