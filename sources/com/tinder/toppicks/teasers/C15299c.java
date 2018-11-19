package com.tinder.toppicks.teasers;

import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.injection.qualifiers.TimeIntervalMins;
import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProvider;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.domain.toppicks.usecase.DeleteExpireTopPickTeasersUseCase;
import com.tinder.domain.toppicks.usecase.GetTopPicksRefreshTime;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksTeasers;
import com.tinder.domain.toppicks.usecase.UpdateSessionAfterNonGoldTeasersEmpty;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.header.C15270a;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.collections.C19297v;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J \u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0002J\u0006\u0010\u001f\u001a\u00020 J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010#\u001a\u00020\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0002J \u0010(\u001a\u00020 2\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b0*H\u0002J \u0010+\u001a\u00020 2\u0016\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b0*H\u0002J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002J\u000e\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200J$\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010/\u001a\u000200J\b\u00103\u001a\u00020 H\u0002J\u0006\u00104\u001a\u00020 J\u000e\u00105\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/tinder/toppicks/teasers/TopPicksTeasersPresenter;", "", "syncTeaser", "Lcom/tinder/toppicks/teasers/SyncTopPicksTeasers;", "observeTopPicksTeasers", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksTeasers;", "topPicksCardsFactory", "Lcom/tinder/toppicks/header/TopPicksCardsFactory;", "topPicksExpirationTimeSynchronizer", "Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;", "getTopPicksRefreshTime", "Lcom/tinder/domain/toppicks/usecase/GetTopPicksRefreshTime;", "topPicksLoadingStatusProvider", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;", "timeIntervalMins", "Lio/reactivex/Observable;", "", "deleteExpiredTeasers", "Lcom/tinder/domain/toppicks/usecase/DeleteExpireTopPickTeasersUseCase;", "updateSessionAfterNonGoldTeasersEmpty", "Lcom/tinder/domain/toppicks/usecase/UpdateSessionAfterNonGoldTeasersEmpty;", "(Lcom/tinder/toppicks/teasers/SyncTopPicksTeasers;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksTeasers;Lcom/tinder/toppicks/header/TopPicksCardsFactory;Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;Lcom/tinder/domain/toppicks/usecase/GetTopPicksRefreshTime;Lcom/tinder/domain/toppicks/TopPicksLoadingStatusProvider;Lio/reactivex/Observable;Lcom/tinder/domain/toppicks/usecase/DeleteExpireTopPickTeasersUseCase;Lcom/tinder/domain/toppicks/usecase/UpdateSessionAfterNonGoldTeasersEmpty;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/toppicks/teasers/TopPickTeasersGridTarget;", "createViewModels", "", "Lcom/tinder/cardstack/model/Card;", "teasers", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "dropTarget", "", "getTeaserPicsForPaywall", "", "topPickTeaser", "allTeasers", "handleLoadingStatus", "status", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatus;", "observeForEmptyTeasersState", "sharedTeasersObs", "Lio/reactivex/Flowable;", "observeForNonEmptyTeasersState", "observeLoadingStatus", "observeTeasers", "showPaywallFromBottom", "source", "Lcom/tinder/paywall/legacy/GoldPaywallSource;", "showPaywallWithTeaser", "chosenTeaser", "startObservingTeaserRefreshTime", "syncTeasers", "takeTarget", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.teasers.c */
public final class C15299c {
    /* renamed from: a */
    private TopPickTeasersGridTarget f47460a;
    /* renamed from: b */
    private final C17356a f47461b = new C17356a();
    /* renamed from: c */
    private final C15298a f47462c;
    /* renamed from: d */
    private final ObserveTopPicksTeasers f47463d;
    /* renamed from: e */
    private final C15270a f47464e;
    /* renamed from: f */
    private final C15256e f47465f;
    /* renamed from: g */
    private final GetTopPicksRefreshTime f47466g;
    /* renamed from: h */
    private final TopPicksLoadingStatusProvider f47467h;
    /* renamed from: i */
    private final C3959e<Long> f47468i;
    /* renamed from: j */
    private final DeleteExpireTopPickTeasersUseCase f47469j;
    /* renamed from: k */
    private final UpdateSessionAfterNonGoldTeasersEmpty f47470k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/cardstack/model/Card;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$a */
    static final class C17118a<T> implements Predicate<List<? extends C8395a<?>>> {
        /* renamed from: a */
        public static final C17118a f52627a = new C17118a();

        C17118a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62987a((List) obj);
        }

        /* renamed from: a */
        public final boolean m62987a(@NotNull List<? extends C8395a<?>> list) {
            C2668g.b(list, "it");
            return C19297v.m68737a(list, C17117b.class).isEmpty();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/cardstack/model/Card;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$b */
    static final class C17119b<T> implements Consumer<List<? extends C8395a<?>>> {
        /* renamed from: a */
        final /* synthetic */ C15299c f52628a;

        C17119b(C15299c c15299c) {
            this.f52628a = c15299c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62988a((List) obj);
        }

        /* renamed from: a */
        public final void m62988a(List<? extends C8395a<?>> list) {
            this.f52628a.f47470k.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$c */
    static final class C17120c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17120c f52629a = new C17120c();

        C17120c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62989a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62989a(Throwable th) {
            C0001a.c(th, "Failed observing empty state for teasers", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/cardstack/model/Card;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$d */
    static final class C17121d<T> implements Predicate<List<? extends C8395a<?>>> {
        /* renamed from: a */
        public static final C17121d f52630a = new C17121d();

        C17121d() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62990a((List) obj);
        }

        /* renamed from: a */
        public final boolean m62990a(@NotNull List<? extends C8395a<?>> list) {
            C2668g.b(list, "it");
            return C19297v.m68737a(list, C17117b.class).isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "teasers", "", "Lcom/tinder/cardstack/model/Card;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$e */
    static final class C17122e<T> implements Consumer<List<? extends C8395a<?>>> {
        /* renamed from: a */
        final /* synthetic */ C15299c f52631a;

        C17122e(C15299c c15299c) {
            this.f52631a = c15299c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62991a((List) obj);
        }

        /* renamed from: a */
        public final void m62991a(List<? extends C8395a<?>> list) {
            TopPickTeasersGridTarget b = this.f52631a.f47460a;
            if (b != null) {
                C2668g.a(list, "teasers");
                b.insertCards(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$f */
    static final class C17123f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17123f f52632a = new C17123f();

        C17123f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62992a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62992a(Throwable th) {
            C0001a.c(th, "Error observing teasers.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$g */
    static final class C17124g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17124g f52633a = new C17124g();

        C17124g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62993a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62993a(Throwable th) {
            C0001a.c(th, "Error observing loading status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/cardstack/model/Card;", "it", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$h */
    static final class C17125h<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C15299c f52634a;

        C17125h(C15299c c15299c) {
            this.f52634a = c15299c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62994a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C8395a<?>> m62994a(@NotNull List<TopPickTeaser> list) {
            C2668g.b(list, "it");
            return this.f52634a.m57441a((List) list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/cardstack/model/Card;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$i */
    static final class C17126i<T> implements Consumer<List<? extends C8395a<?>>> {
        /* renamed from: a */
        final /* synthetic */ C15299c f52635a;

        C17126i(C15299c c15299c) {
            this.f52635a = c15299c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62995a((List) obj);
        }

        /* renamed from: a */
        public final void m62995a(List<? extends C8395a<?>> list) {
            list = this.f52635a.f47460a;
            if (list != null) {
                list.clearTeasers();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "apply", "(Ljava/lang/Long;)Lio/reactivex/Completable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$j */
    static final class C17127j<T, R> implements Function<Long, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C15299c f52636a;

        C17127j(C15299c c15299c) {
            this.f52636a = c15299c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62996a((Long) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m62996a(@NotNull Long l) {
            C2668g.b(l, "it");
            return this.f52636a.f47469j.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$k */
    static final class C17128k implements Action {
        /* renamed from: a */
        public static final C17128k f52637a = new C17128k();

        C17128k() {
        }

        public final void run() {
            C0001a.b("Check for expired teasers occurred", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$l */
    static final class C17129l<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17129l f52638a = new C17129l();

        C17129l() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62997a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62997a(Throwable th) {
            C0001a.c(th, "Failed while observing expiration time interval for teasers", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$m */
    static final class C17130m<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ C15299c f52639a;

        C17130m(C15299c c15299c) {
            this.f52639a = c15299c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62998a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m62998a(Disposable disposable) {
            disposable = this.f52639a.f47460a;
            if (disposable != null) {
                disposable.showPage(TopPicksTeasersView$Page.LOADING);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$n */
    static final class C17131n implements Action {
        /* renamed from: a */
        public static final C17131n f52640a = new C17131n();

        C17131n() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.c$o */
    static final class C17132o<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17132o f52641a = new C17132o();

        C17132o() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62999a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62999a(Throwable th) {
            C0001a.c(th, "Error syncing teasers", new Object[0]);
        }
    }

    @Inject
    public C15299c(@NotNull C15298a c15298a, @NotNull ObserveTopPicksTeasers observeTopPicksTeasers, @NotNull C15270a c15270a, @NotNull C15256e c15256e, @NotNull GetTopPicksRefreshTime getTopPicksRefreshTime, @NotNull TopPicksLoadingStatusProvider topPicksLoadingStatusProvider, @NotNull @TimeIntervalMins C3959e<Long> c3959e, @NotNull DeleteExpireTopPickTeasersUseCase deleteExpireTopPickTeasersUseCase, @NotNull UpdateSessionAfterNonGoldTeasersEmpty updateSessionAfterNonGoldTeasersEmpty) {
        C2668g.b(c15298a, "syncTeaser");
        C2668g.b(observeTopPicksTeasers, "observeTopPicksTeasers");
        C2668g.b(c15270a, "topPicksCardsFactory");
        C2668g.b(c15256e, "topPicksExpirationTimeSynchronizer");
        C2668g.b(getTopPicksRefreshTime, "getTopPicksRefreshTime");
        C2668g.b(topPicksLoadingStatusProvider, "topPicksLoadingStatusProvider");
        C2668g.b(c3959e, "timeIntervalMins");
        C2668g.b(deleteExpireTopPickTeasersUseCase, "deleteExpiredTeasers");
        C2668g.b(updateSessionAfterNonGoldTeasersEmpty, "updateSessionAfterNonGoldTeasersEmpty");
        this.f47462c = c15298a;
        this.f47463d = observeTopPicksTeasers;
        this.f47464e = c15270a;
        this.f47465f = c15256e;
        this.f47466g = getTopPicksRefreshTime;
        this.f47467h = topPicksLoadingStatusProvider;
        this.f47468i = c3959e;
        this.f47469j = deleteExpireTopPickTeasersUseCase;
        this.f47470k = updateSessionAfterNonGoldTeasersEmpty;
    }

    /* renamed from: a */
    public final void m57454a(@NotNull TopPickTeasersGridTarget topPickTeasersGridTarget) {
        C2668g.b(topPickTeasersGridTarget, "target");
        this.f47460a = topPickTeasersGridTarget;
        m57449d();
        m57450e();
        m57448c();
        this.f47465f.m57346a(this.f47466g.execute().getTime().getMillis());
    }

    /* renamed from: a */
    public final void m57451a() {
        this.f47461b.m63446a();
        this.f47465f.m57347b();
        this.f47460a = (TopPickTeasersGridTarget) null;
    }

    /* renamed from: a */
    public final void m57452a(@NotNull TopPickTeaser topPickTeaser, @NotNull List<TopPickTeaser> list, @NotNull GoldPaywallSource goldPaywallSource) {
        C2668g.b(topPickTeaser, "chosenTeaser");
        C2668g.b(list, "allTeasers");
        C2668g.b(goldPaywallSource, "source");
        TopPickTeasersGridTarget topPickTeasersGridTarget = this.f47460a;
        if (topPickTeasersGridTarget != null) {
            topPickTeasersGridTarget.showPaywall(m57439a(topPickTeaser, (List) list), goldPaywallSource);
        }
    }

    /* renamed from: a */
    public final void m57453a(@NotNull GoldPaywallSource goldPaywallSource) {
        C2668g.b(goldPaywallSource, "source");
        TopPickTeasersGridTarget topPickTeasersGridTarget = this.f47460a;
        if (topPickTeasersGridTarget != null) {
            TopPickTeasersGridTarget$a.m57430a(topPickTeasersGridTarget, null, goldPaywallSource, 1, null);
        }
    }

    /* renamed from: c */
    private final void m57448c() {
        this.f47461b.add(this.f47468i.subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).flatMapCompletable(new C17127j(this)).a(C17128k.f52637a, C17129l.f52638a));
    }

    /* renamed from: a */
    private final List<String> m57439a(TopPickTeaser topPickTeaser, List<TopPickTeaser> list) {
        topPickTeaser = am.m64179b(topPickTeaser.getPhotoUrl());
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            TopPickTeaser topPickTeaser2 = (TopPickTeaser) next;
            if ((topPickTeaser.size() < 3 ? 1 : null) == null) {
                break;
            }
            arrayList.add(next);
        }
        Iterable<TopPickTeaser> iterable2 = arrayList;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
        for (TopPickTeaser photoUrl : iterable2) {
            arrayList2.add(Boolean.valueOf(topPickTeaser.add(photoUrl.getPhotoUrl())));
        }
        list = (List) arrayList2;
        return C19299w.m68840l((Iterable) topPickTeaser);
    }

    /* renamed from: d */
    private final void m57449d() {
        C3957b m = this.f47463d.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).f(new C17125h(this)).a(new C17126i(this)).m();
        C2668g.a(m, "sharedTeasersObs");
        m57444a(m);
        m57446b(m);
    }

    /* renamed from: a */
    private final void m57444a(C3957b<List<C8395a<?>>> c3957b) {
        this.f47461b.add(c3957b.a(C17121d.f52630a).a(new C17122e(this), C17123f.f52632a));
    }

    /* renamed from: b */
    private final void m57446b(C3957b<List<C8395a<?>>> c3957b) {
        this.f47461b.add(c3957b.a(C17118a.f52627a).a(new C17119b(this), C17120c.f52629a));
    }

    /* renamed from: e */
    private final void m57450e() {
        this.f47461b.add(this.f47467h.observeLoadingStatus().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C17133e(new TopPicksTeasersPresenter$observeLoadingStatus$1(this)), C17124g.f52633a));
    }

    /* renamed from: b */
    public final void m57455b() {
        this.f47461b.add(this.f47462c.m57437a().b(C15756a.m59010b()).a(C15674a.m58830a()).b(new C17130m(this)).a(C17131n.f52640a, C17132o.f52641a));
    }

    /* renamed from: a */
    private final void m57442a(TopPicksLoadingStatus topPicksLoadingStatus) {
        switch (C15300d.f47471a[topPicksLoadingStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                topPicksLoadingStatus = this.f47460a;
                if (topPicksLoadingStatus != null) {
                    topPicksLoadingStatus.showPage(TopPicksTeasersView$Page.LOADING);
                    return;
                }
                return;
            case 4:
            case 5:
                topPicksLoadingStatus = this.f47460a;
                if (topPicksLoadingStatus != null) {
                    topPicksLoadingStatus.showPage(TopPicksTeasersView$Page.ERROR);
                    return;
                }
                return;
            case 6:
                topPicksLoadingStatus = this.f47460a;
                if (topPicksLoadingStatus != null) {
                    topPicksLoadingStatus.showPage(TopPicksTeasersView$Page.GRID);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final List<C8395a<?>> m57441a(List<TopPickTeaser> list) {
        Collection a = C15807n.m59826a(C15270a.m57373a(this.f47464e, false, 1, null));
        Iterable<TopPickTeaser> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (TopPickTeaser a2 : iterable) {
            arrayList.add(this.f47464e.m57375a(a2));
        }
        return C19299w.m68809b(a, (Iterable) (List) arrayList);
    }
}
